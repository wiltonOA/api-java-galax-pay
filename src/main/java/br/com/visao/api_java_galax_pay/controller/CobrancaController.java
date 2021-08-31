/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.API_GALAXPAY;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author WILTON OLIVEIRA
 */
public class CobrancaController {

    public String insereDadosCobranca() {
        String json = "";
        try {
            java.sql.Date dataSql = new java.sql.Date(new Date().getTime());

            CobrancaVO cob = new CobrancaVO();
            cob.setMyId("1773225");
            cob.setValue(1165); //Valor em centavos
            cob.setAdditionalInfo("VENDA 5288RR299");
            cob.setPayday(dataSql.toString());
            cob.setPayedOutsideGalaxPay(false);
            cob.setMainPaymentMethodId("boleto");

            ParticipanteVO participante = new ParticipanteVO();

            participante.setMyId("1");
            participante.setName("CONSUMIDOR");
            participante.setDocument("65324441970");

            //Adicionando lista de emails do participante
            List<String> listaDeEmail = new ArrayList<>();
            listaDeEmail.add("teste5260email4899@galaxpay.com.br");
            listaDeEmail.add("teste52602email4899@galaxpay.com.br");
            
            participante.setEmail(listaDeEmail);


            //Adicionando lista de telefones do participante
            List<String> listaDeTelefones = new ArrayList<>();
            listaDeTelefones.add("3140201512");
            listaDeTelefones.add("31983890110");
            participante.setPhones(listaDeTelefones);

            PagamentoMetodoBoletoVO metodoPgtoBoleto = new PagamentoMetodoBoletoVO();
            metodoPgtoBoleto.setFine(0);
            metodoPgtoBoleto.setInterest(0);
            metodoPgtoBoleto.setInstructions("Teste de emissão de boletoPIX");
            metodoPgtoBoleto.setDeadlineDays(59);


            cob.setMetoPgtoPix(metodoPgtoBoleto);
            cob.setParticipante(participante);

            Gson gson = new Gson();
            json = gson.toJson(cob);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return json;
    }

}
