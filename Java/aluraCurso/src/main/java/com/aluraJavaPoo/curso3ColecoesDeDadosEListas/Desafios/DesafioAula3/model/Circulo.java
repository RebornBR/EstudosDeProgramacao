package com.alura.curso3ColecoesDeDadosEListas.Desafios.DesafioAula3.model;

public class Circulo implements Forma {
    double PI = 3.14;
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getPI() {
        return PI;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }
}
