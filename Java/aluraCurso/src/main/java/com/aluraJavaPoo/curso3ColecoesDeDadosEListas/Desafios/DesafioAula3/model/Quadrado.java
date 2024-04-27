package com.alura.curso3ColecoesDeDadosEListas.Desafios.DesafioAula3.model;

public class Quadrado implements Forma {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
