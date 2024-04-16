package com.alura.curso3ColecoesDeDadosEListas.Desafios.DesafioAula3;

import com.alura.curso3ColecoesDeDadosEListas.Desafios.DesafioAula3.model.*;

import java.util.ArrayList;

public class MainC3A3 {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Python");

        for (String elemento : listaStrings) {
            System.out.println(elemento);
        }
        System.out.println("=============================================================");
        C3A3Produto p1 = new C3A3Produto("Arroz", 5);
        C3A3Produto p2 = new C3A3Produto("feijao", 8);
        C3A3Produto p3 = new C3A3Produto("Macarraão", 3);
        ArrayList<C3A3Produto> listProdutos = new ArrayList<>();
        listProdutos.add(p1);
        listProdutos.add(p2);
        listProdutos.add(p3);
        double somarPrecos= 0;
        for (C3A3Produto produto: listProdutos) {
            somarPrecos += produto.getPreco();
        }
        double precoMedio = somarPrecos / listProdutos.size();
        System.out.println(listProdutos);
        System.out.println("A média e preço dos produtos é de: " + precoMedio);
        System.out.println("=============================================================");
        Circulo circulo = new Circulo(2);
        Quadrado quadrado = new Quadrado(2);
        ArrayList<Forma> listaArea = new ArrayList<>();
        listaArea.add(circulo);
        listaArea.add(quadrado);

        for (Forma forma: listaArea) {
            if (forma instanceof Circulo) { // verifica se forma é um Circulo
                System.out.println("Area Circulo: " + forma.calcularArea());
            } else if (forma instanceof Quadrado) { // verifica se forma é um quadrado
                System.out.println("Area quadrado: " + forma.calcularArea());
            } else {
                System.out.println("Forma não conhecida");
            }
        }
        System.out.println("=============================================================");
            C3A3ContaBancaria conta1 = new C3A3ContaBancaria(101, 1500.0);
            C3A3ContaBancaria conta2 = new C3A3ContaBancaria(102, 2500.0);
            C3A3ContaBancaria conta3 = new C3A3ContaBancaria(103, 3800.0);

            ArrayList<C3A3ContaBancaria> listaContas = new ArrayList<>();
            listaContas.add(conta1);
            listaContas.add(conta2);
            listaContas.add(conta3);

            C3A3ContaBancaria contaMaiorSaldo = listaContas.get(0); // ContaMaiorSaldo Pega a primeita conta presente na listaContas
            for (C3A3ContaBancaria conta : listaContas) {
                if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                    contaMaiorSaldo = conta; // conta maior saldo passa a REFERENCIAR a conta com maior saldo
                }
            }
            System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                    ", Saldo: " + contaMaiorSaldo.getSaldo());

        }
    }

