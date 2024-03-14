package main.java.Set.Ordenacao.CadastroProdutos;

import java.util.Locale;
import java.util.Scanner;

public class UsuarioCadastroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        CadastroProdutos usuarioCadastrando = new CadastroProdutos();
        long codigo;
        double preco;
        int quantidade;
        String repetir, nome;
        boolean x = true;
        while(x == true){
            System.out.println("Digite o código do produto");
            codigo = scanner.nextLong();
            System.out.println("Digite o nome do produto");
            nome = scanner.next();
            System.out.println("Digite o preço do produto");
            preco = scanner.nextDouble();
            System.out.println("Digite a quantidade do produto");
            quantidade = scanner.nextInt();
            usuarioCadastrando.adicionarProduto(codigo, nome, preco, quantidade); 
            System.out.println("Digite '1' para parar ");
            repetir = scanner.next();
            
        if(repetir.equals("1")){
            x = false;
        }
        }
        usuarioCadastrando.exibirProdutosPorNome();
        usuarioCadastrando.exibirProdutosPorPreco();
       
    }
}
