package main.java.Set.Ordenacao.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
  //atributos
  private long codigo;
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(long codigo, String nome, double preco, int quantidade) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }
//////////////////////////////////////////////////////////////////
  /* USO DO COMPARABLE
   * Ao implements comparable qo tipo Produto, utilizamos o método abaixo
   * para dizer que nosso Produto, será ordenado pelo seu nome, a implementação 
   * desse método é o que diz ao nosso List, set ou map a forma que os elementos serão organizados
   *  nesse caso, usamos o TreeSet, que mantem 
   * em uma ordem crescente automaticamente todos os elementos cadastrados  pelo seu nome
   */
  public int compareTo(Produto p) {
    return nome.compareToIgnoreCase(p.getNome());
  }
/////////////////////////////////////////////////////////////////

  public long getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

/////////////////////////////////////////////////////////////////////
/*como o set, só aceita elementos unicos, utilizaremos o código como identificação, ou seja,
 * podem existir produtos de mesmo nome, mas todos devem ter um código diferente
 * verifica se existe um código identico dentro do nosso Hashset, se for identico
 * ele não será inserido no Hashset
 */
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Produto produto)) return false;
    return getCodigo() == produto.getCodigo();
  }

  public int hashCode() {
    return Objects.hash(getCodigo());
  }
////////////////////////////////////////////////////////////////////

  public String toString() {
    return "Produto{" + " codigo= " + codigo + ", nome= " + nome  + ", preço= " + preco + ", quantidade= " + quantidade + '}' + "\n";
  }
}

/*
 * implmentação do Comparator do tipo produto, quando instaciarmos essa class, estaremos ordenando os elementos
 * pelo preço.
 * basicamente diz ao nosso list, set, map, nesse caso ,o TreeSet, a forma que os elementos serão organizados
 */
class ComparatorPorPreco implements Comparator<Produto> {
  @Override
  public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
  }
    
}
