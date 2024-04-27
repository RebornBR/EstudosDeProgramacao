package com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio1.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LivroGoogleApi {
        private String tituloLivro;
        private  String autor;

    public String getTituloLivro() {
        return tituloLivro;
    }

        private String chave = "AIzaSyBo7sKyuCZgJmZrYBoQ8wTYog-zQVTW04E";
        private String endereco;

        public void procurarLivro( String tituloLivro) throws IOException, InterruptedException {
            this.tituloLivro = tituloLivro;
            endereco = "https://www.googleapis.com/books/v1/volumes?q="+tituloLivro+"&key="+ chave;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

        }
}

