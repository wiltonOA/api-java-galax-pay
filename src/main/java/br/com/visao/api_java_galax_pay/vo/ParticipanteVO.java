package br.com.visao.api_java_galax_pay.vo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author WILTON
 */
public class ParticipanteVO implements Serializable{
    
//    "Customer": {
//        "myId": "1",
//        "name": "CONSUMIDOR",
//        "document": "65324441970",
//        "emails": [
//            "teste5260email4899@galaxpay.com.br"
//        ],
//        "phones": [
//            31983890110
//        ]
//    }
    
    private String myId;
    private String name;
    private String document;
    private List<ParticipanteEmail> email;
    private List<ParticipanteFones> phones;

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public List<ParticipanteEmail> getEmail() {
        return email;
    }

    public void setEmail(List<ParticipanteEmail> email) {
        this.email = email;
    }

    public List<ParticipanteFones> getPhones() {
        return phones;
    }

    public void setPhones(List<ParticipanteFones> phones) {
        this.phones = phones;
    }

    
}
