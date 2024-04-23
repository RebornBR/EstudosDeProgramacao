package com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.DesafioFinal.ConsultaCepEGeradorArquivo.services;

import com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.DesafioFinal.ConsultaCepEGeradorArquivo.model.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // cria um Gson, setPrettyPrinting // torna mais "legivel a visualização do json no arquivo q será gerado
        FileWriter escrita = new FileWriter(endereco.cep() + ".json"); // cria um arquivo com o nome do cep + .json. Exemplo 53220460.json
        escrita.write(gson.toJson(endereco));
        escrita.close();

    }
}
