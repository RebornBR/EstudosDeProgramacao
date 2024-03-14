package DesafioAbstracaoDominioBancario.Desafio1;

import java.util.Scanner;

import DesafioAbstracaoDominioBancario.Desafio1.Model.ContaBancaria;

public class Desafio {
      public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();
    ContaBancaria usuarioConta = new ContaBancaria(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:" + "\n"+ "Conta: " + numeroConta + "\n" + 
     "Titular: " + nomeTitular + "\n" + "Saldo: R$ " + saldo);
  }
}

