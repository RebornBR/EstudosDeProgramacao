package br.com.alura.curso1PrimeirosPassosSpringFramework.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) // indica q deve ignorar os atributos que n forem achados mapeados pela Record(ESSA)
public record DadosTemporada(@JsonAlias("Season") Integer numero, // atribuindo um apelido para o atributo, apelido que deve ser o mesmo que vem da api
                             @JsonAlias("Episodes") List<DadosEpisodio> episodios) {
}
