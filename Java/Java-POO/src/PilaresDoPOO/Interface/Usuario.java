package PilaresDoPOO.Interface;

import java.util.Locale;
import java.util.Scanner;

import PilaresDoPOO.Interface.Copiadora.Copiadora;
import PilaresDoPOO.Interface.Digitalizadora.Digitalizadora;
import PilaresDoPOO.Interface.EquipamentoMultifuncional.Multifuncional;
import PilaresDoPOO.Interface.Impressora.Deskjet;
import PilaresDoPOO.Interface.Impressora.Impressora;
import PilaresDoPOO.Interface.Impressora.Laserjet;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
/*
Impressora impressora = new Escanear();
Impressora impressora = new Xerox();
Chamamos a nossa interface Impressora , e instaciamos as nossas classes Escanear() e Xerox() 
mas como devemos observar, as nossas classes Escanear() e Xerox() não implementaram a impressora,
ou seja, elas não são impressoras, logo ocorrerá um erro
TESTE OS 2 CÓDIGOS FORA DO COMENTÁRIO(linha 17 e 18)
Agora faremos a mesma coisa abaixo, mas instaciaremos Laserjet() e Deskjet() que implementaram
a Impressora, ou seja, eles são impressoras
*/
Impressora impressora = new Deskjet();
impressora.imprimir(); 
/*chamamos nosso método imprimir e como a nossa impressora é o Deskjet
retornara como uma impressão pelo Deskjet
*/ 
impressora = new Laserjet(); 
impressora.imprimir(); 
/* 
agora dizemos que nossa impressora é a Laserjet, ao chamar o método
imprimir, ela imprimirá como uma Laserjet.
Teste para uma maior exemplificação as interfaces Copiadora e Digitalizadora
e instacie as classes Xerox() e Escanear() que dará certo e tambem teste
Laserjet() e Deskjet() esses darão errado, porque não são copiadoras e nem digitalizadoras
*/
System.out.println("Fim teste, iniciando testes com multifuncional");
Multifuncional multiFazTudo = new Multifuncional();
multiFazTudo.imprimir();
multiFazTudo.copiar();
multiFazTudo.digitalizarEscaneando();
/*
 Chamamos nossa classe Multifuncional e a instaciamos.
 como podemos ver, nossa classe multifuncional implementou todas as 3 interfaces, ou seja.
 ela é uma impressoa, uma copiadora e uma digitalizadora, como tal conseguimos usar
 todas os metodos e funções dessas 3 interfaces. Para termos uma maior certeza disso 
 chamaremos nossas 3 interfaces e instaciaremos a nossa classe Multifuncional.
 como ela implementou todas as 3 interfaces, ela não terá nenhum erro, diferente dos exemplos mostrados acima
 */
System.out.println("outro teste");
Impressora impressora2 = new Multifuncional(); 
/*como podemos ver não apresenta erro, porque nossa classe Multifuncional() é uma impressora
Impressora impressora3 = Xerox(); 
retire dos comentários o códigoc a cima(linha 56) e veja os erros, afinal nossa classe Xerox()
não implementou a interface Impressora, ou seja ela não é uma impressora.
*/ 
Copiadora copiadora = new Multifuncional();
Digitalizadora digitalizadora = new Multifuncional();
impressora2.imprimir();
copiadora.copiar();
digitalizadora.digitalizarEscaneando();
    }
}
