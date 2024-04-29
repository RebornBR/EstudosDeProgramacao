package com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio1.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TheMealDbApi {
    String nomeReceita;
    String endereco;
    public void procurarReceita(String nomeReceita) throws IOException, InterruptedException {
        endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
