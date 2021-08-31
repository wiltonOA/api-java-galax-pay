/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.API_GALAXPAY;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author WILTON OLIVEIRA
 */
public class ParticipanteVO implements Serializable {

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
    private List<String> emails;
    private List<String> phones;
    private ParticipanteEnderecoVO Address;

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

    public List<String> getEmail() {
        return emails;
    }

    public void setEmail(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public ParticipanteEnderecoVO getAddress() {
        return Address;
    }

    public void setAddress(ParticipanteEnderecoVO Address) {
        this.Address = Address;
    }

}
