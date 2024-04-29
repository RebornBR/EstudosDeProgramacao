package com.aluraJavaPoo.ScreenMatch.Principal;

import com.aluraJavaPoo.ScreenMatch.model.Filme;
import com.aluraJavaPoo.ScreenMatch.model.Serie;
import com.aluraJavaPoo.ScreenMatch.model.Titulo;
import com.aluraJavaPoo.ScreenMatch.model.calculos.CalculadoraTempo;
import com.aluraJavaPoo.ScreenMatch.model.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Filme filme = new Filme("Harry Potter e a pedra filosofal", 2001);
        filme.atribuirNota(10);
        filme.atribuirNota(10);
        filme.atribuirNota(10);
        System.out.println(filme);
        filtro.filtra(filme);

        System.out.println("--------------------------------------------------------------");

        Serie serie = new Serie("Saga Of Tanya The Evil", 2017);
        serie.atribuirNota(9);
        serie.atribuirNota(9);
        serie.atribuirNota(9);
        System.out.println(serie);
        filtro.filtra(serie);

        System.out.println("--------------------------------------------------------------");

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.atribuirNota(5);
        meuFilme.atribuirNota(5);
        meuFilme.atribuirNota(5);
        System.out.println(meuFilme);
        filtro.filtra(meuFilme);

        System.out.println("--------------------------------------------------------------");

        CalculadoraTempo calcular = new CalculadoraTempo();
        calcular.calcularTempoNecessario(filme);
        calcular.calcularTempoNecessario(serie);
        System.out.println("Tempo necessário para assistir seus filmes e séries: " + calcular.getTempoTotal());
        ArrayList<Titulo> listaDeTitulosQueIreiAssistir = new ArrayList<>();
        listaDeTitulosQueIreiAssistir.add(filme);
        listaDeTitulosQueIreiAssistir.add(serie);
        listaDeTitulosQueIreiAssistir.add(meuFilme);
        System.out.println("\n" + "Lista de titulos que irei assistir: " + listaDeTitulosQueIreiAssistir);


    }
}
