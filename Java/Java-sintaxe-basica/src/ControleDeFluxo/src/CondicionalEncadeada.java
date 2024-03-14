import java.util.Locale;
import java.util.Scanner;

public class CondicionalEncadeada {
    
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite a nota do aluno");
    int nota = scanner.nextInt();
    
    if(nota >= 7){
        System.out.println("Aprovado"); // se condição 1 for atendida, faz isso.
    }else if(nota >= 5 && nota <7) {
        System.out.println("Recuperação"); // se condição 2 for atendida, faz isso
    } else {
        System.out.println("Reprovado");  // se nenhuma condição for atendida, faz isso 
    }
     
    }  
}
