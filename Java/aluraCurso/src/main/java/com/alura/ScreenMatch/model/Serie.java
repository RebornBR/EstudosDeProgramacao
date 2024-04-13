package com.alura.ScreenMatch.model;

import com.alura.ScreenMatch.model.calculos.Classificar;

public class Serie extends Titulo implements Classificar { // implementando a interface e utilizando seu método, o seu método é abstrato, ou seja, a classe que a implementar define como o método vai se comportar
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }

    @Override
    public int getClassificacao() {
        double nota = mediaAvaliacoes(); // criando a media das avaliações
        return (int) nota/2;
    }
    @Override // Subistituindo o método existente na nossa classe
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosEpisodio;
    }

    @Override
    public String toString(){ // método pra retornar o objeto em um formato especifico
        return
                """
                Nome Serie: %s
                Temporadas: %d
                Episodio por temporada: %d
                Minutos Episodio: %d
                Duração: %d minutos
                Ano de lançamento: %d
                Estrelas; %d
                Quantidade de avaliações: %d
                """.formatted(getNome(),getTemporadas(), getEpisodiosPorTemporada(),getMinutosEpisodio(), getDuracaoEmMinutos(),getAnoDeLancamento(), getClassificacao(), getQtdAvaliacoes())
                        +
                        "Incluído no plano: " + getIncluidoNoPlano();
    }
}
