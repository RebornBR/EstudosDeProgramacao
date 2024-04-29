package com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula2;

import com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula2.model.ProdutoCurso3;
import com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula2.model.ProdutoPerecivelCurso3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProdutoPerecivelCurso3 produtoPerecivel = new ProdutoPerecivelCurso3("Arroz", 7, 10);
        produtoPerecivel.setValidade("20/05/2025");
        ProdutoCurso3 produto1 = new ProdutoCurso3("Macarrão", 2.4, 10);
        ProdutoCurso3 produto2 = new ProdutoCurso3("Feijão", 7, 10);
        ProdutoCurso3 produto3 = new ProdutoCurso3("Farinha", 5, 10);
        ArrayList<ProdutoCurso3> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produtoPerecivel);
        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Primeiro Produto da lista: " + listaProdutos.get(0));
        System.out.println("Lista Completa" + "\n" + listaProdutos);
    }
}
