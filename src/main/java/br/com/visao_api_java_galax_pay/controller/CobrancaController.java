package br.com.visao_api_java_galax_pay.controller;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

import br.com.visao.api_java_galax_pay.vo.CobrancaVO;
import br.com.visao.api_java_galax_pay.vo.MetodoPgtoPixVO;
import br.com.visao.api_java_galax_pay.vo.ParticipanteEmail;
import br.com.visao.api_java_galax_pay.vo.ParticipanteFones;
import br.com.visao.api_java_galax_pay.vo.ParticipanteVO;

/**
 *
 * @author WILTON OLIVEIRA
 */
public class CobrancaController {
	
	//Metodo que popula os dados da cobrança
    private CobrancaVO insereDadosCobranca() {

        java.sql.Date dataSql = new java.sql.Date(new Date().getTime());

        CobrancaVO cob = new CobrancaVO();
        cob.setMyId("52887");
        cob.setValue(1010); //Valor em centavos
        cob.setAdditionalInfo("VENDA 52887");
        cob.setPayday(dataSql.toString());
        cob.setPayedOutsideGalaxPay(false);
        cob.setMainPaymentMethodId("pix");

        ParticipanteVO participante = new ParticipanteVO();

        participante.setMyId("1");
        participante.setName("CONSUMIDOR");
        participante.setDocument("65324441970");

        //Adicionando lista de emails do participante
        List<ParticipanteEmail> listaDeEmail = new ArrayList<ParticipanteEmail>();
        ParticipanteEmail email = new ParticipanteEmail();
        email.setEmails("teste5260email4899@galaxpay.com.br");
        listaDeEmail.add(email);
        participante.setEmail(listaDeEmail);

        //Adicionando lista de telefones do participante
        List<ParticipanteFones> listaDeTelefones = new ArrayList<ParticipanteFones>();
        ParticipanteFones fones = new ParticipanteFones();
        fones.setPhones("31983890110");
        listaDeTelefones.add(fones);
        participante.setPhones(listaDeTelefones);

        MetodoPgtoPixVO metodoPgtoPix = new MetodoPgtoPixVO();
        metodoPgtoPix.setFine(0);
        metodoPgtoPix.setInterest(0);
        metodoPgtoPix.setInstructions("");
        metodoPgtoPix.setType("days");
        metodoPgtoPix.setValue(1);

        cob.setMetoPgtoPix(metodoPgtoPix);

        cob.setParticipante(participante);

        return cob;
    }

    //Metodo que pega os dados da cobranca e passa para JSON
    public String geraCobranca() {

        CobrancaVO cob = insereDadosCobranca();

        JSONObject dvenda = new JSONObject();

        try {
            JSONObject participante = new JSONObject();
            JSONObject metodoPgto = new JSONObject();
            JSONObject prazo = new JSONObject();

            dvenda.put("myId", cob.getMyId());
            dvenda.put("value", 0);
            dvenda.put("additionalInfo", cob.getAdditionalInfo());
            dvenda.put("payday", cob.getPayday());
            dvenda.put("payedOutsideGalaxPay", cob.getPayedOutsideGalaxPay());
            dvenda.put("mainPaymentMethodId", cob.getMainPaymentMethodId());

            participante.put("myId", cob.getParticipante().getMyId());
            participante.put("name", cob.getParticipante().getName());
            participante.put("document", cob.getParticipante().getDocument());
            participante.put("emails", cob.getParticipante().getEmail());
            participante.put("phones", cob.getParticipante().getPhones());

            metodoPgto.put("fine", cob.getMetoPgtoPix().getFine());
            metodoPgto.put("interest", cob.getMetoPgtoPix().getInterest());
            metodoPgto.put("instructions", cob.getMetoPgtoPix().getInstructions());

            prazo.put("type", cob.getMetoPgtoPix().getType());
            prazo.put("value", cob.getMetoPgtoPix().getValue());

            
            metodoPgto.put("Deadline", prazo);
            dvenda.put("Customer", participante);
            dvenda.put("PaymentMethodPix", metodoPgto);
            

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dvenda.toString();

    }

}
