package com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.DesafioFinal.ConsultaCepEGeradorArquivo;

import com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.DesafioFinal.ConsultaCepEGeradorArquivo.model.Endereco;
import com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.DesafioFinal.ConsultaCepEGeradorArquivo.services.ConsultCepViaCep;
import com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.DesafioFinal.ConsultaCepEGeradorArquivo.services.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultCepViaCep consultaCep = new ConsultCepViaCep();

        System.out.println("Digite um número de CEP para consulta:");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
