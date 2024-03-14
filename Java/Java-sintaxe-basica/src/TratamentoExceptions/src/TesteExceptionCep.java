import java.util.Locale;
import java.util.Scanner;

public class TesteExceptionCep {

 /**
ExceptionCep nome da classe criada
poderíamos colocar esse método dentro da classe ExceptionCep, e depois o chamar aqui
mas deixemos isso para teste em POO.
  * @param cep parametro que será testado
  * @return o cep após o teste da exceção, isto é, se seu tamanho é diferente de 8 digitios. se for diferente de 8 digitos a exceção será lançada
  * @throws ExceptionCep nome da Exceção(exception) classe que criamos
  */   
static String verificaCep(String cep) throws ExceptionCep {                 
    if(cep.length() != 8){
            throw new ExceptionCep(); // se o tamanho do parametro(cep) for diferente de 8, essa exceção será lançada
        } 
          return cep ;
    }

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

try {
    System.out.println("Digite seu cep:");
    String meuCep = scanner.nextLine();
    String cepVerificado = verificaCep(meuCep); //meuCep se torna o parametro do metodo verificaCep
    System.out.println("Seu cep é: " + cepVerificado);
    
} catch (ExceptionCep e) {
    System.out.println("Cep inválido");
}
    
    


}


    
}
