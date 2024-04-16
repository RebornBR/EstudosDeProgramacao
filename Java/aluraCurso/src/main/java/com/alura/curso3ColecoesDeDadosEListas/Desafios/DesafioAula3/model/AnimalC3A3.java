package com.alura.curso3ColecoesDeDadosEListas.Desafios.DesafioAula3.model;

public class AnimalC3A3 {
    String nome;

    @Override
    public String toString() {
        return "AnimalC3A3{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public AnimalC3A3(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
