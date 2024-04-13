package com.alura.cuso2OrientacaoObjetos.Desafios.DesafioFinal.model;

public class MinhasPreferidas {
    public void inclui(Audio audio) { // Recebemos um Audio, tudo que extends ou implements um audio, se torna um Audio, logo podemos receber uma musica ou um podcast
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" +
                    " e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está " +
                    "curtindo");
        }
    }
}
