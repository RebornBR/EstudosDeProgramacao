package PilaresDoPOO.HerancaAbstracaoPolimorfismo.Polimorfismo;

import java.util.Locale;
import java.util.Scanner;

import PilaresDoPOO.HerancaAbstracaoPolimorfismo.model.Facebook;
import PilaresDoPOO.HerancaAbstracaoPolimorfismo.model.MSN;
import PilaresDoPOO.HerancaAbstracaoPolimorfismo.model.RedeSocial;
import PilaresDoPOO.HerancaAbstracaoPolimorfismo.model.Telegram;

public class Polimorfismo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        RedeSocial smi = null;
        /* a nossa classe pai RedeSocial que é ABSTRATA agora é um objeto chamado smi e tem um valor null. utilizamos para saber, de acordo com a escolha do usuário qual o aplicativo ele 
        executará/usará para assim obtermos as caracteristicas especificas de acordo com a escolha do usuário e executar da forma escolhida
         */
        System.out.println("Escolha um app. Digite Facebook, MSN ou Telegram");
        String appEscolhido = scanner.nextLine();

        if(appEscolhido.equals("MSN")){// equals é necessário quando precisamos compararar objetos
            smi = new MSN(); //se condição for verdadeira(true) instaciamos, chamamos, a classe(objeto) msn. e smi passa a ter as suas caracteristicas.
        }else if(appEscolhido.equals("Facebook")){
            smi = new Facebook();//se condição for verdadeira(true) instaciamos, chamamos, a classe(objeto) msn. e smi passa a ter as suas caracteristicas.
        }else if (appEscolhido.equals("Telegram")){
            smi = new Telegram();//se condição for verdadeira(true) instaciamos, chamamos, a classe(objeto) msn. e smi passa a ter as suas caracteristicas.
        }else {
            System.out.println("Digite uma das opções.");
        }
        smi.entrandoNaRedeSocial();
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
