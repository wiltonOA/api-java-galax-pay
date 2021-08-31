/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.API_GALAXPAY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.Base64;
import org.json.JSONObject;
import javax.net.ssl.HttpsURLConnection;


/**
 *
 * @author WILTON OLIVEIRA
 */
public class Autentica {
    
    //DADOS SANDBOX
    //GALAX ID: 5473
    //GALAX HASH: 83Mw5u8988Qj6fZqS4Z8K7LzOo1j28S706R0BeFe

    private final String client_id = "5473";
    private final String client_secret = "83Mw5u8988Qj6fZqS4Z8K7LzOo1j28S706R0BeFe";
    private final String basicAuth = Base64.getEncoder().encodeToString(((client_id + ':' + client_secret).getBytes()));
    
    //66716bf7f4021097c378a2745cec9442d07ea6c3

    public String geraToken() {
        String access_token = "";
        
        System.err.println("BASE64: "+basicAuth);
        try {

            URL url = new URL("https://api.sandbox.cloud.galaxpay.com.br/v2/token"); //        
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.addRequestProperty("User-Agent", "API Software ERP");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Authorization", "Basic " + basicAuth);
            
            String input = "{\r\n\"grant_type\": \"authorization_code\",\r\n\"scope\": \"customers.read customers.write plans.read plans.write transactions.read transactions.write webhooks.write subscriptions.read subscriptions.write charges.read charges.write boletos.read carnes.read\"\r\n}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            InputStreamReader reader = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(reader);

            String response;
            StringBuilder responseBuilder = new StringBuilder();
            while ((response = br.readLine()) != null) {
                //System.out.println(response);
                responseBuilder.append(response);
            }
            try {
                JSONObject jsonObject = new JSONObject(responseBuilder.toString());
                access_token = jsonObject.getString("access_token");
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Erro na conversão de " + responseBuilder);
                e.printStackTrace();
            }
            conn.disconnect();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro na autenticação de ");
            e.printStackTrace();
        }

        return access_token;
    }

}
