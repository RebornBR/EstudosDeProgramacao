package com.alura.curso1CriandoSuaPrimeiraAplicacao.Desafios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(10);
        int tentativas = 0;
        int chute = 0;


        while (tentativas < 5 && chute != numAleatorio ){
            System.out.println("Digite seu chute");
            chute = scanner.nextInt();

            if(chute > numAleatorio){
                System.out.println("Número escolhido é maior que o número aleatorio");
            }else if (chute < numAleatorio) {
                System.out.println("Número escolhido é menor que o número aleatorio");
            }else if(chute == numAleatorio){
                System.out.println("Voce ganhou!");
            }
            tentativas++;
        }
        if(tentativas == 5 && chute != numAleatorio  ){
            System.out.println("Suas tentativas acabaram");
        }
    }
}
