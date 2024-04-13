package com.alura.cuso2OrientacaoObjetos.Desafios.DesafioAula3.model;

public class ContaBancaria {
    private double saldo;

    public void getSaldo() {
        System.out.println("Seu saldo atual é de R$" + saldo);;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("R$" + valor + " foi depositado");
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo = saldo - valor;
            System.out.println("R$" + valor + " Foi sacado " +" Saldo atual: R$" + saldo);
        }else {
            System.out.println("Saldo insuficiente." + "\n" + "Saldo disponível: R$" + saldo);
        }
    }

}
