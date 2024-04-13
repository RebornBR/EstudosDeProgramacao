package com.alura.ScreenMatch.model;

import com.alura.ScreenMatch.model.calculos.Classificar;

public class Filme extends Titulo implements Classificar { // implementando a interface e utilizando seu método, o seu método é abstrato, ou seja, a classe que a implementar define como o método vai se comportar
    private  String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        double nota = mediaAvaliacoes(); // criando a media das avaliações
        return (int) nota/2;
    }


    @Override
    public String toString(){ // método pra retornar o objeto em um formato especifico
        return
                """
                Nome Filme: %s
                Diretor: %s
                Ano de lançamento: %d
                Duração: %d minutos
                Estrelas; %d
                Quantidade de avaliações: %d
                """.formatted(getNome(), getDiretor(), getAnoDeLancamento(), getDuracaoEmMinutos(), getClassificacao(), getQtdAvaliacoes())
                        +
                        "Incluído no plano: " + getIncluidoNoPlano() ;
    }

}
