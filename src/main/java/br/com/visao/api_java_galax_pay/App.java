/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.API_GALAXPAY;

/**
 *
 * @author WILTON OLIVEIRA
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String token = new Autentica().geraToken();
        System.out.println("TOKEN: " + token);

        String cobranca = new CobrancaController().insereDadosCobranca();
        System.out.println("COBRANCA:" + cobranca);

        String cobrancaGerada = new EnviaCobrancaAPI().EnviaCobranca(token, cobranca);
        System.out.println("RETORNO: " + cobrancaGerada);
    }

}
