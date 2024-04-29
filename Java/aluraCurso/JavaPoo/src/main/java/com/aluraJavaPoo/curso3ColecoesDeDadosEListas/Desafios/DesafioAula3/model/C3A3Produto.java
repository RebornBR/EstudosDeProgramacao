package com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula3.model;

public class C3A3Produto {
    private String nome;
    private double preco;

    public C3A3Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "C3A3Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public double getPreco() {
        return preco;
    }
}
