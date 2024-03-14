import java.util.Locale;
import java.util.Scanner;

public class RepeticaoForEach {
    public static void main (String[] args ) throws Exception{
    String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
	for(String aluno : alunos) { 
    /*
     String aluno : alunos -> De forma abreviada, é criada uma variável nome obtendo um elemento do vetor a cada ocorrência;
     A impressão de cada aluno é realizada.
     e para cada posição do array executará o comando abaixo
     */
	  System.out.println("O nome do aluno é " + aluno);
    }  

    }
    
}
