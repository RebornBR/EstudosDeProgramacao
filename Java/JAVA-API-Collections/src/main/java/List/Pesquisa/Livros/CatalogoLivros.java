package main.java.List.Pesquisa.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
     //atributo
  private List<Livro> livroList;
/**
 * construtor, cria uma ArrayList
 */
  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }
/**
 * Temos 3 parametros, que formarão um Livro(new Livro(titulo, autor, anoPublicacao))
 * esse novo livro será adicionado ao nosso Array livroList
 * @param titulo
 * @param autor
 * @param anoPublicacao
 */
  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

/**
 * <h3>Nosso metódo/função pesquisarPorAutor, com parametro autor, que será utilzado para comparar
 * com os autor pressente na nossa Array livroList<h3>
 * Criamos uma List chamada livrosPorAutor que é do tipo Livro, ou seja, só recebe Livro.
 * Vefificamos se nosso array livroList é diferente de vazio, se não for, isto é, se nosso livroList for vazio
 * retornaremos a mensagem "A lista está vazia". Se nosso livroList for diferente de vazio, executaremos nosso forEach.
 * <h3>Nosso forEach, basicamente diz que para cada Livro(l) presente no array livroList, será obtido o autor do livro
 * presente no livroList em cada posição, atraves do método/função getAutor que será comparado ao parametro autor.
 * se forem identicos, esse livro será adicionado ao arraz que criamos, chamado livroPorAutor.
 * ao final retornaremos o array livroPorAutor, que terá todos os autores que foram identicos ao encontros no array livroList
 * <h3>
 * 
 */
  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
      System.out.println("Livros por autor: " + livrosPorAutor);
      return livrosPorAutor;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
/**
 * <h3>Noso metódo/função pesquisarPorIntervaloAnos com 2 parametros, que serão utilizados para comparação com 
 * o ano de publicação dos livros presentes em livroList<h3>
 * criamos uma List do tipo Livro, que só receberá livros.
 * verificamos se nosso livroList está vazio, ou seja, se é diferente de vazio. Caso seja, iniciamos forEach e retornamos
 * nosso array livrosPorIntervaloAnos.
 * <h3>Nosso forEach, basicamente diz que para cada Livro(l) presente no array livroList. Nosso Livro(i) vai obter com a função 
 * getAnoPublicacao o ano de publicação de cada Livro presente no array livroList. caso o ano de publicação seja 
 * maior ou igual ao anoInicial e menor ou igual ao anoFinal. Esse livro será adicionado ao nosso array chamado 
 * livrosPorIntervaloAnos<h3>
 */
  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
      System.out.println("Livros por ano: " + livrosPorIntervaloAnos);
      return livrosPorIntervaloAnos;

    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  /**
   * Compara o parametro titulo com o titulo presente no array livroList.
   * se forem iguais, retorna o livro com o respectivo titulo. E nosso livroTitulo será igual a l
   */
  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;
          break;
        }
      }
      System.out.println("Livros por titulo: " + livroPorTitulo);
      return livroPorTitulo;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public void exibirLivros(){
    if(!livroList.isEmpty()){
      System.out.println(livroList);
    }else{
      System.out.println("Lista Vazia");
    }
  }
}
