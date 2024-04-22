package com.alura.ScreenMatch.Principal;

import com.alura.ScreenMatch.model.Titulo;
import com.alura.ScreenMatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        String json = response.body(); // variavel que recebe o retorno da API( response.body() )

        /*Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class); // método do Gson que transforma o json em nossa Titulo class,
        // todos os atributos que pertencem a classe Titulo e tiveres nomes iguais ou que seja Indicado com a @SerializedName, receberão os valores respectivos do Json
        System.out.println(meuTitulo);
        System.out.println("Utilizando metódo getNome: " + meuTitulo.getNome() + " Utilizando metódo getAnoDeLancamento: " + meuTitulo.getAnoDeLancamento());
         */

        //Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        //criando o Gson, mas com todos os atributos, seguindo a formatação de
         //a Primeira letra maiscula(pq por convenção, todas variaveis,
         //iniciam com letra minuscula, porem nosso Json tem a primeira letra minúscula, quando tentarmos utilizar nosso Record TituloOmdb, os atributos não serão reconhecidos **/
        //TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        //System.out.println(meuTituloOmdb);
        //Titulo titulo = new Titulo(meuTituloOmdb);// metodo construtor
        //System.out.println(titulo);
        //System.out.println(titulo.getDuracaoEmMinutos());

    }
}

