import java.util.Locale;
import java.util.Scanner;

public class TesteTryCatchException {
public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    try {// tenta, executa o bloco de comando abaixo, caso encontre a exception indicada no catch, executára o bloco de comando do catch.
    System.out.println("Digite seu nome:");
    String nome = scanner.nextLine();
  
    System.out.println("Digite sua idade:");
    int idade = scanner.nextInt();
    
    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();

    } catch( java.util.InputMismatchException e) { 
        /*
         chama a exception "java.util.InputMismatchException", que é uma exceção para números incorretos
         ou seja, se recebermos algo que não seja um número, ela será lançada 
         */
      System.out.println("Os campos de idade e altura precisam ser numéricos, e você deve usar o . no lugar da ,");

    }
    

    }

}
  

