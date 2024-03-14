package main.java.List.Ordenacao.OrdenacaoNumero;

import java.util.Locale;
import java.util.Scanner;

public class UsuarioOrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ListaNumero listandoNumeros = new ListaNumero();
        boolean x = true;
        String repetir;
        int numeroDigitado;
        while(x == true){
            System.out.println("Digite um número");
            numeroDigitado = scanner.nextInt();
            listandoNumeros.adicionarNumero(numeroDigitado);
            System.out.println("Digite '1' para parar");
            repetir = scanner.next();
            if(repetir.equals("1")){
                x = false;
            }
        }
        listandoNumeros.numeroOrdenado();
        listandoNumeros.numeroOrdenadoReverso();
        listandoNumeros.exibirNumeros();

    }
}
