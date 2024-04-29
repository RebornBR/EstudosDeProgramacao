package com.aluraJavaPoo.ScreenMatch.Principal;

import com.aluraJavaPoo.ScreenMatch.model.Titulo;
import com.aluraJavaPoo.ScreenMatch.model.TituloOmdb;
import com.aluraJavaPoo.ScreenMatch.services.exceptions.ErroDeConversaoDeAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE) // deixa a primeira letra dos atributos Maiuscula
                .setPrettyPrinting() // torna mais "legivel a visualização do json
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=b12bcf6e";
            System.out.println(endereco);
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);// transforma o Json na Record TituloOmdb
                System.out.println(meuTituloOmdb);
                //  try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json"); // gera o arquivo filmes.json
        escrita.write(gson.toJson(titulos)); // converte nosso gson em um Json de titulos
        escrita.close();
        System.out.println("O programa finalizou corretamente!");

        /*Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class); // método do Gson que transforma o json em nossa Titulo class,
        // todos os atributos que pertencem a classe Titulo e tiveres nomes iguais ou que seja Indicado com a @SerializedName, receberão os valores respectivos do Json
        System.out.println(meuTitulo);
        System.out.println("Utilizando metódo getNome: " + meuTitulo.getNome() + " Utilizando metódo getAnoDeLancamento: " + meuTitulo.getAnoDeLancamento());
         */

        //Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        //criando o Gson, mas com todos os atributos, seguindo a formatação de
         //a Primeira letra maiscula(pq por convenção, todas variaveis,
         //iniciam com letra minuscula, porem nosso Json tem a primeira letra maiuscula, quando tentarmos utilizar nosso Record TituloOmdb, os atributos não serão reconhecidos **/
        //TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        //System.out.println(meuTituloOmdb);
        //Titulo titulo = new Titulo(meuTituloOmdb);// metodo construtor
        //System.out.println(titulo);
        //System.out.println(titulo.getDuracaoEmMinutos());

    }
}

