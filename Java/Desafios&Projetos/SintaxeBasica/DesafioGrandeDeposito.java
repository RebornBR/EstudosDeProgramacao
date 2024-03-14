package SintaxeBasica;
import java.util.Locale;
import java.util.Scanner;

public class DesafioGrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    double valor;
    System.out.println("Digite o valor deposito");
    valor = scanner.nextDouble();
    if(valor > 0){ 
        System.out.println("Depósito de R$" + valor + " Realizado com sucesso");
    }else if(valor == 0){
        System.out.println("Inválido, digite um valor maior que R$0");
    }else{
        System.out.println("Progama encerrado, tente novamente!");
    }

    }
}
