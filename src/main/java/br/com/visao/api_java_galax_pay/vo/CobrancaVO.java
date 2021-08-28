package br.com.visao.api_java_galax_pay.vo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author WILTON
 */
public class CobrancaVO implements Serializable{
//    "myId": "52881",
//    "value": 10,
//    "additionalInfo": "VENDA 52881",
//    "payday": "2021-08-27",
//    "payedOutsideGalaxPay": false,
//    "mainPaymentMethodId": "pix",
    
    private String myId;
    private Integer value;
    private String additionalInfo;
    private String payday;
    private ParticipanteVO participante;
    private Boolean payedOutsideGalaxPay;
    private String mainPaymentMethodId;
    private MetodoPgtoPixVO metoPgtoPix;
    
    

    public CobrancaVO() {
    }

    public MetodoPgtoPixVO getMetoPgtoPix() {
        return metoPgtoPix;
    }

    public void setMetoPgtoPix(MetodoPgtoPixVO metoPgtoPix) {
        this.metoPgtoPix = metoPgtoPix;
    }

    public ParticipanteVO getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipanteVO participante) {
        this.participante = participante;
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getPayday() {
        return payday;
    }

    public void setPayday(String payday) {
        this.payday = payday;
    }

    public Boolean getPayedOutsideGalaxPay() {
        return payedOutsideGalaxPay;
    }

    public void setPayedOutsideGalaxPay(Boolean payedOutsideGalaxPay) {
        this.payedOutsideGalaxPay = payedOutsideGalaxPay;
    }

    public String getMainPaymentMethodId() {
        return mainPaymentMethodId;
    }

    public void setMainPaymentMethodId(String mainPaymentMethodId) {
        this.mainPaymentMethodId = mainPaymentMethodId;
    }
    
}
