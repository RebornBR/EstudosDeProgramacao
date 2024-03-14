import java.util.Locale;
import java.util.Scanner;

public class RepeticaoFOR {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int X; // variável de controle
    int carneirosBrancos = 0;
    
   // É necessário atribuir o valor inicial que a variável que será usada na condição terá.

    System.out.println("Digite até quantos carneirinhos brancos devo contar");
    X = scanner.nextInt();
    for(carneirosBrancos = 0; carneirosBrancos <= X ; carneirosBrancos++){  
        /*
        Podemos fazer a declaração da variável dentro do for. for (int carneirinhos = 0; carneirinhos <= X ; carneirinhos++)
         Váriavel carneirinhos começa em 0(PODEMOS COMEÇAR COM O VALOR QUE QUISERMOS) ; enquanto ela for menor ou igual a variável de controle X; 
         fará carneirinhos++ , que é o mesmo que carneirinhos + 1 e exibirá a mensagem abaixo.
         */
        System.out.println(carneirosBrancos + " Carneiros Brancos");
    }

    /*
     O que verdadeiramente importa no for é o bloco condicional, conforme exemplo abaixo
     */

    int carneirosPretos = 0;

    System.out.println("Digite até quantos carneirinhos pretos devo contar");
    X = scanner.nextInt();

    for( ; carneirosPretos <= X ;){ 
/*enquanto carneirosPretos for menor ou igual a variáve de controle X, executará os comandos abaixo */ 
        System.out.println(carneirosPretos + " Carneiros Pretos");
        carneirosPretos++;

    }



    }
}
