package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // indica q deve ignorar os atributos que n forem achados mapeados pela Record(ESSA)
public record DadosEpisodio(@JsonAlias("Title") String titulo, // atribuindo um apelido para o atributo, apelido que deve ser o mesmo que vem da api
                            @JsonAlias("Episode") Integer numero,
                            @JsonAlias("imdbRating") String avaliacao,
                            @JsonAlias("Released") String dataLancamento) {
}
