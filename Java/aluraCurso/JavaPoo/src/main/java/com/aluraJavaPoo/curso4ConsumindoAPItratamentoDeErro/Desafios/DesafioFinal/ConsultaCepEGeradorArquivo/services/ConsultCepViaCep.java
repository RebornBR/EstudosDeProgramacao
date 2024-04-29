package com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.DesafioFinal.ConsultaCepEGeradorArquivo.services;

import com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.DesafioFinal.ConsultaCepEGeradorArquivo.model.Endereco;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultCepViaCep {
    public Endereco buscaEndereco(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class); // o gson transforma o nosso Json em um Endereco class, os atributos que forem do mesmo nome que endereco receberão esses valores
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.");
        }

    }
}
