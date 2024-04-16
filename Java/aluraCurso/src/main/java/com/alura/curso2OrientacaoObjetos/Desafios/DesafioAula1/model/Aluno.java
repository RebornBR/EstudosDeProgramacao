package com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula1.model;

public class Aluno {
    public  String nome;
    public int idade;

    @Override
    public String toString(){ // método pra retornar o objeto em um formato especifico
        ; // criando a media das avaliações
        return
                """
                Nome do estudante: %s
                Idade do estudante: %d
                """.formatted(nome, idade);
    }
}
