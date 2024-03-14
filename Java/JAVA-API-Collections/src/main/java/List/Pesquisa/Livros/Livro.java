package main.java.List.Pesquisa.Livros;

public class Livro {
    //atributos
  private String titulo;
  private String autor;
  private int anoPublicacao;
//construtor Livro, toda vez que criarmos um livro, ele precisará dos atributos abaixo
  public Livro(String titulo, String autor, int anoPublicacao) { 
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnoPublicacao() {
    return anoPublicacao;
  }

  
  public String toString() { // retorna nosso livro, nesse formato
    return "{" + " titulo= " + titulo  + ", autor= " + autor + ", ano de puublicacão= " + anoPublicacao +'}' + "\n";
  }
}
