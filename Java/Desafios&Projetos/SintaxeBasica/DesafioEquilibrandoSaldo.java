package SintaxeBasica;
import java.util.Locale;
import java.util.Scanner;

public class DesafioEquilibrandoSaldo {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

   //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.

System.out.println("Digite saldo atual");    
double saldoAtual = scanner.nextDouble();

System.out.println("Digite o valor do deposito:");
double valorDeposito = scanner.nextDouble();

System.out.println("Valor retirada");
double valorRetirada = scanner.nextDouble();


saldoAtual = saldoAtual + valorDeposito - valorRetirada;
 //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
 System.out.printf("%.1f" , saldoAtual);

}

}