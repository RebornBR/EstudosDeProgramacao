package com.alura.cuso1CriandoSuaPrimeiraAplicacao.Desafios;

public class temperaturaCelsiusParaFahrenheit {
    public static void main(String[] args) {
        double temperaturaCelsius = 39.8;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        int temperaturaInteiro = (int) (temperaturaFahrenheit);
        String resultado = """
                
                Temperatura em celsius: %f
                Temperatura em Fahrenheit: %f
                Temperatura valor inteiro(casting): %d
                """.formatted(temperaturaCelsius, temperaturaFahrenheit, temperaturaInteiro);
        System.out.println(resultado);
    }
}
