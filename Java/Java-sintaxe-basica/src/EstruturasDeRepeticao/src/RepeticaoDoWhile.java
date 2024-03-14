import java.util.Random;


/**
código em Java simula uma ligação telefônica. Ele utiliza um loop do-while para repetir a ação de "Telefone tocando" até que alguém atenda. 
A condição do while é baseada no método "pessoaAtendeu", que retorna um valor booleano. Dentro desse método, é gerado um número aleatório entre 0 e 9. Se o número for igual a 1, significa que alguém atendeu (atendeu = true), caso contrário, ninguém atendeu (atendeu = false).
o metodo pessoaAtendue() retorna o valor de atendeu.
O loop continua enquanto o método "pessoaAtendeu" retornar falso. Quando alguém atende, o loop para e exibe "Alô !!!".
 */

public class RepeticaoDoWhile {
    public static void main(String[] args) throws Exception{
System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		}while(pessoaAtendeu() == false); //enquanto atendeu for false
		System.out.println("Alô !!!");
	}


/**
 * gera um número aleatório entre 1 e 10, se for o número 1, será true. 
 * o valor de atendeu é um booleano, a pergunta do atendeu, é se o número aleatorio é igual a 1
 * @return retorna o valor de atendeu, enquanto o atendeu for false, executará o loop do while.
 */
	private static boolean pessoaAtendeu() { 
		boolean atendeu = new Random().nextInt(10)==1; 
		System.out.println("Atendeu? " + atendeu);           
		return atendeu;		
	}

    }

