package com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula3.model;

public class C3A3ContaBancaria {
    private int numeroConta;
    private double saldo;

    public C3A3ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
