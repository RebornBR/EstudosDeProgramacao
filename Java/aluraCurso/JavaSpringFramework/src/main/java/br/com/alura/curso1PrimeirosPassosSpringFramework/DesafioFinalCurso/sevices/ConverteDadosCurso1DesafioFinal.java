package br.com.alura.curso1PrimeirosPassosSpringFramework.DesafioFinalCurso.sevices;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class ConverteDadosCurso1DesafioFinal implements IConverteDadosCurso1DesafioFinal {
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

    @Override
    public <T> List<T> obterLista(String json, Class<T> classe) { // faremos a mesma coisa acima, so que agr será uma List
        CollectionType lista = mapper.getTypeFactory()
                .constructCollectionType(List.class, classe);
        try {
            return mapper.readValue(json, lista); // ´pegamos o Json e o colocamos na nossa Lista do tipo class que colocarmos
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
