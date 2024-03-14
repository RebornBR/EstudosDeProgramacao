package main.java.Map.Pesquisa.GerenciarEstoqueProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Criamos um map onde o Long é nossa chave, e produto nosso valor. e não pode haver chave(Long) iguais 
    //neste exemplo, nosso Long será um cod
    private Map<Long, Produto> estoqueProdutosMap;
    
  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutosMap);
  }

  /**
   * <h3>ForEach, para cada Produto(p) presente em estoqueProdutosMap com o comando values, usaremos apenas os valores do nosso Map, ou seja, utilizaremos as informações do Produto, que é o valor da nossa chave Long(cod). <h3> com O forEach multiplicaremos o getQuantidade(retorna  o valor da quantidade) com o getPreco(retorna o valor do preco) e somaremos a nossa 
   * variavel valorTotalEstoque, faremos isso para todo Produto(p) presente no nosso Map(estoqueProdutosMap).
   */
  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0d;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produto p : estoqueProdutosMap.values()) {
        valorTotalEstoque += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotalEstoque;
  }

  /**
   * <h3>ForEach, para cada Produto(p) presente em estoqueProdutosMap com o comando values, usaremos apenas os valores do nosso Map, ou seja, tilizaremos as informações do Produto, que é o valor da nossa chave Long(cod). Nossa variavel maiorPreco receberá o valor minimo do tipo double e nosso forEach irá obter com o getPreco o preco do Produto(p) presente no nosso 
   * estoqueProdutosMap e vai fazer a verificação se esse preço é maior que nossa variavel maiorPreco, se for maior nosso produtoMaisCaro receberá esse produto como seu novo valor e nossa maiorPreco recebera o preco desse produto.
   */
  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    for (Produto p : estoqueProdutosMap.values()) {
      if (p.getPreco() > maiorPreco) {
        produtoMaisCaro = p;
        maiorPreco = p.getPreco();
      }
    }
    return produtoMaisCaro;
  }
/**
 * Similar a explicação acima a diferença é a variavel que agora é menorPreço recebera o valor maximo do double e sempre que o preço do nosso produto for inferior a essa variavel, nosso ProdutoMaisBarato receberá esse produto como novo valor e nossa menorPreco receberá o preco desse produto como valor.
 */
  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    for (Produto p : estoqueProdutosMap.values()) {
      if (p.getPreco() < menorPreco) {
        produtoMaisBarato = p;
        menorPreco = p.getPreco();
      }
    }
    return produtoMaisBarato;
  }

  
  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorQuantidadeValorNoEstoque = null;
    double maiorValorTotalProdutoEstoque = 0d;
    if (!estoqueProdutosMap.isEmpty()) {
       /*
     * Método Entry, com método entrySet retorna um set com objetos do tipo Map.Entry(com isso retornamos tanto a chave como o seu valor), Long(chave) Produto(valor) do nosso HashMap(estoqueProdutosMap)
     */
      for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) { // criamos um Map que será um Entry com Long(chave) e Produto(valor) chamado entry que será um set com o comando entrySet do nosso estoqueProdutosMap
        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();//obtem da nossa chave com o entry.getValue o seu getPreco e seu getQuantidade e os multiplica. Faz isso para cada elemento presente no estoqueProdutosMap
        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) { 
          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;// quando valorProdutoEmEstoque for maior que nosso maiorValorTotalProdutoEstoque , esse recebera o valorProdutoEmEstoque como seu novo valor
          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();//recebe o valor do elemento que for o maior dentro do nosso entrySet(estoqueProdutoMap)
        }
      }
    }
    return produtoMaiorQuantidadeValorNoEstoque;
}
}
