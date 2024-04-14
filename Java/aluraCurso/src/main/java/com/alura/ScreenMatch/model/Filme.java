package com.alura.ScreenMatch.model;

import com.alura.ScreenMatch.model.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { // implementando a interface e utilizando seu método, o seu método é abstrato, ou seja, a classe que a implementar define como o método vai se comportar
    private  String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override // alterando o método existente da nossa classe
    public int getClassificacao() {// método(abstrato) da Interface Classificavel
        double nota = mediaAvaliacoes(); // criando a media das avaliações
        return (int) nota/2;
    }



/*
* método pra retornar o objeto em um formato especifico, METODO toString() é herdado da superClass object(automaticamente todas as classes que criamos no java são Object), estamos alterando esse método
* pra retornar um objeto da forma que queremos, se n fizermos a alteração quando retornamos um objeto será retornado o nome da sua class e o seu código
* */
    @Override // Subistituindo o método existente na nossa classe
    public String toString(){
        return
                """
                Nome Filme: %s
                Diretor: %s
                Ano de lançamento: %d
                Duração: %d minutos
                Estrelas; %d
                Quantidade de avaliações: %d
                """.formatted(getNome(), getDiretor(), getAnoDeLancamento(), getDuracaoEmMinutos(), getClassificacao(), getQtdAvaliacoes())
                        +
                        "Incluído no plano: " + getIncluidoNoPlano() ;
    }

}
