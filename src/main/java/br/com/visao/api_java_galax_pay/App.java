package br.com.visao.api_java_galax_pay;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String token = new Autentica().getToken();
        System.out.println("TOKEN: "+token);
        
        String resultado = new Cobrancas().geraCobranca(token);
        
        System.out.println("RESULTADO: "+resultado);
    }
}
