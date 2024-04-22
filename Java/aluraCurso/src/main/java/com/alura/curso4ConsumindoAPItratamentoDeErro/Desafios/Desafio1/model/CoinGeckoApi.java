package com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio1.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinGeckoApi {
    String endereco;
    String nomeCriptoMoeda;
    public void informacoesCriptoMoeda(String nomeCriptoMoeda) throws IOException, InterruptedException {
        this.nomeCriptoMoeda = nomeCriptoMoeda;
        endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + nomeCriptoMoeda + "&vs_currencies=usd";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}
