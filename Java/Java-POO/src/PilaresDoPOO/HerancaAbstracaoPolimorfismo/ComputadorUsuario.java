package PilaresDoPOO.HerancaAbstracaoPolimorfismo;

import PilaresDoPOO.HerancaAbstracaoPolimorfismo.model.Facebook;
import PilaresDoPOO.HerancaAbstracaoPolimorfismo.model.MSN;
import PilaresDoPOO.HerancaAbstracaoPolimorfismo.model.Telegram;

public class ComputadorUsuario {
    public static void main(String[] args) {
    Facebook fcb = new Facebook();
    MSN msn = new MSN();
    Telegram tel= new Telegram();  

    fcb.entrandoNaRedeSocial();
    fcb.enviarMensagem();
    fcb.receberMensagem();
    fcb.testandoHeranca();

    msn.entrandoNaRedeSocial();
    msn.enviarMensagem();
    msn.receberMensagem();
    msn.testandoHeranca();

    tel.entrandoNaRedeSocial();
    tel.enviarMensagem();
    tel.receberMensagem();
    tel.testandoHeranca();
    
    }
    


}
