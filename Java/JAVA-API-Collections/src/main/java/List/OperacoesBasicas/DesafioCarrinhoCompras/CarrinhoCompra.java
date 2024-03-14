package main.java.List.OperacoesBasicas.DesafioCarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
private List<Item> itensLista;

public CarrinhoCompra()
{/*
 quando instanciar nosso CarrinhoCompra, uma ArrayList será criada
 */
    this.itensLista = new ArrayList<>();

}

/**
 * <h1>Adicionar Item ao nosso array itensLista <h1>
<h3>Nosso método adicionarItemCarrinho, conta com 3 parametros, nome, preco e quantidade
esse metódo criará um novo Item chamado 'produto' que terá como características, esses 3 parametros
nome, preco e quantidade.
Após a criação do nosso Item produto, iremos adicionar esse produto ao nosso ArrayList
*/
public void adicionarItemCarrinho(String nome, double preco, int quantidade){

    Item produto = new  Item (nome, preco, quantidade);
    this.itensLista.add(produto);
}

/**
* <h1>Para removermos um Item do nosso ArrayList:<h1>
* <h3> Criamos uma List que é do tipo Item, chamada itensParaRemover que será um novo ArrayList.
Primeiro verificamos se nossa itensLista, onde se encontra os produtos que foram adicionados,
é diferente de vazio, se NÃO for diferente, ou seja, se nossa lista estiver vazia, retorna a mensagem "A lista está vazia"
se for diferente de vazio executaremos nosso forEach. 
* <h3>Nosso forEach basicamente diz que para cada Item(i) presente na itensLista. O i chamará o método getNome(presente na nossa classe item.), que retornará o nome do Item em cada posição do 
nosso Array itensLista, que será comparado com o nosso parametro nome, se forem identicos. o Item(i) será adicionado ao nosso array itensParaRemover.<h3>
Agora utilizameros nossa itensLista e com o comando removeAll removeremos os itensParaRemover.
 
@param nome : É o parametro que será utilizado como comparação, será verificado se é igual ao nome de algum Item dentro do nosso Array itenLista.
*/
public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();
    if (!itensLista.isEmpty()) { //verifica se itensLista é diferente de vazio.
      for (Item i : itensLista) { // forEach, 
        if (i.getNome().equalsIgnoreCase(nome)) {
          itensParaRemover.add(i);
        }
      }
      itensLista.removeAll(itensParaRemover);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

public void valorCompra(){
    double valorTotal = 0;
    if(!itensLista.isEmpty()){
        for(Item item : itensLista){
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem;
    }
    System.out.println("R$" + valorTotal );
    }else {
        throw new RuntimeException("A lista está vazia");
    }
}

public void exibirItens(){
    if(!itensLista.isEmpty()){
        System.out.println(this.itensLista);
    } else {
        System.out.println("A lista está vazia");
    }
}
public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
    CarrinhoCompra carrinhoDeCompras = new CarrinhoCompra();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItemCarrinho("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItemCarrinho("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItemCarrinho("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItemCarrinho("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = ");
    carrinhoDeCompras.valorCompra();
  }

}
