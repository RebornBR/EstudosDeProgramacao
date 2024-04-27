package com.aluraJavaPoo.ScreenMatch.Principal;

import com.aluraJavaPoo.ScreenMatch.model.Filme;
import com.aluraJavaPoo.ScreenMatch.model.Serie;
import com.aluraJavaPoo.ScreenMatch.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainList {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.atribuirNota(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.atribuirNota(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.atribuirNota(10);
        Serie lost = new Serie("Lost", 2000);
        lost.atribuirNota(5);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);

        for (Titulo titulo : lista) {
            System.out.println(titulo + " Estrelas: " + titulo.getClassificacao());
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista); // método do Comparable onde ordenamos por seu nome.
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); // metodo do comparator no nosso ArrayList(de titulos) lista e estamos ordenando por seu ano de lancamento, mas poderiamos ordenar pelo nome ou qualquer outro atributo
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }

/* // Solução disso, implementamos a interface classificavel em titulo( e podemos retirar a implements classificavel de filme e serie), assim um titulo passa tbm a ter o método getClassificacao, agora teremos acesso ao getClassificacao de filmes e series
for (Titulo item: lista) {
System.out.println(item.getNome());
if (item instanceof  Filme filme && filme.getClassificacao() > 2) { // caso tenhamos um método que n pertence a titulo(CLASSE MAE)instaciamos dizendo que nosso item será um filme e ai teremos acesso ao método de filme
System.out.println("Classificação " + filme.getClassificacao());
}
        * */

        }
