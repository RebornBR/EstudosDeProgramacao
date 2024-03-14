package DesafioAbstracaoDominioBancario.Desafio2;

import java.util.Scanner;

import DesafioAbstracaoDominioBancario.Desafio2.model.ContaPoupanca;

public class Desafio {
  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do titular:");
    String titular = scanner.next();
    System.out.println("Digite o numero da conta");
    int numeroConta = scanner.nextInt();
    System.out.println("digite o saldo:");
    double saldo = scanner.nextDouble();
    System.out.println("digite a taxa de juros");
    double taxaJuros = scanner.nextDouble();

    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

    System.out.println("Conta Poupanca:");
    contaPoupanca.exibirInformacoes();
}
}
      
