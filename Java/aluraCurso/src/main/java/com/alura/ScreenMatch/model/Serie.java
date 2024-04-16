package com.alura.ScreenMatch.model;

import com.alura.ScreenMatch.model.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel { // implementando a interface e utilizando seu método, o seu método é abstrato, ou seja, a classe que a implementar define como o método vai se comportar
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

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

    @Override // alterando o método existente da nossa classe
    public int getClassificacao() { // método(abstrato) da Interface Classificavel
        double nota = mediaAvaliacoes(); // criando a media das avaliações
        return (int) nota/2;
    }
    @Override // alterando o método existente da nossa classe
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosEpisodio;
    }



    /*
     * método pra retornar o objeto em um formato especifico, METODO toString() é herdado da superClass object(automaticamente todas as classes que criamos no java são Object), estamos alterando esse método
     * pra retornar um objeto da forma que queremos, se n fizermos a alteração quando retornamos um objeto será retornado o nome da sua class e o seu código
     * */
    @Override // alterando o método existente da nossa classe
    public String toString(){
        return getNome() + "("+getAnoDeLancamento()+")";
}
}
