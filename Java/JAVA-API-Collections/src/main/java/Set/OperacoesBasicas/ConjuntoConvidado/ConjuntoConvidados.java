package main.java.Set.OperacoesBasicas.ConjuntoConvidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
     //atributo
  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() { // Criamos nosso HashSet
    this.convidadosSet = new HashSet<>();
  }

  /**
   * <h2>Adicionamos novos connvidados ao nosso HashSet(convidadosSet) atraves dos 
   * parametros
   * 
   * @param nome
   * @param codigoConvite
   */
  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadosSet.add(new Convidado(nome, codigoConvite));
  }
  
  /**
   * Criamos uma variavel do tipo Convidado chamada convidadoParaRemover que inicialmente
   * terá um null como valor. Verificamos se nosso HashSet(convidadosSet) é diferente
   * de vazio, se for, executaremos o forEach.
   * <h3>Nosso forEach, para cada Convidado(c) presente em convidadosSet, iremos verificar
   * se existe algum codigo presente no HashSet(convidadosSet) que seja igual ao nosso
   * parametro codigoConvite, se existir, nossa variavel convidadoParaRemover receberá
   * o elemento correspondente como seu valor, em outras palavras, nossa convidadoParaRemover,
   * terá o elemento, ou seja, o nome e o código como sua nova atribuição, seu novo valor<h3>
   * Após isso, usaremos o comando remove na nossa HashSet(convidadosSet) e iremos passar
   * a variavel convidadoParaRemover, que conterá o elemento que deve ser removido do nosso
   * HashSet.
   * @param codigoConvite
   */
  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    if (!convidadosSet.isEmpty()) {
      for (Convidado c : convidadosSet) {
        if (c.getCodigoConvite() == codigoConvite) {
          convidadoParaRemover = c;
          break;
        }
      }
      convidadosSet.remove(convidadoParaRemover);
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public int contarConvidados() {
    return convidadosSet.size();
  }

  public void exibirConvidados() {
    if (!convidadosSet.isEmpty()) {
      System.out.println(convidadosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

    
}
