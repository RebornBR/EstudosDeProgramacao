package com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio2;

import com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio2.model.Livro;
import com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio2.model.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create(); // permite a criação mesmo com um campo faltando
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);


        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println("Objeto Livro: " + livro);
    }

}
