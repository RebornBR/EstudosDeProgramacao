package Sintaxe_Basica.Anatomia_de_classes;
public class Anatomia_Classes { // todos os arquivos, ou pelo menos a maioria deles, começam dessa forma. Deve conter o mesmo nome do arquivo.
    public static void main(String[] args) throws Exception { // torna todo o codigo dentro dele, isto é, dentro das {}, executavel, possibilitando o run, para rodar os códigos. Similar fun main() kotlin
        System.out.println("Hello, World!");

        // toda variável começa com o TIPO nomeVariavel = valor variavel e não esquecça do ; após declarar o valor
        String nickName = "Reborn" ; 
        
        // as declaraçõoes com apenas o tipo e nome da variavel podem ser alteradas ao decorrer do código, se quisermos que o valor da variavel nunca seja alterado, utilizamos o FINAL.
        
        final double PI = 3.14 ; // o valor não pode ser alterado ao decorrer do código.

        //TESTE FUNÇÃO/MÉTODO
        double number1 = 3.5;
        double number2 = 2.5;
        double resultado = somar(number1, number2); // criamos uma variavel para receber o valor da função/método somar e dentro do () da função indicamos as duas variaveis que serão utilizadas na função.
        System.out.println("Resultado Soma:");
        System.out.println(resultado);

        String primeiroNome = "Paulo";
        String segundoNome = "Gustavo";
        String nome = nomeCompleto(primeiroNome, segundoNome); // criação da variável que irá receber o retorno do método
        System.out.println(nome); // não precisamos criar uma variavel para armazenar o retortno do metodo/função
        // podemos simplesmente utilizar 
        System.out.println("teste da outra forma:");
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
        
    }
    public static double somar (double num1, double num2){ 
    // métodos/funções similar ao fun nomeFunção():Tipo retorno{ oq a função faz} do kotlin
        return num1 + num2;
    }

    public static String nomeCompleto (String nome1, String nome2){
        return "Junção primeiro nome e segundo nome " + nome1.concat(" ").concat(nome2); //concat é a concatenação, mas podemos usar o + .
         // return nome1 + " " + nome2 ; // Tambem funciona dessa forma.
    }
}
