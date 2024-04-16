package com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula2.model;

public class Pessoa {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificaIdade(int idadeDaPessoa){
        if(idadeDaPessoa >= 18){
            System.out.println(" é maior de idade");
        }else {
            System.out.println(" é menor de idade");
        }
    }
}
