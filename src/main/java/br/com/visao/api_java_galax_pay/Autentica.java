package br.com.visao.api_java_galax_pay;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.Base64;
import javax.net.ssl.HttpsURLConnection;

import org.json.JSONObject;


/**
*
* @author WILTON OLIVEIRA
*/
public class Autentica {

//Dados de SANDBOX
   private final String client_id = "5473";
   private final String client_secret = "83Mw5u8988Qj6fZqS4Z8K7LzOo1j28S706R0BeFe";
   private final String basicAuth = Base64.getEncoder().encodeToString(((client_id + ':' + client_secret).getBytes()));
   
   //66716bf7f4021097c378a2745cec9442d07ea6c3

   public String getToken() {
       String access_token = "";
       
       //System.err.println("BASE: "+basicAuth);
       try {

           URL url = new URL("https://api.galaxpay.com.br/v2/token"); //Para ambiente de Produção              
           HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
           conn.setDoOutput(true);
           conn.setRequestMethod("POST");
           conn.setRequestProperty("Content-Type", "application/json");
           conn.setRequestProperty("Authorization", "Basic " + basicAuth);
           String input = "{\n    \"grant_type\": \"authorization_code\",\n    \"scope\": \"customers.read customers.write plans.read plans.write transactions.read transactions.write webhooks.write charges.read charges.write boletos.read carnes.read\"\n}";

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
               System.out.println("Erro na conversão de " + responseBuilder);
               e.printStackTrace();
           }
           conn.disconnect();
       } catch (Exception e) {
           System.out.println("Erro na autenticação de ");
           e.printStackTrace();
       }

       return access_token;
   }
}