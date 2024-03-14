package Enum;

import java.util.Locale;
import java.util.Scanner;

public class CadastroEstadoDaPessoa {
    public static void main(String[] args) {;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Lista de estados disponíveis"); 
    for(EstadosBrasileiro uf: EstadosBrasileiro.values() ) { 
        // imprimi tudo que está no enum
        System.out.println(uf.getSigla() + "-" + uf.getNome());
     }

     //podemos implementar um switch case ou o if em um classe e criar um método lá ou fazer aqui mesmo
     // para usuário selecionar o estado entre os existentes no enum e chamar o método aqui.

     EstadosBrasileiro ufSelecionado; // chama o enum e ele agora é ufSelecionado
     System.out.println("Escolha entre 1 São paulo. e 2 Piauí");
     int escolha = scanner.nextInt();
     if(escolha == 1){
     ufSelecionado = EstadosBrasileiro.SAO_PAULO; //traz o enum SAO_PAULO, para obter apenas as informações dele
     System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());// obtem o nome do enum SAO_PAULO
     }else if(escolha == 2){
     ufSelecionado = EstadosBrasileiro.PIAUI;
     System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
     }else{
          System.out.println("Escolha apenas entre 1 e 2");
     }

    }
}
