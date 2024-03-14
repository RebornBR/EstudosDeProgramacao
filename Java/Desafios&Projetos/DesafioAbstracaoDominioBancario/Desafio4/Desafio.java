package DesafioAbstracaoDominioBancario.Desafio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import DesafioAbstracaoDominioBancario.Desafio4.model.SistemaAcionistas;

public class Desafio {
     public static void main(String[] args) throws ParseException {
    // Lê os dados de Entrada conforme descrito neste Desafio.
    Scanner scanner = new Scanner(System.in);
    SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
    System.out.println("Escolha as datas no formato (dd/mm/yyyy) e entre o periodo de janeiro e junho");
    System.out.println("Digite data inicial");
    String dataInicial = scanner.nextLine();
    System.out.println("Digite data final");
    String dataFinal = scanner.nextLine();
    
    System.out.println("Lista de atividades no periodo de " + dataFinal + " até " + dataFinal );
    List < String > analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

    for (String analise: analises) {
      System.out.println(analise);
    }
  }
}

  

