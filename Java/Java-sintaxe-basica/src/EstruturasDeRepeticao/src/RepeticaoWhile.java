import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RepeticaoWhile {

    public static void main (String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o valor da sua mesada: ");
   double mesada = scanner.nextDouble();
   
        while(mesada>0) { //enquanto mesada for maior que zero, faz os comandos abaixo
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
            valorDoce = mesada; // caso o valor do doce seja maior que a mesada, a mesada receberá o mesmmo valor do doce, evitando o retorno de números negativos
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
            System.out.println("O valor restande da sua mesada é: " + mesada);
        }

        System.out.println("Você gastou toda a sua mesada em doces");
        
   }

   /**
 * 
 * @return retorna um número decimal(double) aleátorio entre 2 e 8
 */
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }


    }


