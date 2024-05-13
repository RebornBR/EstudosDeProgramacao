package br.com.alura.curso1PrimeirosPassosSpringFramework.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // indica q deve ignorar os atributos que n forem achados mapeados pela Record(ESSA)
public record DadosSerie(@JsonAlias("Title") String titulo, // atribuindo um apelido para o atributo, apelido que deve ser o mesmo que vem da api
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}