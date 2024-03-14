package main.java.List.OperacoesBasicas.DesafioCarrinhoCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

public Item(String nome, double preco, int quantidade){ 
/*
 * Método construtor, toda vez que criarmos um Item, ele deverá ter 3 parametros.
 *  1 String
 *  1 double
 *  1 int
 * respectivamente nome, preço e quantidade
 */
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}

public String getNome() {
    return nome;
}

public double getPreco() {
    return preco;

}public int getQuantidade() {
    return quantidade;
}

public String toString(){//retorna a lista, o nosso Item, nesse formato
    return  "\n" + "Nome produto: [ " + nome + " ]" + " Preço produto [R$ " + preco + " ] Quantidade produto: [ " + quantidade + " ]";
}
}

