package main.java.Set.Pesquisa.AgendaContatos;

import java.util.Locale;
import java.util.Scanner;

public class UsuarioAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        AgendaContatos contatosUsuario = new AgendaContatos();
        String nome, repetir, numero, desejaAlterarContato;
        boolean x = true;
        //2 contatos adicionados para testar o método pesquisarPorNome
        contatosUsuario.adicionarContato("Roberto", "81988000990");
        contatosUsuario.adicionarContato("Alan", "71984040980");
        
System.out.println("Temos 2 contatos, 1 inicia com a letra R e outro com a Letra A, MAIÚSCULO, digite a letra inicial para os retornar.");
        while(x == true){
            System.out.println("Digite o nome do contato a ser pesquisado");
            nome = scanner.next();
            contatosUsuario.pesquisarPorNome(nome);
            System.out.println("Digite '1' para parar");
            repetir = scanner.next();
            if(repetir.equals("1")){
                x = false;
            }
        }

        x = true;
        while(x == true){
            System.out.println("Digite o nome: ");
            nome = scanner.next();
            System.out.println("Digite o numero: ");
            numero = scanner.next();
            contatosUsuario.adicionarContato(nome, numero);;
            System.out.println("Digite 1 para parar:");
            repetir = scanner.next();
            if(repetir.equals("1")){
                x = false;
            }
        }

        contatosUsuario.exibirContatos();
        System.out.println("Deseja alterar contato ? Digite '1' para Sim");
        desejaAlterarContato = scanner.next();
        
        if(desejaAlterarContato.equals("1")){
        x = true;
        while(x == true){
            System.out.println("Digite o nome do contato a ser modificado");
            nome = scanner.next();
            System.out.println("Digite o novo numero");
            numero = scanner.next();
            contatosUsuario.atualizarNumeroContato(nome, numero);
            System.out.println("Digite '1' para parar");
            repetir = scanner.next();
            if(repetir.equals("1")){
                System.out.println("Alteração realizada, lista atualizada:");
                contatosUsuario.exibirContatos();
                x = false;
            }    
    }         
 }
            System.out.println("Digite o nome do contato a ser pesquisado");
            nome = scanner.next();
            contatosUsuario.pesquisarPorNome(nome);
  
}
}
