package com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula1;

import com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula1.model.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        pessoa.setIdade(20);
        pessoa.setNome("Rodrigo");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setIdade(10);
        pessoa2.setNome("Roberto");
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setIdade(15);
        pessoa3.setNome("Kiara");
        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println(listaDePessoas);
    }
}
