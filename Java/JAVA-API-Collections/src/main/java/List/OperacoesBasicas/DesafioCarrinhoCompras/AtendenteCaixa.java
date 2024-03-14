package main.java.List.OperacoesBasicas.DesafioCarrinhoCompras;

import java.util.Locale;
import java.util.Scanner;

public class AtendenteCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);         
        CarrinhoCompra caixa = new CarrinhoCompra();
        String repetir = "";
        String nomeProduto;
        double precoProduto;
        int quantidadeProduto;
        String produtoParaRemoção = "";
        
        while(!repetir.equals("1")){// enquanto repetir for diferente de 1
        System.out.println("Digite o nome do produto");
        nomeProduto = scanner.next();
        System.out.println("Digite o preço do produto");
        precoProduto = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto");
        quantidadeProduto = scanner.nextInt();
        System.out.println("Digite '1' e aperte enter para terminar a compra ou digite algo e aperte enter para continuar.");
        repetir = scanner.next();
        caixa.adicionarItemCarrinho(nomeProduto, precoProduto, quantidadeProduto);
        }
        System.out.println("itens no carrinho");
        caixa.exibirItens();
        
        while(!produtoParaRemoção.equals("1")){ // enquanto produtoParaRemocao for diferente de 1
        System.out.println("Digite o nome do produto que será removido, digite '1' para finalizar");
        produtoParaRemoção = scanner.next();
        caixa.removerItem(produtoParaRemoção);
        }

        System.out.println("Total da sua compra:");
        caixa.valorCompra();
        System.out.println("Itens comprados:");
        caixa.exibirItens();

    }
    

}
