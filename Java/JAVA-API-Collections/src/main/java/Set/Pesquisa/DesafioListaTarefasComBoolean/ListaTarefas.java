package main.java.Set.Pesquisa.DesafioListaTarefasComBoolean;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas{
     private Set<Tarefa> tarefasSet;

  public ListaTarefas() {
    this.tarefasSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefasSet.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    Tarefa tarefaParaRemover = null;
    if (!tarefasSet.isEmpty()) {
      for (Tarefa t : tarefasSet) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
          tarefaParaRemover = t;
          break;
        }
      }
      tarefasSet.remove(tarefaParaRemover);
    } else {
      System.out.println("O conjunto está vazio");
    }

    if(tarefaParaRemover == null) {
      System.out.println("Tarefa não encontrada!");
    }
  }

  public void exibirTarefas() {
    if(!tarefasSet.isEmpty()) {
      System.out.println("Sua lista de tarefas: " + tarefasSet);
    } else {
      System.out.println("Tarefa não encontrada!");
    }
  }

  public int contarTarefas() {
    return tarefasSet.size();
  }

/**
 * para cada Tarefa(t) presente em tarefasSet, que tiver seu concluida como true, será inserida
 * no HashSet tarefasConcluidas 
 */
  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa t : tarefasSet) {
      if (t.isConcluida()) {
        tarefasConcluidas.add(t);
      }
    }
    System.out.println("Tarefas concluidas: " + tarefasConcluidas);
    return tarefasConcluidas;
  }

  /**
   * forEach para cada Tarefa(t) presente em tarefasSet
   * <h3>Se diferente de true, ou seja, false. Tarefa(t) será adicionada ao nosso HashSet(tarefasNaoConcluidas)
   */
  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
    for (Tarefa t : tarefasSet) {
      if (!t.isConcluida()) { 
        tarefasNaoConcluidas.add(t);
      }
    }
    System.out.println("Tarefas pendentes: " + tarefasNaoConcluidas);
    return tarefasNaoConcluidas;
  }

/**
 * atraves do forEach verificamos se a nossa Tarefa(t) presente no HashSet(tarefaSet) tem uma descrição igual
 * ao nosso parametro descricao, se tiver chamamos o método setConcluida e dizemos que agora ela foi concluida(true)
 * 
 */
  public void marcarTarefaConcluida(String descricao) {
    for (Tarefa t : tarefasSet) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        t.setConcluida(true);
      }
    }
  }

  /**
   *  atraves do forEach verificamos se a nossa Tarefa(t) presente no HashSet(tarefaSet) tem uma descrição igual
   * ao nosso parametro descricao, se tiver chamamos o método setConcluida e dizemos que
   */
  public void marcarTarefaPendente(String descricao) {
    for (Tarefa t : tarefasSet) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        t.setConcluida(false);
/* OU
 Tarefa tarefaParaMarcarComoPendente = null;
    for (Tarefa t : tarefasSet) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefaParaMarcarComoPendente = t;  
        break;
      }
    }

    if (tarefaParaMarcarComoPendente != null) {
      if(tarefaParaMarcarComoPendente.isConcluida()) { // CHAMA O MÉTODO isConcluida()
        tarefaParaMarcarComoPendente.setConcluida(false); //setConcluida agora é false
        // todas as tarefas que foram encontradas pelo forEach, agora terão concluida como false
      }
    } else {
      System.out.println("Tarefa não encontrada na lista.");
    }
  }
 */
    }
  }
}

  public void limparListaTarefas() {
    if(tarefasSet.isEmpty()) {
      System.out.println("A lista já está vazia!");
    } else {
      tarefasSet.clear(); //LIMPA TODAS AS TAREFAS
    }
  }

}
    