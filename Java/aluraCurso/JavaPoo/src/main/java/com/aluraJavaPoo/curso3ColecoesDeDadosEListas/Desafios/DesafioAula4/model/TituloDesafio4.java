package com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula4.model;

public class TituloDesafio4 implements Comparable<TituloDesafio4> {
    String nome;
    public TituloDesafio4(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(TituloDesafio4 tituloDesafio4) {
        return this.getNome().compareTo(tituloDesafio4.getNome());
    }
}
