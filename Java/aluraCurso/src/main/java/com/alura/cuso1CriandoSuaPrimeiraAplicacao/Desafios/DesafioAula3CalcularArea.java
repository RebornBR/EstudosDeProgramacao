package com.alura.cuso1CriandoSuaPrimeiraAplicacao.Desafios;

import java.util.Scanner;

public class DesafioAula3CalcularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decisao = 0;
        double ladoQuadrado = 0;
        double resultado;
        double PI = 3.14;
        double raio = 0;
        System.out.println("Digite 1 para calcular area do quadrado ou 2 para area do circulo ");
        decisao = scanner.nextInt();

        if (decisao == 1){
            System.out.println("Digite o lado do quadrado");
            ladoQuadrado = scanner.nextDouble();
            resultado = Math.pow(ladoQuadrado, 2);
            System.out.println("A area do quadrado é de: " + resultado);
        }else if (decisao == 2) {
            System.out.println("Digite o raio do circulo");
            raio = scanner.nextDouble();
            resultado = (Math.pow(raio, 2)) * PI;
            System.out.println("A area do circulo é de: " + resultado);
        }else {
            System.out.println("Escolha errada");
        }

    }

}
