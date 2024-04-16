package com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula3;

import com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula3.ClassesFilhas.Cachorro;
import com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula3.ClassesFilhas.Gato;
import com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula3.ClassesFilhas.ModeloCarro;
import com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula3.model.ContaBancaria;
import com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula3.model.NumerosPrimos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal");
        Gato gato = new Gato();
        gato.emitirSom();
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Carro");
        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setModelo("HB20");
        modeloCarro.setpAno1(10000);
        modeloCarro.setpAno2(2000);
        modeloCarro.setpAno3(20000);
        modeloCarro.exibirInformacoes();
        ContaBancaria conta = new ContaBancaria();
        conta.getSaldo();
        conta.depositar(200);
        conta.sacar(10);
        NumerosPrimos calculadoraPrimos = new NumerosPrimos();
        calculadoraPrimos.listarPrimos(100);
        calculadoraPrimos.VerificarNumeroPrimo(12);
        calculadoraPrimos.gerarProximoPrimo(5);
    }
}
