package br.com.alura.curso1PrimeirosPassosSpringFramework.DesafioFinalCurso.sevices;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApiCurso1DesafioFinal {

    /**Recebemos um endereço de uma api e retornamos o seu response body em uma string nomeada de json**/
    public String obterDados(String endereco) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return json;
    }
}
