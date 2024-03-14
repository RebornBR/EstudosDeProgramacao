package Sintaxe_Basica.Tipos_e_Variaveis;

public class tipos_e_variaveis {
    public static void main(String[] args) throws Exception {
    //variável x constantes
    // variável pode receber novos valores ao decorrer da aplicação
    // constante não poderá ser alterada em nenhum momento após sua declaração
    // utilizamos FINAL antes do tipo para declarar as constantes
    double salario = 1200 ; 
    System.out.println("Seu salário antes da alteração: $" + salario);
    salario = 1500;
    System.out.println("Seu salário após a alteração: $" + salario);
    
    final Double VALOR_DE_PI = 3.14;
    System.out.println("O valor de pi é: " + VALOR_DE_PI);
    // tente mudar VALOR_DE_PI na linha abaixo(17)
     

    }
}
