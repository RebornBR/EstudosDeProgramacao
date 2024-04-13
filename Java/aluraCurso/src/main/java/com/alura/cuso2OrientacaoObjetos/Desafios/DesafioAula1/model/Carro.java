package com.alura.cuso2OrientacaoObjetos.Desafios.DesafioAula1.model;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;
    @Override
    public String toString(){ // método pra retornar o objeto em um formato especifico
        int idade = 2024 - ano; // criando a media das avaliações
        return
                """
                Modelo: %s
                Cor: %s
                Ano: %d
                Idade: %d
                """.formatted(modelo, cor, ano, idade);
    }
}
