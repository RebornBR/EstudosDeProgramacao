import java.util.Locale;
import java.util.Scanner;

public class CondicionalComposta {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite a nota do aluno");
    int nota = scanner.nextInt();
    
    if(nota >= 7){
        System.out.println("Aprovado"); // se condição verdadeira, faz isso.
    }else{
        System.out.println("Reprovado"); // senão, faz isso.
    }
     
    }  


}
