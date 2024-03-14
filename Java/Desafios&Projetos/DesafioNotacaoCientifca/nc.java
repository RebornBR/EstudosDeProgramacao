package DesafioNotacaoCientifca;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class nc{
    public static void main(String[] args) {
        double x ;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int parar = 0;

        while(parar != 1){
        System.out.println("Digite o valor de x:");
        x = scanner.nextDouble();
        double resultado = arredondar(x);
        System.out.println("valor arredondado " + resultado);

        }
    }
    private static double arredondar(double redondo) {

        double arredondamento = Math.round(redondo);
        if (redondo > 0.0 && redondo < 0.9) {
            DecimalFormat df = new DecimalFormat("0.0000E0");
            Double valorDouble =  redondo;
            System.out.println(df.format(valorDouble));  // podemos usar o decimal format para todos, mas será retornado apenas a notação E
        }
        else if(redondo > 0 && redondo < 9.99){
            System.out.println(redondo + " -------qNC------- "); // pode usar um printf, pra definir o máximo de casas decimais retornadas
        }
        else if(redondo > 10 && redondo < 99.99) {
            System.out.println(redondo / 10 + " x 10^+1 ");
        }
        else if (redondo > 100 && redondo < 999.99) {
            System.out.println(redondo / 100 + " x 10^+2 ");
            System.out.println(arredondamento/100 + " x 10^+2");
        }
        else if (redondo > 1000 && redondo < 9999.99) {
            System.out.println(redondo / 1000 + " x 10^+3 ");
        }
        else if (redondo > 10000 && redondo < 99999.99) {
            System.out.println(redondo / 10000 + " x 10^+4 ");
        }
        else if (redondo > 100000 && redondo < 999999.99) {
            System.out.println(redondo / 100000 + " x 10^+5 ");
        }
        else{
            System.out.println("Me ajude cidadão, se você não sabe, imagine eu. (-_-)");
        }
        return Math.round(redondo);
    }
}