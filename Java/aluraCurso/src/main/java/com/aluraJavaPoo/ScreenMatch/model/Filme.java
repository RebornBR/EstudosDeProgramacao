package com.aluraJavaPoo.ScreenMatch.model;

public class Filme extends Titulo {
    private  String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override // alterando o método existente da nossa classe
    public int getClassificacao() {// método(abstrato) da Interface Classificavel (que herdamos da classe mae Titulo)
        double nota = mediaAvaliacoes(); // criando a media das avaliações
        return (int) nota/2;
    }



/*
* método pra retornar o objeto em um formato especifico, METODO toString() é herdado da superClass object(automaticamente todas as classes que criamos no java são Object), estamos alterando esse método
* pra retornar um objeto da forma que queremos, se n fizermos a alteração quando retornamos um objeto será retornado o nome da sua class e o seu código
* */
    @Override // Subistituindo o método existente na nossa classe
    public String toString(){
        return getNome() + "("+getAnoDeLancamento()+")";
    }

}
