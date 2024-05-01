package br.com.alura.screenmatch.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper(); // Jackson que mapeia um objeto


    /**
     sobrescreve o método da Record IConverteDados, que recebe um valor String chamado json e um tipo generico, ou seja uma class. Similar ao gson.fromJson(json,Titulo.class) nesse caso
     como n sabemos em oque converteremos o String json, utilizamos tipos genericos <T> T Class<T>**/
    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe); // mapeia o objeto de uma classe, classe generica, ou seja, que n sabemos oq será
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
