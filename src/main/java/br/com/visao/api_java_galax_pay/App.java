package br.com.visao.api_java_galax_pay;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Autentica aut = new Autentica();
        String token = aut.getToken();
        System.out.println("Token: "+token);
    }
}
