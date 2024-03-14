package main.java.List.Pesquisa.Livros;

import java.util.Locale;
import java.util.Scanner;

public class UsuárioCatalogosLivros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    CatalogoLivros livrosBiblioteca = new CatalogoLivros();    
    int escolhaExibirTudo;
    String tituloLivro;
    String autorLivro;
    int anoPublicacaoLivro;

//vamos adicionar alguns livros para efeito de teste.
// podemos criar 3 variaveis, receber os valores pelo usuario e em seguida as passar como parametros no método adicionarLivro()
        livrosBiblioteca.adicionarLivro("HARRY POTTER E A PEDRA FILOSOFAL", "J. K. ROWLING", 1997);
        livrosBiblioteca.adicionarLivro("HARRY POTTER E A CÂMARA SECRETA", "J. K. ROWLING", 1998);
        livrosBiblioteca.adicionarLivro("HARRY POTTER E O PRISIONEIRO DE AZKABAN", "J. K. ROWLING", 1999);
        livrosBiblioteca.adicionarLivro("HARRY POTTER E O CÁLICE DE FOGO ", "J. K. ROWLING", 2000);
        livrosBiblioteca.adicionarLivro("HARRY POTTER E A ORDEM DA FÊNIX ", "J. K. ROWLING", 2003);
        livrosBiblioteca.adicionarLivro("HARRY POTTER E O ENIGMA DO PRÍNCIPE ", "J. K. ROWLING", 2005);
        livrosBiblioteca.adicionarLivro("HARRY POTTER E AS RELÍQUIAS DA MORTE ", "J. K. ROWLING", 2007);
        livrosBiblioteca.adicionarLivro("HARRY POTTER E A CRIANÇA AMALDIÇOADA ", "J. K. ROWLING", 2016);
        livrosBiblioteca.adicionarLivro("A GUERRA DOS TRONOS", "GEORGE R. R. MARTIN", 1996);
        livrosBiblioteca.adicionarLivro("A FÚRIA DOS DEUSES", "GEORGE R. R. MARTIN", 1998);
        livrosBiblioteca.adicionarLivro("A TORMENTA DE ESPADAS", "GEORGE R. R. MARTIN", 2000);
        livrosBiblioteca.adicionarLivro("O FESTIM DOS CORVOS", "GEORGE R. R. MARTIN", 2005);
        livrosBiblioteca.adicionarLivro("A DANÇA DOS DRAGÕES", "GEORGE R. R. MARTIN", 2011);
        
        System.out.println("titulo livro");
        tituloLivro = scanner.nextLine();
        System.out.println("autor livro");
        autorLivro = scanner.nextLine();
        System.out.println("Ano publicação livro");
        anoPublicacaoLivro = scanner.nextInt();
        livrosBiblioteca.adicionarLivro(tituloLivro, autorLivro, anoPublicacaoLivro);

    System.out.println("Temos todos os livros de harry potter e as crônicas de gelo e fogo(Game of thrones):");

    System.out.println("Como vc deseja fazer a busca. Digite '1' para exibir tudo, '2' para pesquisar por autor, '3' para pesquisar por titulo ou '4' para pesquisar por intervalo de anos");
    escolhaExibirTudo = scanner.nextInt();
    switch(escolhaExibirTudo){
        case 1 : {
            livrosBiblioteca.exibirLivros();
            break;
        } 

        case 2 : {
            System.out.println("Digite o nome do autor em maiúsculo, exemplo: 'ROBERTO' ");                
            String nomeAutor = scanner.nextLine(); 
            nomeAutor = scanner.nextLine();
            livrosBiblioteca.pesquisarPorAutor(nomeAutor);
            break;
        }
        
        case 3 : {
            System.out.println("Digite o título do livro em maiúsculo: ");
            String nomeTitulo = scanner.nextLine();
            nomeTitulo = scanner.nextLine();
            livrosBiblioteca.pesquisarPorTitulo(nomeTitulo);
            break;
        }
        case 4 : {
            int anoI, anoF;
            System.out.println("Procurar por intervalo entre os anos. Digite o ano inicial e aperte enter, em seguida o ano final e aperte enter.");
            anoI = scanner.nextInt();
            anoF = scanner.nextInt();
            livrosBiblioteca.pesquisarPorIntervaloAnos(anoI, anoF);
        }
    }
 
}
}
