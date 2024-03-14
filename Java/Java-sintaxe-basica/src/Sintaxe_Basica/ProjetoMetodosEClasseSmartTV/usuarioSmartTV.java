package Sintaxe_Basica.ProjetoMetodosEClasseSmartTV;

import java.util.Locale;
import java.util.Scanner;

public class usuarioSmartTV {

    public static void main (String[] args) throws Exception {           
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // necessario para receber valores do usuario

        SmartTV informacoesAtuaisSmartTV = new SmartTV(); //criação de um objeto que vai armazenar os valores da classe CONSTRUTORA smartTV.

        System.out.println("Exibindo informações atuais da tv:");
        System.out.println("A SmartTV está desligada ? " + informacoesAtuaisSmartTV.ligadoOuDesligado);
        System.out.println("Canal atual: " + informacoesAtuaisSmartTV.canal);
        System.out.println("Volume atual: " + informacoesAtuaisSmartTV.volume);
        
        System.out.println("Utilizando metodos criados na classe SmartTV:");
        System.out.println("Usuário apertou botão para ligar a TV: ");
        informacoesAtuaisSmartTV.ligar();

        System.out.println("Usuário apertou botão para aumentar canal da TV: ");
        informacoesAtuaisSmartTV.aumentarCanal();

        System.out.println("Usuário apertou botão para diminuir canal da TV: ");
        informacoesAtuaisSmartTV.diminuirCanal();

        System.out.println("Usuário apertou botão para aumentar volume da TV: ");
        informacoesAtuaisSmartTV.aumentarVolume();

        System.out.println("Usuário apertou botão para diminuir volume da TV: ");
        informacoesAtuaisSmartTV.diminuirVolume();

        System.out.println("Digite o canal que deseja mudar: "); 
        int CanalDigitadoPeloUsuario = scanner.nextInt();                         
        informacoesAtuaisSmartTV.mudarCanal(CanalDigitadoPeloUsuario); // chamamos o metodo mudarCanal() e no seu parametro atribuimos a variavel criada aqui CanalDigitadoPeloUsuario.
        
        // implementar laço de repetição e leitura de linha, para perguntar se vai desligar
        informacoesAtuaisSmartTV.desligar();

    }
}
