package br.com.visao.api_java_galax_pay;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


public class Cobrancas {
	
	public String geraCobranca(String token) {
		//TUDO: Criar um objeto para os dados da cobranca
		String dadosCobranca = "{\n \"myId\": \"52881\","
	            + "\n\"value\": 10,"
	            + "\n\"additionalInfo\": \"VENDA 52881\","
	            + "\n\"payday\": \"2021-08-27\","
	            + "\n\"payedOutsideGalaxPay\": false,"
	            + "\n\"mainPaymentMethodId\": \"pix\","
	            + "\n\"Customer\": {"
	            + "\n\"myId\": \"1\","
	            + "\n\"name\": \"CONSUMIDOR\","
	            + "\n\"document\": \"65324441970\","
	            + "\n\"emails\": [teste5260email4899@galaxpay.com.br\"\n],"
	            + "\n\"phones\": [31983890110\n]\n},"
	            + "\n\"PaymentMethodPix\": {"
	            + "\n\"fine\": 0,"
	            + "\n\"interest\": 0,"
	            + "\n\"instructions\": \"Lorem ipsum dolor sit amet.\","
	            + "\n\"Deadline\": {"
	            + "\n\"type\": \"days\","
	            + "\n\"value\": 1\n}\n}\n}";
		
		StringBuilder responseBuilder = new StringBuilder();
		
		 try {

	           URL url = new URL("https://api.galaxpay.com.br/v2/charges"); //Para ambiente de Produção              
	           HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
	           conn.setDoOutput(true);
	           conn.setRequestMethod("POST");
	           conn.setRequestProperty("Content-Type", "application/json");
	           conn.setRequestProperty("Authorization", "Bearer " + token);
	           
	           

	           OutputStream os = conn.getOutputStream();
	           os.write(dadosCobranca.getBytes());
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
