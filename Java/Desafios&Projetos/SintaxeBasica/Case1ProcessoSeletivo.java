package SintaxeBasica;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Case1ProcessoSeletivo {

    /**
     * 
     * @return retorna um valor decimal(double) aleatório entre 1500 e 2500.
     */
static double SalarioContraProposta(){
    return ThreadLocalRandom.current().nextDouble(2100, 3500);
}    

public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    try {
    System.out.println("Você está em um processo seletivo da empresa FANTASIA, digite seu salário pretendido:");
    double salarioDesejado = scanner.nextDouble();
    double salarioBase = 2000;
    double contraProposta = SalarioContraProposta(); // recebe um valor aleatorio do metodo SalarioContraProposta

    if(salarioBase > salarioDesejado){
        System.out.println("Você está contratado");

    }else if(salarioBase < salarioDesejado && contraProposta < salarioDesejado) {
    System.out.println("O seu salário de R$" +salarioDesejado + " não pode ser aceito no momento, mas temos uma contra proposta no valor de R$" + contraProposta);

    }else {
        System.out.println("Aguardando outros candidatos...");
    }
        
        
    } catch (java.util.InputMismatchException e ) { // se essa exceção for disparada, executará o bloco abaixo
        System.out.println("Você digitou algo que não é númerico ou que não está no padrão, certifique-se de usar apenas números e . no lugar da ,");
    }
    

    }
}
