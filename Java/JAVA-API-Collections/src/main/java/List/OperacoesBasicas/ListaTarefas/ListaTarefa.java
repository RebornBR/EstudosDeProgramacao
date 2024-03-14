package main.java.List.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
private List<Tarefa> tarefasList;
//criamos um List e usamos o diamond/generics, 
//isto significa que a lista será formada apenas por Tarefa.
//Tarefa é nossa classe, nosso objeto, nosso tipo.
public ListaTarefa(){//construtor
    this.tarefasList = new ArrayList<>();
/*
 toda vez que criarmos uma ListaTarefa, estaremos criando um arraylist
 */
}
public void adicionarTarefa(String descricao){
    tarefasList.add( new Tarefa(descricao));
/*
 adicionar uma tarefa no nosso array.
 instaciamos nossa Tarefas com o new e passamos o parametro, ou seja, estamos adcionando
 um Tarefa, mais especificamente a sua descrição, descrição se torna o parametro, quando
 formos utilizar seu método/função podemos a substituir no main
 */
}

public void removerTarefa(String descricao){
    if(!tarefasList.isEmpty()){
    List<Tarefa> tarefasParaRemover = new ArrayList<>(); // cria uma lista, com tudo que vamos remover.
    for(Tarefa t : tarefasList){ // for each TarefasList
        if(t.getDescricao().equalsIgnoreCase(descricao)){
/*
 t chama o método getDescrição e compara com a descrição da tarefa
 faz a comparação com tudo dentro da nossa TarefaList
 */
tarefasParaRemover.add(t); // se forem identicos, adiciona a tarefasParaRemover
        }
tarefasList.removeAll(tarefasParaRemover);
/*chamamos nossa tarefasList e usamos o comando removerAll() e colocamos nossa lista
tarefasParaRemover, com isso removeremos
*/
}
 }else {
    System.out.println("Tarefa não encontrada");
 }
}


public int obterNumeroTotalTarefas(){
    return tarefasList.size(); 
//retorna o tamanho do array.
}
public void obterDescricoesTarefas(){
    System.out.println(tarefasList); 
// imprime/exibe toda a nossa lista
}
public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    listaTarefa.adicionarTarefa("Comprar leite");
    listaTarefa.adicionarTarefa("Estudar para o exame");
    listaTarefa.adicionarTarefa("Fazer exercícios");
     // Exibindo o número total de tarefas na lista
     System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

     // Exibindo as descrições das tarefas na lista
     listaTarefa.obterDescricoesTarefas();
 
     // Removendo uma tarefa da lista
     listaTarefa.removerTarefa("Trabalhar");
 
     // Exibindo o número total de tarefas na lista após a remoção
     System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
 
     // Exibindo as descrições das tarefas atualizadas na lista
     listaTarefa.obterDescricoesTarefas();
 
     // Removendo uma tarefa da lista quando a lista está vazia
     listaTarefa.removerTarefa("Estudar para o exame");
 
     // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
     System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
     listaTarefa.obterDescricoesTarefas();

}
}
