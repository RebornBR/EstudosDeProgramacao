package SintaxeBasica;
import java.util.Locale;
import java.util.Scanner;

public class DesafioCondicionalmenteRico{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o saldo:");
        int saldoTotal = scanner.nextInt();
        System.out.println("Digite o valor do saque");
        int valorSaque = scanner.nextInt();
    
        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
        if(valorSaque <= saldoTotal){
            saldoTotal= saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoTotal);
          } else {
            System.out.println("Saldo insuficiente. Saque não realizado!");
          }
    }
}