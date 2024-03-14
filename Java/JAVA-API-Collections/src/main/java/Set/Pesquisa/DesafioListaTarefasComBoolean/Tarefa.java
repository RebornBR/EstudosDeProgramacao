package main.java.Set.Pesquisa.DesafioListaTarefasComBoolean;

public class Tarefa {
    private String descricao;
  private boolean concluida;

  public Tarefa(String descricao) {
    this.descricao = descricao;
    this.concluida = false; //por padrão toda tarefa, especificamente o concluida é false(falso)
  }

  public String getDescricao() {
    return descricao;
  }

  public boolean isConcluida() {
    return concluida;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setConcluida(boolean concluida) {
    this.concluida = concluida;
  }

  @Override
  public String toString() {
    return "Tarefa{"+ "descricao= " + descricao  + ", foi concluída ? " + concluida + '}' + "\n";
  }
}
