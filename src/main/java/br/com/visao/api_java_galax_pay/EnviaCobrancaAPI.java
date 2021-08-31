package br.com.visao.API_GALAXPAY;

/**
 *
 * @author WILTON OLIVEIRA
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class EnviaCobrancaAPI {

    public String EnviaCobranca(String token, String cob) {

        StringBuilder responseBuilder = new StringBuilder();

        try {

            URL url = new URL("https://api.sandbox.cloud.galaxpay.com.br/v2/charges");
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.addRequestProperty("User-Agent", "API Software ERP");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Authorization", "Bearer " + token);

            OutputStream os = conn.getOutputStream();
            os.write(cob.getBytes());
            os.flush();

            InputStreamReader reader = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(reader);

            String response;

            while ((response = br.readLine()) != null) {
                //System.out.println(response);
                responseBuilder.append(response);
            }

            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Erro na geraçao da cobrança!");
            e.printStackTrace();
        }

        return responseBuilder.toString();

    }
}
