package Sintaxe_Basica.Operadores;

public class operadores {
    public static void main(String[] args) throws Exception {
    // diferente da matemática comum, o simbolo "=" não tem o mesmo significado em programação
    // "=" significa atribuição, ou seja, eu atribuo um valor a uma variável, n significa que aquela variável seja igual a tal coisa.
    int numUnario = 2; 
    int numUnario2 = 2;
    
    boolean umMaiorQueDois = false;

    //operadores aritmétricos 
    int soma = 2 + 3;
    int subtracao = 3 - 2;
    int divisao = 6 / 2;
    int multiplicacao = 3 * 2; 
    int modulo = 10 % 3; //retorna o resto da divisão

    // Teste Unários
    System.out.println("Unários -, ++, -- e !");
    System.out.println("Valor atual " + numUnario );
    System.out.println(- numUnario); // negativa o valor 
    System.out.println( ++ numUnario ); // incrementa o valor em 1
    System.out.println(-- numUnario2); // decrementa o valor em 1
    System.out.println("---------------------------------------");
    System.out.println("1 é maior que 2 ? " + umMaiorQueDois); 
    System.out.println("Inverti: " + !umMaiorQueDois); // ! inverte o valor   
    System.out.println("---------------------------------------");
    //Usando unários
    int numUnario3= 2;
    System.out.println("Antes ++: " + numUnario3);
    numUnario3++; // podemos usar numUnario-- , mas nesse caso, será decrementado 1.
    System.out.println("Após ++ " + numUnario3);
    System.out.println("------------------------------------------");

   //ternários
     int a, b;
     a = 5;
     b = 6;
     String resultado = (a==b) ? "verdadeiro" : "false";
     System.out.println(resultado);

     /* EXEMPLO DE CONDICIONAL TERNÁRIO UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/
}
    
}
