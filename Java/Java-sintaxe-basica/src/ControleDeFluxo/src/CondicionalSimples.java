import java.util.Locale;
import java.util.Scanner;

public class CondicionalSimples {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    double saldo = 250.0;
    double valorSolicitado;

    System.out.println("Digite o valor que deseja sacar:");
    valorSolicitado = scanner.nextDouble();
    

    if(valorSolicitado < saldo){  // só acontece se a condição for verdadeira
     saldo = saldo - valorSolicitado;
     System.out.println("Você retirou: " + valorSolicitado + " Seu saldo atual é de: " + saldo);
    }
       
    
    }
}
