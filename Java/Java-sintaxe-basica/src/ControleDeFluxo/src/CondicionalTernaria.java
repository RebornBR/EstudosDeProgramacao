import java.util.Locale;
import java.util.Scanner;

public class CondicionalTernaria {
    public static void main (String[] args ) throws Exception {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Ternário composto");
    System.out.println("Digite a nota do aluno");
    int nota = scanner.nextInt();
    
    String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
	System.out.println(resultado);
    /*
     se nota for >= 7 retorna aprovado, se não for, retorna reprovado.
     tem a mesma função do if
     código com if: (Condicional composta)

     if(nota >= 7){
        System.out.println("Aprovado"); // se condição verdadeira, faz isso.
    }else{
        System.out.println("Reprovado"); // senão, faz isso.
    }

     */
    System.out.println("Ternário encadeado");
    System.out.println("Digite a nota do aluno");
    nota = scanner.nextInt();

    String resultado2 = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);
    /*
     se nota for maior ou igual a 7, retorna aprovado. se for maior ou igual a 5 E(AND) menor que 7, retorna recuperação.
     se nenhuma condição for atendida(verdadeira), retorna reprovado.
     tem a mesma função do if

     código com if: (condicional encadeada)
     
       if(nota >= 7){
        System.out.println("Aprovado"); // se condição 1 for atendida, faz isso.
    }else if(nota >= 5 && nota <7) {
        System.out.println("Recuperação"); // se condição 2 for atendida, faz isso
    } else {
        System.out.println("Reprovado");  // se nenhuma condição for atendida, faz isso 
    }
     */


    }
    
}
