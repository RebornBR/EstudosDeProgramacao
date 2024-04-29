package com.aluraJavaPoo.ScreenMatch.model.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) { // recebe um Classificavel, ou seja, toda classe que implementar o Classificar, isto é, ela se torna um classificavel.
        if (classificavel.getClassificacao() == 5) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 3) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
