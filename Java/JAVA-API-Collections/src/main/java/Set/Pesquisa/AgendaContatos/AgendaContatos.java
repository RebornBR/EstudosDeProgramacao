package main.java.Set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(String nome, String numero) {
    contatosSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    if (!contatosSet.isEmpty()) {
      System.out.println("Lista de contatos" + contatosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }
/**
 * criamos um Set(contatosPorNome) que receberá apenas Contato e esse set será
 * um novo HashSet(). Temos um parametro chamado nome e com o método "startsWith" que será utilizado para
 * verificar se existe algum nome que seja igual ou que inicie, tenha 
 * as letras iguais a esse parametro dentro do nosso HashSet(contratosSet), 
 * nosso ForEach faz essa verificação. Toda vez que nessa verificação for true,
 * em outras palavras, sempre que seja encontrado um nome dentro do 
 * HashSet(contatosPorNome) que seja igual, ou que tenha as mesmas letras, do nosso
 * parametro nome. Esse contato(elemento) será adicionado a noso HashSet(contatosPorNome)
 */
  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().startsWith(nome)) {
          contatosPorNome.add(c);
        }
      }
      System.out.println("Lista de contatos com " + nome + " encontrados. Lista: " + contatosPorNome);
      return contatosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  /**
   * temos 2 parametros o novoNumero que irá alterar o numero atual e 
   *  o nome que será utilizado para verificação, isto é, verificar se existe 
   * algum contato dentro do HashSet(contatosSet) de mesmo nome.
   *  Criamos uma variavel do tipo Contato chamada contatoAtualizado. 
   * <h3>Nosso forEach, diz que para cada contato(c) presente em contatosSet será verificado se o nome
   * é igual ao nosso parametro, se for igual, esse contato será modificado através do método 
   * setNumero que terá como parametro o novoNumero, assim conseguimos mudar, alterar, atualizar
   * o contato que estiver presente no HashSet(contatosSet)<h3>
   */
  public Contato atualizarNumeroContato(String nome, String novoNumero) {
    Contato contatoAtualizado = null;
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().equalsIgnoreCase(nome)) {
          c.setNumero(novoNumero);
          contatoAtualizado = c;
          break;
        }
      }
      System.out.println("Contato Atualizado");
      return contatoAtualizado;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
}
}
