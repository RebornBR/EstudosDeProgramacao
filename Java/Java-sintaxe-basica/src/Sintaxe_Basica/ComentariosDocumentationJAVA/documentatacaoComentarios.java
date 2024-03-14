package Sintaxe_Basica.ComentariosDocumentationJAVA;

import java.util.Locale;
import java.util.Scanner;

/**
* <h1>Exemplo comentário documentação</h1>
*
* @author  Reborn
* @version 1.0
* @since   30/08/2023
*/


public class documentatacaoComentarios {

     /*comentario multi linha utilizado para explicações longas
o comentário acima desse o com "/" e "**" é utilizado para comentários a nivel de documentação, é colocado antes da classe, porque é utilizar para
informar os comentários que colocamos lá, ao passarmos o mouse por cima do nome da classe
podemos tbm utilizar esse comentário de de cima o com "/" e "**" para explicar os metodos, seus parametros, e suas exceções, como mostra
o exemplo abaixo. ao passarmos o mouse por cima do nome do metodo/função veremos as informações
 */


    public static void main(String[] args) throws Exception {
    int a,b;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // necessario para receber valores do usuario
    System.out.println("Digite o primeiro número da soma:");
    a = scanner.nextInt();
    System.out.println("Digite o segundo número da soma:");
    b= scanner.nextInt();
    int resultado = somar(a, b); // não precisamos criar a variavel.
    System.out.println("O resultado é = " + resultado);
System.out.println("resultado sem variável para armazenar o valor do metodo e inserir as variaveis que serão os parametros = " + somar(a , b));

    }

    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
  public static int somar(int numeroUm, int numeroDois) {
    return  numeroUm + numeroDois;
}
    
}
