/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.API_GALAXPAY;

import java.io.Serializable;

/**
 *
 * @author WILTON OLIVEIRA
 */
public class ParticipanteEnderecoVO implements Serializable {

//    "Address": {
//      "zipCode": "30411330",          [CEP. Informe apenas números.]
//      "street": "Rua platina",        [Logradouro.]
//      "number": "1330",               [Número.]
//      "complement": "2º andar",       [Complemento.]
//      "neighborhood": "Prado",        [Bairro.]
//      "city": "Belo Horizonte",       [Cidade.]
//      "state": "MG"                   [Estado.]
//    }
    String zipCode;
    String street;
    String number;
    String complement;
    String neighborhood;
    String city;
    String state;

    public ParticipanteEnderecoVO() {
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
