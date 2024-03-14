package PilaresDoPOO.HerancaAbstracaoPolimorfismo.model;

public class Facebook extends RedeSocial{
    /*o método validarConexaoInternet(). está aqui, ele já é um metodo que tambem pertence a essa classe
porque extendemos essa classe para a classe pai RedeSocial, ou seja, todas as carateristicas da classe pai, tambem pertencem a essa class*/
    
/*
 Diferente do validarConexaoInternet() os métodos abaixo são abstratos, ou seja, cada classe precisa definir o que eles fazem.
 
 */
public void entrandoNaRedeSocial() {
    validarConexaoInternet();
    System.out.println("Entrando no Facebook");
  }

  public void enviarMensagem() {
        validarConexaoInternet();
      System.out.println("Enviando mensagem pelo Facebook");
      
  }

  public void receberMensagem() {
      System.out.println("Recebendo mensagem pelo Facebook");
      
  }
    
}
