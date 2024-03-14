package main.java.List.Ordenacao.OrdenacaoPessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
 /* 
  * Implementamos a interface Comparable que terá o tipo pessoa.
  * a implementação permite que utilizemos seu método na nossa classe Pessoa
 */
  //atributos
  private String nome;
  private int idade;
  private double altura;

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public int compareTo(Pessoa p) { // método compareTo
    return Integer.compare(idade, p.getIdade());
  /*
   * Integer tem o método compare, ira ordena os elementos, os maiores entre idade e o p.getIdade
   * Utilizamos sempre o wrapper class, ou seja, Integer, Float, Double 
   */
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public double getAltura() {
    return altura;
  }

  
  public String toString() {
    return "Pessoa{" + "nome= " + nome  + ", idade= " + idade + ", altura= " + altura + '}' + "\n";
  }
}
/*

 * Comparator precisa ser utilizado fora da classe principal.
 * método compare, ordena os elementos
 */
class ComparatorPorAltura implements Comparator<Pessoa> {
  @Override
  public int compare(Pessoa p1, Pessoa p2) {
    return Double.compare(p1.getAltura(), p2.getAltura());
  }
}
