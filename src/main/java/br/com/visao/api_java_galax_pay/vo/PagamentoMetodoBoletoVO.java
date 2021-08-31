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
public class PagamentoMetodoBoletoVO implements Serializable{
    
//"PaymentMethodBoleto": {
//    "fine": 100,                                      [Percentual de multa, com dois decimais sem o separador]
//    "interest": 200,                                  [Percentual de juros, com dois decimais sem o separador.]
//    "instructions": "Lorem ipsum dolor sit amet.",    [Instruções do boleto.]
//    "deadlineDays": 1                                 [Quantidade de dias que o boleto pode ser pago após o vencimento.]
//  }
    
    private Integer fine;
    private Integer interest;
    private String instructions;
    private Integer deadlineDays;
    

    public PagamentoMetodoBoletoVO() {
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

    public Integer getDeadlineDays() {
        return deadlineDays;
    }

    public void setDeadlineDays(Integer deadlineDays) {
        this.deadlineDays = deadlineDays;
    }
    
    
    
}
