package main.java.List.OperacoesBasicas.ListaTarefas;

import java.util.Locale;
import java.util.Scanner;

public class UsuarioCriandoTarefas {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    ListaTarefa usuarioListaDeTarefa = new ListaTarefa();
    boolean repetir = true; // condição para repetição do laço
    String x; //usada para armazenar um valor string para a repetição do laço


while(repetir == true){
    System.out.println("Digite a descrição da sua tarefa:");
    String tarefaUsuario = scanner.nextLine();
    usuarioListaDeTarefa.adicionarTarefa(tarefaUsuario);

    System.out.println("Aperte enter para continuar a adicionar tarefas ou digite 1 para parar");
    x = scanner.nextLine();    
    System.out.println("Número total de tarefas adicionadas: " + usuarioListaDeTarefa.obterNumeroTotalTarefas());

if(x.equals("1")){// compara se x é igual a 1
    repetir = false;
    System.out.println("Sua lista de tarefas: ");
    usuarioListaDeTarefa.obterDescricoesTarefas();
}

}

}

}
