package com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula1.model;

public class Pessoa {
    String nome;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return
                "{" + "nome:" + nome +
                ",idade:" + idade + "}";
    }
}
