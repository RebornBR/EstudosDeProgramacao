package com.alura.cuso1CriandoSuaPrimeiraAplicacao.Desafios;

import java.util.Scanner;

public class DesafioAula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        System.out.println("Digite o primeiro número");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        num2 = scanner.nextDouble();
        if(num1 >= 0){
            System.out.println("primeiro numero positivo");
        }else {
            System.out.println("primeiro numero negativo");
        }

        if(num2 >= 0){
            System.out.println("segundo numero positivo");
        }else {
            System.out.println("segundo numero negativo");
        }

        System.out.println("Comparaçao dos números");

        if (num1 != num2){
            System.out.println("números diferentes");
        }else{
            System.out.println("números iguais");
        }

        if (num1 > num2) {
            System.out.println("Primeiro número " + num1 + " é maior que o segundo " + num2);
        }else {
            System.out.println("segundo número " + num2 + " é maior que o primeiro " + num1);
        }

        if (num1 % 2 == 0){
                System.out.println("Primeiro número é par");
        }else {
                System.out.println("primeiro número é impar");
        }

        if (num2 % 2 == 0){
            System.out.println("segundo número é par");
        }else {
            System.out.println("segundo número é impar");
        }



        System.out.println("Tabuada dos números");
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(num1 + " x " + i + " = " + num1 * i);
        }
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(num2 + " x " + i + " = " + num2 * i);
        }

        System.out.println("Fatorial dos números");

        long fator = 1;
        for (int contador = 1; contador <= num1; contador++ ){ // 1x1; 1x2 = 2; 2x3 = 6; 6x4 = 24; 24x5 = 120
            fator  = fator * contador;
        }

        System.out.println("Fatorial do primeiro número é: " + fator);

        fator = 1;
        for (int contador = 1; contador <= num2; contador++ ){ // 1x1; 1x2 = 2; 2x3 = 6; 6x4 = 24; 24x5 = 120
            fator  = fator * contador;
        }
        System.out.println("Fatorial do segundo número é: " + fator);
    }
}
