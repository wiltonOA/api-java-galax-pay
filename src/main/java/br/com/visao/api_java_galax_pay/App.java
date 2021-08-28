package br.com.visao.api_java_galax_pay;
import br.com.visao.api_java_galax_pay.controller.CobrancaController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WILTON
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        String token = new Autentica().geraToken();
        System.err.println("TOKEN: "+token);

       String cobranca = new CobrancaController().geraCobranca();   
       System.err.println("COBRANCA:"+cobranca);
       
       String cobrancaGerada = new EnviaCobrancaAPI().EnviaCobranca(token, cobranca);
       System.err.println("RETORNO: "+cobrancaGerada);
    }

}
