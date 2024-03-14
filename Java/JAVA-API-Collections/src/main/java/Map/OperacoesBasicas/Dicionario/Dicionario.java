package main.java.Map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

//criar um main ou testar aqui mesmo depois
public class Dicionario {
  private Map<String, String> dicionario;

  /*Método construtor, criando um HashMap */
  public Dicionario() {
    this.dicionario = new HashMap<>();
  }

  /**
   * <h3>Adicionando uma Palavra e sua definição ao nosso HashMap(dicionario), lembrando que nossa palavra será a chave e definicao será o seu valor 
   * podem existir varias definições que sejam iguais, mas não pode haver chaves(palavra) iguais.
   */
  public void adicionarPalavra(String palavra, String definicao) {
    dicionario.put(palavra, definicao);
  }
  
  /**
   * <h3>com o comando remove, removemos a chave(e seu valor) que for igual ao nosso parametro(palavra) do dicionario 
   */
  public void removerPalavra(String palavra) {
    if (!dicionario.isEmpty()) {
      dicionario.remove(palavra);
    } else {
      System.out.println("O dicionário está vazio.");
    }
  }

  /** 
   * <h3> criamos uma String chamada definicao que receberá atraves do comando get a chave(palavra) presente em dicionario que seja igual ao nosso parametro palavraProcurada.
   * Se não houver uma chave que seja igual ao nosso parametro, será retornado o null.
   * <h3> Se houver essa chave, ou seja, se o retorno for diferente de null, retornaremos o valor(descricao) dessa chave. Caso não seja encontrado, ou seja, null 
   * retornaremos a mensagem "Linguagem não encontrada no dicionário"
   *    
   * */
  public String pesquisarPorPalavra(String palavraProcurada) {
    String definicao = dicionario.get(palavraProcurada);
    if (definicao != null) {
      return definicao;
    }
    return "Linguagem não encontrada no dicionário.";
  }

  public void exibirPalavras() {
    if (!dicionario.isEmpty()) {
      System.out.println(dicionario);
    } else {
      System.out.println("O dicionário está vazio.");
    }
}

}
