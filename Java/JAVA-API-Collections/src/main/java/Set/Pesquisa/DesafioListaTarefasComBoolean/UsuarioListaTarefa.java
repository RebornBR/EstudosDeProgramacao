package main.java.Set.Pesquisa.DesafioListaTarefasComBoolean;

import java.util.Locale;
import java.util.Scanner;

public class UsuarioListaTarefa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String descriçãoTarefa, repetir;
        boolean x = true;
        ListaTarefas tarefaUsuario = new ListaTarefas();
        tarefaUsuario.adicionarTarefa("VARRER");
        tarefaUsuario.adicionarTarefa("ESTUDAR");
        tarefaUsuario.adicionarTarefa("JOGAR");
        tarefaUsuario.adicionarTarefa("JANTAR");
        tarefaUsuario.adicionarTarefa("ALMOÇAR");
        tarefaUsuario.adicionarTarefa("DORMIR");
        tarefaUsuario.adicionarTarefa("ACORDAR");
        tarefaUsuario.exibirTarefas();
        while (x == true) {
            System.out.println("Digite de forma identica a tarefa que foi concluida:");
            descriçãoTarefa = scanner.next();
            tarefaUsuario.marcarTarefaConcluida(descriçãoTarefa);
            System.out.println("Digite '1' para parar");
            repetir = scanner.next();
            if(repetir.equals("1")){
                x = false;
            }
        }

        x = true;
        while (x == true) {
            System.out.println("Digite de forma identica a tarefa que não foi concluída:");
            descriçãoTarefa = scanner.next();
            tarefaUsuario.marcarTarefaPendente(descriçãoTarefa);
            System.out.println("Digite '1' para parar");
            repetir = scanner.next();
            if(repetir.equals("1")){
                x = false;
            }        
        }
        tarefaUsuario.exibirTarefas();
        tarefaUsuario.obterTarefasConcluidas();
        tarefaUsuario.obterTarefasPendentes();
    }
}
