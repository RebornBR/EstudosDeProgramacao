package com.alura.ScreenMatch.model;

import com.alura.ScreenMatch.model.calculos.Classificavel;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Classificavel, Comparable<Titulo> {
    @SerializedName("Title") // Para conversão de um Json ao nosso objeto Titulo precisamos indicar que o atributo "nome" receberá o atributo "Title" do Json. Podemos utilizar nomes de variaveis em ingles, se forem iguais, sera mapeado automaticamente
    private String nome;
    @SerializedName("Year") // Para conversão de um Json ao nosso objeto Titulo precisamos indicar que o atributo "anoDeLancamento" receberá o atributo "Year" do Json. Podemos utilizar nomes de variaveis em ingles, se forem iguais, sera mapeado automaticamente
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int qtdAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(TituloOmdb meuTituloOmdb) {// recebemos um TituloOmdb
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year()); // essa conversão é necessária pois sabemos que o json retorna tipos string, podemos resolver isso, fazendo tratamento de excecoes ou modificando nosso código
        this.duracaoEmMinutos = Integer.parseInt(meuTituloOmdb.runtime().substring(0,3)); // pega os primeiros 3 caracteres
    }

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }
    public int getQtdAvaliacoes(){
        return qtdAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirFichaTecnica(){
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println(duracaoEmMinutos);
    }

    public void atribuirNota(double nota){
        if(nota > 10){
            nota=10;
        }
        somaAvaliacoes+= nota;
        qtdAvaliacoes++;
    }
    protected double mediaAvaliacoes(){
        return somaAvaliacoes / qtdAvaliacoes;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacoes();
    }

    @Override
    public String toString(){
        return getNome() + "("+getAnoDeLancamento()+")";
    }

    @Override // esse método é necessário, pois estamos comparando objetos e um objeto tem vários atributos, ou seja, precisamos dizer exatamente por qual atributo eu preciso fazer essa comparacao e ordenar
    public int compareTo(Titulo outroTitulo) { // metodo do collections.sort() quando o utilizarmos estaremos ordenando nossa lista de Titulos pelo seu nme
        return this.getNome().compareTo(outroTitulo.getNome()); // comparando o nome de um Titulo com outro Titulo. outroTitulo Pode ser qualquer nome
    }
}
