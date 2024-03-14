package main.java.Set.OperacoesBasicas.DesafioConjuntoPalavrasUnicas;

import java.util.Locale;
import java.util.Scanner;

public class UsuarioPalavrasUnicas{
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            PalavrasUnicas usuarioPalavra = new PalavrasUnicas();
            String palavraParaAdicionar, palavraParaRemover, adivinhaUsuario ,repetir;
            boolean x = true;
            
            usuarioPalavra.adicionarPalavra("JAVA");
            usuarioPalavra.adicionarPalavra("KOTLIN");
            System.out.println("Existem 2 linguagens de programação no conjunto, as tente achar");
            System.out.println("Digite o nome da linguagem em MAIÚSCULO");
            adivinhaUsuario = scanner.next();
            usuarioPalavra.verificarPalavra(adivinhaUsuario);
            
            while(x == true){
               System.out.println("Digite UMA palavra");
               palavraParaAdicionar = scanner.next();
               usuarioPalavra.adicionarPalavra(palavraParaAdicionar);
               System.out.println("Digite '1' para parar");
               repetir = scanner.next();

               if(repetir.equals("1")){
                  x = false;
               }
            }
            usuarioPalavra.exibirPalavrasUnicas();
            x = true;
       
            while(x == true){
               System.out.println("Digite uma palavra a ser removida");
               palavraParaRemover = scanner.next();
               usuarioPalavra.removerPalavra(palavraParaRemover);
               System.out.println("Digite '1' para parar");
               repetir = scanner.next();
               if(repetir.equals("1")){
                  x = false;            
               System.out.println("Lista após a remoção: ");
               usuarioPalavra.exibirPalavrasUnicas();
               }
            }

         }
}