package com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioFinal;

import com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioFinal.Model.CartaoCredito;
import com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioFinal.Model.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada == true) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras()); // ordena os elementos presentes na List compras
        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }
}

