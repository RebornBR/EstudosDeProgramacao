package main.java.Set.Ordenacao.DesafioListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //Faça uma main depois
  private Set<Aluno> alunosSet;

  public GerenciadorAlunos() {
    this.alunosSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, Long matricula, double media) {
    alunosSet.add(new Aluno(nome, matricula, media));
  }

  /**
   * 
   * Criamos um Aluno alunoParaRemover que recebe o valor null. E usamos o forEach que para cada Aluno(a) presente
   * no nosso alunosSet, fará a comparação se o nosso parametro matricula é igual a matricula do Aluno presente no
   * alunosSet, se for igual, nosso alunoParaRemover recebe  Aluno(a), como sua atribuição, após isso utilizamos 
   * o comando remove, que irá remover o alunoParaRemover que recebeu o Aluno(a) como atributo.
   * em outras palavras, iremos remover o elemento que é igual ao alunoParaRemover.
   */
  public void removerAlunoPorMatricula(long matricula) {
    Aluno alunoParaRemover = null;
    if (!alunosSet.isEmpty()) {
      for (Aluno a : alunosSet) {
        if (a.getMatricula() == matricula) {
          alunoParaRemover = a;
          break;
        }
      }
      alunosSet.remove(alunoParaRemover);
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }

    if (alunoParaRemover == null) {
      System.out.println("Matricula não encontrada!");
    }
  }

/**
 * Com a implementação do comparable na nossa classe Aluno e a criação do nosso método que utiliza o compareTo
 * para organizar os Aluno por nome, ao utilizarmos o TreeSet que organiza de forma crescente.
 * nosso HashSet, nossos Alunos, serão ordenados pelo seu nome
 */
  public void exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
    if (!alunosSet.isEmpty()) {
      System.out.println(alunosPorNome);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }


/**
 * organizamos nossa HashSet(alunosSet) criando o alunosPorNota que é um novo TreeSet(ordena de forma crescente)
 * e dizemso que esse TreeSet é um novo comparatorPorNota, o comparator que implementamos na nossa classe produto
 * que usa o compare, método que ordena por media. Com isso nosso TreeSet que ordena de forma crescente saberá 
 * que deve organizar de forma crescente pela media do aluno.
 */
  public void exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
    if (!alunosSet.isEmpty()) {
      alunosPorNota.addAll(alunosSet);
      System.out.println(alunosPorNota);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }
}
