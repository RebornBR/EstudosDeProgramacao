package com.alura.cuso2OrientacaoObjetos.Desafios.DesafioAula1;

import com.alura.cuso2OrientacaoObjetos.Desafios.DesafioAula1.model.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.olaMundo("Rodrigo");
        System.out.println("------------------------------------------------------------");
        Calculadora calculadora = new Calculadora();
        calculadora.vezes2(4);
        System.out.println("------------------------------------------------------------");
        Musica musica = new Musica();
        musica.artista = "El dorado";
        musica.nomeMusica = "Ouro";
        musica.anoDeLancamento= 2025;
        musica.atribuirNota(10);
        musica.atribuirNota(2.3);
        musica.atribuirNota(8.3);
        System.out.println(musica);
        System.out.println("------------------------------------------------------------");
        Carro carro = new Carro();
        carro.modelo = "Creta";
        carro.ano = 2020;
        carro.cor = "Branco";
        System.out.println(carro);
        System.out.println("------------------------------------------------------------");
        Aluno aluno = new Aluno();
        aluno.idade = 16;
        aluno.nome = "Rodrigo";
        System.out.println(aluno);

    }
}
