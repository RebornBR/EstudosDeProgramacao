package SintaxeBasica;
import java.util.Locale;
import java.util.Scanner;

public class DesafioJurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double valorInicial;
        double taxaJuros;
        double valorFinal;
        int periodoJuros;

        System.out.println("Digite o valor inicial");
        valorInicial = scanner.nextDouble();
        System.out.println("Digite a taxa de juros, utilize ponto no lugar da virgula e não insira o simbolo %");
        taxaJuros = scanner.nextDouble();
        System.out.println("Insira o periodo de pagamento");
        periodoJuros = scanner.nextInt();

System.out.println("Resultado sem math.pow");
 double calculoExpo = 1 + taxaJuros / 100;
 for(int i = periodoJuros - 1; i != 0 ; i--){
        calculoExpo = calculoExpo * (1 + taxaJuros / 100); 
    }
    /*
     * Usando taxaJuros em 8% como exemplo 
     * 8 / 100 será 0.08 
     * o resultado de calculoExpo será 1.08, que será multplicado por (1 + taxaJuros(que é 8 no exemplo) / 100) o resultado será 1.08
     * ou seja calculoExpo = 1.08 * 1.08 = 1.1664
     * agora o calculoExpo passa a ser 1.1664 que será multiplicado novamente por 1.08. 
     * e continuará sendo multiplicado até que a condição i !=0 seja falsa
     * se utilizarmos o periodoJuros como 5, ao final teremos o calculoExpo = 1.4693280768000003
     */
   
    System.out.println(calculoExpo);
    valorFinal = valorInicial * calculoExpo ;
System.out.println("Sem math.pow: R$" + valorFinal);

        taxaJuros = taxaJuros / 100;
        /*
         * Math.pow  == para fazer elevado 
         * Math.Pow((1+taxa de juros), elevado ao mesesJuros)
         */
        valorFinal = valorInicial * Math.pow((1 + taxaJuros), periodoJuros);
        System.out.println("Com math.pow: R$ " + valorFinal); // valor formatado com 2 casas
    
   
    }
}
