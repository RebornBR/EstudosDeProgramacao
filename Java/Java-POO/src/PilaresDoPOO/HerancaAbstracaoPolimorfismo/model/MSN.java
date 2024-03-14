package PilaresDoPOO.HerancaAbstracaoPolimorfismo.model;

public class MSN extends RedeSocial {
    /*o método validarConexaoInternet(). está aqui, ele já é um metodo que tambem pertence a essa classe
porque extendemos essa classe para a classe pai RedeSocial, ou seja, todas as carateristicas da classe pai, tambem pertencem a essa class*/
    
/*
 Diferente do validarConexaoInternet() os métodos abaixo são abstratos, ou seja, cada classe precisa definir o que eles fazem.
 o método/funçao testandoHeranca(). não está descrito aqui, mas foi herdado(extend) da classe pai RedeSocial
 ou seja ele tambem faz parte da classe msn, por isso podemos o utilizar, chamando-o com essa classe no main
 */
public void entrandoNaRedeSocial() {
    validarConexaoInternet();
    System.out.println("Entrando no MSN");
  }

  public void enviarMensagem() {
    validarConexaoInternet();
      System.out.println("Enviando mensagem pelo MSN");
      
  }

  public void receberMensagem() {
      System.out.println("Recebendo mensagem pelo MSN");
      
  }
}
