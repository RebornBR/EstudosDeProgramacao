package main.java.Set.Ordenacao.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
     //atributo
  private Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produtoSet.add(new Produto(cod, nome, preco, quantidade));
  }

  /**
   * com a implementação do nosso comparable na nossa classe Produtor e a criação do 
   * public int compareTo que basicamente utiliza o compare para organizar os elementos 
   * pelo seu nome, esse é o método que diz ao TreeSet a forma, pelo o que, 
   * será organizado nossos elementos.
   * <h3>Com a lógica acima criada na nossa Classe produto, criamos um set que é um produto, chamado
   * produtosPorNome que será uma novo TreeSet e que receberá os elementos 
   * do nosso HashSet(produtosSet)<<h3>
   * 
   */
  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    if (!produtoSet.isEmpty()) {
      System.out.println("Lista por nome: " + produtosPorNome);
      return produtosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  /**
   * Nosso comparatorPorPreço, que é um comparator criado fora da nossa classe Produto, que utiliza
   * o compare para ordenar os elementos pelo seu preço.
   * <h3>Com a logica acima criada na nossa Classe Produto, nosso novo Set que é um Produto e é chamado de 
   * produtosPorPreço será um novo TreeSet, e esse TreeSet será um novo ComparatorPorPreco, isto é, nosso
   * TreeSet herdará as carateristicas do nosso ComparatorPorPreco, e com isso sera ordenado, organizado
   * pelo preço<h3>
   * 
   */
  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    if (!produtoSet.isEmpty()) {
      produtosPorPreco.addAll(produtoSet);
      System.out.println("Lista por preço: " + produtosPorPreco);
      return produtosPorPreco;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }
}