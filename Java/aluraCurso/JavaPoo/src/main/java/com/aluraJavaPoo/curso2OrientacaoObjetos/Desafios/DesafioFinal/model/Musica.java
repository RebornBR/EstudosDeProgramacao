package com.aluraJavaPoo.curso2OrientacaoObjetos.Desafios.DesafioFinal.model;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override // método da superClass Audio, método herdado e que é alterado de acordo com o objeto Audio, se é musica ou podcast
    public double getClassificacao() {
        if(this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
