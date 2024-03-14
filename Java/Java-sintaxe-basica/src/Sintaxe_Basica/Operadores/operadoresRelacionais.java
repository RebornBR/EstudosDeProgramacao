package Sintaxe_Basica.Operadores;

import java.util.Locale;
import java.util.Scanner;

public class operadoresRelacionais {
     public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // necessario para receber valores do usuario


     System.out.println("Digite o primeiro número");
     int numero1= scanner.nextInt(); 
     System.out.println("Digite o segundo número");
     int numero2 = scanner.nextInt();
     
     System.out.println("Numero 1 = " + numero1 + "  " + " Numero 2 = " + numero2);
     
     boolean resultado = numero1 == numero2;
         System.out.println( numero1 + " igual ao " + numero2 + " ? " + resultado);

     resultado = numero1 > numero2; 
          System.out.println( numero1 + " é maior que " + numero2 + " ? " + resultado);


     resultado = numero1 < numero2;
          System.out.println( numero1 + " é menor que " + numero2 + " ? " + resultado);


     resultado = numero1 != numero2;
          System.out.println( numero1 + " é diferente de " + numero2 + " ? " + resultado);
        System.out.println("======================================");
        System.out.println("---------------------------------------------------------------------------------------------------");
 
        System.out.println("Operadores lógicos:");

        System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt(); // altere para testar com outros números
        System.out.println("Digite o Segundo número");
        int num2 = scanner.nextInt(); // altere para testar com outros números

        System.out.println(num1 + " Maior que(>) 4 ||(OR) " + num2 + " Menor que(<) 20 " );
        if(num1 > 4 && num2 < 20){
        System.out.println("Verdadeira, pois ambas condições são verdadeira");
        } else {
            System.out.println("Falsa, pois uma ou as 2 condições são falsas");
        }

        System.out.println(num1 + " Maior que(>) 4 ||(OR) " + num2 + " Menor que(<) 20 " );

        if(num1 > 4 || num2 < 20){
           System.out.println("Verdadeira, pois uma ou ambas condições são verdadeiras");
        }else{
           System.out.println("Falso, pois nenhuma condição é verdadeira");
        }
            System.out.println("altere os valroes das variaveis das linhas 28 e 29, para testar outras possibilidades.");
    }
}
