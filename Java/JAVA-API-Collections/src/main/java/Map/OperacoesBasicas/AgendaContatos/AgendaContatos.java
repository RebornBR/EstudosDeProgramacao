package main.java.Map.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

// criar um main depois
public class AgendaContatos {
  /*
   * Diferente do list e set, o map utiliza de uma chave e um valor, onde não pode haver chaves iguais dentro do HashMap, LinkedHashMap e afins.
   */
  private Map<String, Integer> agendaContatoMap;
  // Nossa String será a chave e o Integer será o valor

  /**
   * Método construtor, criando um HashMap
   */
  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>(); 
  }

  /**
   *<h3> Diferente do set e do list, onde utilizamos o comando add, para adicionar elementos.
   * <h3>No map utilizamos o comando put, que adicionará nossos 2 parametros(nome e telefone) ao HashMap agendaContatoMap
   * <h3>
   */
  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  /**
   * utilizamos o comando remove, para remover a chave(juntamente com seu valor) presente em agendaContatoMap que for igual ao nosso parametro
   * nome
   */
  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
  }

  public void exibirContatos() {
    if (!agendaContatoMap.isEmpty()) {
      System.out.println(agendaContatoMap);
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
  }

  /**
   * <h3>Criamos um Integer numeroPorNome que inicialmente recebe o valor null. E veriificamos se nosso HashMap(agendaContatoMap)
   * é diferente de vazio, se for, nosso numeroPorNome atraves do comando get, irá verificar no nosso agendaContatoMap a chave que é
   * igual ao nosso parametro nome, e retornará o telefone correspondente que é o valor dessa chave. caso nao encontre correspondente, retorna
   * "Contato não encontrado na agenda"(isto é, numeroPorNome = null) e caso nossa lista esteja vazia, retorna "a agenda de contatos está vazia"
   * <h3>Diferente do set e do list, onde criavamos outro  list ou set para que recebesse os elementos que fossem iguais ao nosso parametro atraves do forEach,
   * no map nao precisamos fazer isso, pois nossa Chave String(nome) é unica, e não existe outra igual<h3>
   * Similar a lógica onde fazemos que o código de um produto seja unico, ou seja, caso digitassemos produtos de mesmo código, o produto mais recente não seria
   * adicionado ao nosso set.
   * <h3>Contudo, diferentemente dessa logica onde o produto não é adicionado, o map com o seu comando put, o put tanto adiciona como tambem atualiza, ou seja
   * se tentarmos adicionar novamente com a mesma chave String(nome) ao digitarmos um novo telefone, esse telefone será salvo e subtituirá o anterior<h3>
   */
  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
      if (numeroPorNome == null) {
        System.out.println("Contato não encontrado na agenda.");
      }
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
    return numeroPorNome;
  }
}
