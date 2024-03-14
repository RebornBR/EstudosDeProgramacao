package main.java.Set.OperacoesBasicas.ConjuntoConvidado;

import java.util.Locale;
import java.util.Scanner;

public class UsuarioConjuntoConvidados{
       public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       ConjuntoConvidados usuarioConjunto = new ConjuntoConvidados();
       String repetir, nomeConvidado;
       int codigoConvidado;
       boolean x = true;
       //repetir e x. Serão utilizadas como condicionais para nosso loop while

       while(x == true){
       System.out.println("Digite o nome do convidado");
       nomeConvidado = scanner.next();
       System.out.println("Digite o código do convite");
       codigoConvidado = scanner.nextInt();
       System.out.println("Digite '1' para parar.");
       repetir = scanner.next();
       usuarioConjunto.adicionarConvidado(nomeConvidado, codigoConvidado);
       if(repetir.equals("1")){
        x = false;
       }
       }
       System.out.println("Lista de convidados:");
       usuarioConjunto.exibirConvidados();
       System.out.println("Deseja remover algum convidado ? digite '1' para iniciar a remoção");
       String escolhaRemover = scanner.next();
       if(escolhaRemover.equals("1")){
        x = true;
        while(x == true){
            System.out.println("Digite o código do convidado que será removido");
            codigoConvidado = scanner.nextInt();
            usuarioConjunto.removerConvidadoPorCodigoConvite(codigoConvidado);
            System.out.println("Digite '1' para parar");
            repetir = scanner.next();
            if(repetir.equals("1")){
                x = false;
            }
        }
       }
       System.out.println("Lista atualizada após a remoção");
       usuarioConjunto.exibirConvidados();
       System.out.println("Total de convidados: " + usuarioConjunto.contarConvidados());
       }
}