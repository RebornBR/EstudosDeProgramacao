package com.alura.cuso1CriandoSuaPrimeiraAplicacao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-Vindo a Screen Match!");
        System.out.println("Saga Harry potter");
        double mediaNota = (1000 + 10 + 10.1 + 5) / 4;
        int classificacao = (int) (mediaNota / 2); // pega a mediaNota e divide por 2, mas faz a conversão do resultado para int com o casting

        // Text block
        String sinopse = """ 
                Saga de filmes do Harry Potter
                Melhor saga existente
                Media = %f
                Estrelas: %d
                """.formatted(mediaNota, classificacao);  // formated com placehold %s == String, %d == inteiro, %f == ponto flutuante (double).
        System.out.println(sinopse);
    }
}