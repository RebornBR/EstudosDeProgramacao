package com.aluraJavaPoo.curso2OrientacaoObjetos.Desafios.DesafioAula2;

import com.aluraJavaPoo.curso2OrientacaoObjetos.Desafios.DesafioAula2.model.*;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(2223131);
        conta.setSaldo(50000);
        conta.setTitular("Robertin");
        System.out.println(conta.getSaldo());
        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getTitular());

        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(19);
        pessoa.setNome("Rodrigo");
        pessoa.verificaIdade(19);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        Produto produto = new Produto();
        produto.setNome("Celular");
        produto.setPreco(2000);
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());

        Aluno aluno = new Aluno();
        aluno.setNome("Robertin");
        aluno.setNota1(5);
        aluno.setNota2(3);
        aluno.setNota3(2);
        System.out.println("Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Nota 3: " + aluno.getNota3());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println();

        Livro livro = new Livro();
        livro.setTitulo("Harry Potter. Saga");
        livro.setAutor("JK");
        livro.exibirDetalhes();
    }
}

