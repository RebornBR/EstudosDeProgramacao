import java.util.Locale;
import java.util.Scanner;

public class RepeticaoForARRAY {

    public static void main(String[] args ) throws Exception{
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int X = 0; // variável de controle, será utilizada como indice do array
    String nomeAlunos[]= {"Felipe" , "Roberto", "João" , "Pedro"};
    

    for(; X <= nomeAlunos.length ;){ //nomeAlunos.length significa o tamanho do array
    /*
    enquanto nossa variável X, que está sendo utilizada como indice, for menor que o tamanho do array 
    nomeAlunos.length, fará os comandos abaixo.
    */    
    System.out.println("O aluno no indice [" + X + "] se chama " + nomeAlunos[X]);
    X++;
    }


   }
}
