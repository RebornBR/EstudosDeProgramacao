package com.alura.ScreenMatch.model.calculos;


import com.alura.ScreenMatch.model.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //metodo exemplo polimorfismo: de acordo com qual titulo for, serie ou filme, o metodo vai agir de uma forma diferente
    public void calcularTempoNecessario(Titulo t){ // Objeto super classe(classe mae), como serie e filme são um Titulo(herdam de titulo) podemos passar ambos, um filme ou uma serie como o parametro
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}
