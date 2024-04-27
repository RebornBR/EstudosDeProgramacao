package com.alura.curso3ColecoesDeDadosEListas.Desafios.DesafioAula2.model;

public class ProdutoPerecivelCurso3 extends ProdutoCurso3 {
    String validade;

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public ProdutoPerecivelCurso3(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }
}
