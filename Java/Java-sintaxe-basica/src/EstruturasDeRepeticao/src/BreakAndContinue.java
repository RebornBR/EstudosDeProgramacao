import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Reborn
 * @since 05/09/2023
 * @version 1.0
 */
public class BreakAndContinue {
    public static void main (String [] args) throws Exception{
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int numeroEscolhido;
    int numBomba = valorAleatorio(); // o valor da variáverl será recebido do método, método esse que atribui um valor aleatório entre 0 e 10
    int numBomba2 = valorAleatorio();
    int numBomba3= valorAleatorio();
    int numBomba4 = valorAleatorio();
    int numBomba5 = valorAleatorio();
    
    System.out.println("Escolha um número entre 0 e 10, se escolher o errado... BOOM");
    numeroEscolhido = scanner.nextInt();


    for(;numeroEscolhido <= 10;){// só será realizado o bloco abaixo se o número escolhido for menor ou igual a 10
     if(numeroEscolhido == numBomba || numeroEscolhido == numBomba2 || numeroEscolhido == numBomba3 || numeroEscolhido == numBomba4 || numeroEscolhido == numBomba5 ){ 
     // se número escolhido for igual a algum numBomba, que será atribuido um valor aleatório, fará o comando abaixo.
        System.out.println("BOOM, VOCÊ MORREU.");
        break; // sai do bloco FOR e exibe a mensagem fora dele "Você perdeu o jogo, que tistreza...."

     }else{ // se usuário não digitar o número bomba, exibirá "Parabéns, você ganhou o game."

        System.out.println("Parabéns, você ganhou o game.");
        break; // sai do bloco FOR e exibe a mensagem fora dele "Você perdeu o jogo, que tistreza...."
     }

    }
    System.out.println("Fim de game, que tistreza....");

    System.out.println("\n Teste continue");
    int y = scanner.nextInt();

    for(;y <= 10; y++) { //enquanto y for menor que <= 10, fará y= y + 1, ou seja, y++.
    
    if(y == 6){
        continue; // sempre que y for igual a 6, ele pulará a interação abaixo, ou seja, nao exibirá a mensagem System.out.println("Número: " + y)
    }             // isso significa que quando y for igual a 6, a mensagem não será exibida.
    System.out.println("Número: " + y);
    }

    }

/**
 * 
 * @return retorna um número inteiro aleátorio entre 0 e 10
 */
 private static int valorAleatorio() { 
	return ThreadLocalRandom.current().nextInt(0, 10);
   }
    
    
}
