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
public class MetodoPgtoPixVO implements Serializable{
    
//    "PaymentMethodPix": {
//        "fine": 0,
//        "interest": 0,
//        "instructions": "Lorem ipsum dolor sit amet.",
//        "Deadline": {
//            "type": "days",
//            "value": 1
//        }
    
    private Integer fine;
    private Integer interest;
    private String instructions;
    private String type;
    private Integer value;

    public MetodoPgtoPixVO() {
    }

    public Integer getFine() {
        return fine;
    }

    public void setFine(Integer fine) {
        this.fine = fine;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
    
    
}
