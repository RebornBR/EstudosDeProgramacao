package main.java.List.OperacoesBasicas.ListaTarefas;

public class Tarefa { 
// nossa classe Objeto
private String descricao;

public Tarefa(String descricao){// método construtor
    this.descricao = descricao;
}
public String getDescricao() {
    return descricao;
}

public String toString(){ 
//necessário para que seja retornado a nossa lista, no método obterDescricaoTarefa()
    return "Descrição das suas tarefas= " + descricao  + "\n";
//podemos já deixar formatado, ou seja, definido como vai retornar
 
 

}


}
