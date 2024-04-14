package com.alura.ScreenMatch;

import com.alura.ScreenMatch.model.Filme;
import com.alura.ScreenMatch.model.Serie;
import com.alura.ScreenMatch.model.Titulo;
import com.alura.ScreenMatch.model.calculos.CalculadoraTempo;
import com.alura.ScreenMatch.model.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Filme filme = new Filme();
        filme.setNome("Harry Potter e a pedra filosofal");
        filme.setAnoDeLancamento(2001);
        filme.setDuracaoEmMinutos(152);
        filme.setDiretor("Chris Columbus");
        filme.setIncluidoNoPlano(true);
        filme.atribuirNota(10);
        filme.atribuirNota(10);
        filme.atribuirNota(10);
        System.out.println(filme);
        filtro.filtra(filme);
        System.out.println("--------------------------------------------------------------");
        Serie serie = new Serie();
        serie.setNome("Saga Of Tanya The Evil");
        serie.setAnoDeLancamento(2017);
        serie.setEpisodiosPorTemporada(12);
        serie.setTemporadas(1);
        serie.setMinutosEpisodio(24);
        serie.atribuirNota(9);
        serie.atribuirNota(9);
        serie.atribuirNota(9);
        System.out.println(serie);
        filtro.filtra(serie);
        System.out.println("--------------------------------------------------------------");
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDiretor("Jkk");
        meuFilme.setDuracaoEmMinutos(180);
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
        System.out.println("\n" + "Lista de titulos que irei assistir: " + "\n" + listaDeTitulosQueIreiAssistir);



    }
}
