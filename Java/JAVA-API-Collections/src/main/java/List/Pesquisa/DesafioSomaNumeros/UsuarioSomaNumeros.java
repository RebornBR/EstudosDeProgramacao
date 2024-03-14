package main.java.List.Pesquisa.DesafioSomaNumeros;

import java.util.Locale;
import java.util.Scanner;

public class UsuarioSomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        SomaNumeros numeroSoma = new SomaNumeros();
        String repetir = "";
        boolean x = true;
        int numero;
        while(x == true){
            System.out.println("Digite um número INTEIRO");
            numero = scanner.nextInt();
            numeroSoma.adicionarNumero(numero);
            System.out.println("Digite 'parar' para deixar de adicionar números");
            repetir = scanner.next();
            if(repetir.equals("parar")){
                x = false;
            }
        }
        
        numeroSoma.calcularSoma();
        numeroSoma.encontrarMaiorNumero();
        numeroSoma.encontrarMenorNumero();
        System.out.println("Numeros inseridos");
        numeroSoma.exibirNumeros();
    }
}
