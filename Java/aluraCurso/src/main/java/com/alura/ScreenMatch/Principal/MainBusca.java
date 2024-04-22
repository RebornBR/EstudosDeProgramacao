package com.alura.ScreenMatch.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = scanner.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=b12bcf6e";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
