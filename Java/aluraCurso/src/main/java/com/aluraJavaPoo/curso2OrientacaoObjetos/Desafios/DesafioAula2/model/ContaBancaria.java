package com.aluraJavaPoo.curso2OrientacaoObjetos.Desafios.DesafioAula2.model;

public class ContaBancaria {
    private double saldo;
    private int numeroConta;
    private String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
