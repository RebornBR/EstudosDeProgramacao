package SintaxeBasica.DesafioControleFluxo.src;
import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int a,b;
        try { //executa o bloco abaixo
System.out.println("Digite o primeiro número");
a = scanner.nextInt();
System.out.println("Digite o segundo número:");      
b = scanner.nextInt();    
int resultado = contar(a, b);// chama o método contar(), que tem a exception. Os parametros utilizados são a e b.
int contador = 1;
for (;contador <= resultado; contador++){ // enquanto contador <= resultado fará contandor + 1, ou seja, contador++ e exbirá a mensagem. 
    System.out.println("Número " + contador);  
}
        } catch (ParametrosInvalidosException e) { //se o segundo parametro, b, for menor que a, dispara a exceção e a executa abaixo
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
 }

    /**
     * @param parametro1 
     * @param parametro2 
     * @throws ParametrosInvalidosException é disparada quando parametro2 é maior que o parametro1
     */
static int contar (int parametro1, int parametro2) throws ParametrosInvalidosException {
if(parametro1 > parametro2) {
    throw new ParametrosInvalidosException();
}
return parametro2 - parametro1; // o que o metodo faz, retorna.
}


}
