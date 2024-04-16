package com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula4.model;

import com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula4.model.Interfaces.Vendavel;

public class Servico implements Vendavel {
    private String descricao;
    private double precoHora;

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}
