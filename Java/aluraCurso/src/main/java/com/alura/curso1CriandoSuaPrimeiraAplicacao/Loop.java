package com.alura.curso1CriandoSuaPrimeiraAplicacao;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) { // ATALHO fori
            System.out.println("Diga sua avaliação para o filme  ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliações " + mediaAvaliacao/3);

    }
}