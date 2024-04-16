package com.alura.curso3ColecoesDeDadosEListas.Desafios.DesafioAula2.model;

public class ProdutoCurso3 {
    String nome;
    double preco;
    int quantidade;

    public ProdutoCurso3(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome=" + nome +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
