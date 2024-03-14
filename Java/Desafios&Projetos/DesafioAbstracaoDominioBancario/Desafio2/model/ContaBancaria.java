package DesafioAbstracaoDominioBancario.Desafio2.model;

import java.text.DecimalFormat;

public class ContaBancaria {
        int numero;
        String titular;
        double saldo;
      
        public ContaBancaria(int numero, String titular, double saldo) {
          this.numero = numero;
          this.titular = titular;
          this.saldo = saldo;
        }

        public void exibirInformacoes() {
          DecimalFormat decimalFormat = new DecimalFormat("#.0");
          System.out.println(titular);
          System.out.println(numero);
          System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
        }
      }
      

