package main.java.Set.Ordenacao.DesafioListaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno  implements Comparable<Aluno>{
  //atributos
  private String nome;
  private Long matricula;
  private double media;

  public Aluno(String nome, Long matricula, double media) {
    this.nome = nome;
    this.matricula = matricula;
    this.media = media;
  }

  public String getNome() {
    return nome;
  }

  public Long getMatricula() {
    return matricula;
  }

  public double getMedia() {
    return media;
  }

/////////////////////////////////////////
/*
 * Método para impedir a adição de alunos com mesma matricula.  definimos a matricula como algo único, ou seja, só pode haver 1 para  cada aluno,
 *  isto significa que se tentarmos adicionar um aluno com uma matricula já adicionada, ele não será adicionado
 */
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Aluno aluno)) return false;
    return Objects.equals(getMatricula(), aluno.getMatricula());
  }

  
  public int hashCode() {
    return Objects.hash(getMatricula());
  }
/////////////////////////////////////////

/*
 * Método da implementação do comparable, sempre que utilizarmos um comando do comparable, sua ordenação será realizada pelo nome.
 * Esse método fica estabelecido como a organização padrão do nosso Aluno, toda vez que tivermos um aluno, ele sera ordenado
 * pelo nomme. Quando utilizarmos o TreeSet, ele organizará pelo nomme de forma crescente
 */
/////////////////////////////////////////
  public int compareTo(Aluno aluno) {
    return nome.compareTo(aluno.getNome());
  }
/////////////////////////////////////////


/*
 * Forma que vamos retornar os nossos alunos, toda vez que nossa list, set, array for um aluno, será retornado 
 * no formato abaixo
 */
  public String toString() {
    return "Aluno{" +
        "nome='" + nome + '\'' +
        ", matricula=" + matricula +
        ", media=" + media +
        '}';
  }
}
/*
 * Implementação do nosso comparator, ele não altera a classe, por isso é declarado fora do seu escopo
 * basicamente, ele utiliza o comando compare, para ordenar alunos pela sua média
 */
class ComparatorNota implements Comparator<Aluno> {
  @Override
  public int compare(Aluno o1, Aluno o2) {
    return Double.compare(o1.getMedia(), o2.getMedia());
  }
}
