package com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula1.model;

public class Musica {
        public String nomeMusica;
        public String artista;
        public int anoDeLancamento;
        double somaAvaliacoes;
        int totalAvaliacoes;
        public void exibirFichaTecnica(){
            System.out.println(nomeMusica);
            System.out.println(anoDeLancamento);
        }

        public void atribuirNota(double nota){
            if(nota > 10){
                nota=10;
            }
            somaAvaliacoes+= nota;
            totalAvaliacoes++;
        }

        @Override
        public String toString(){ // método pra retornar o objeto em um formato especifico
            double nota = somaAvaliacoes / totalAvaliacoes; // criando a media das avaliações
            return
                    """
                    Nome da música: %s
                    Artista: %s
                    Ano de lançamento: %d
                    Notal; %.2f
                    Quantidade de avaliações: %d
                    """.formatted(nomeMusica,artista, anoDeLancamento, nota,totalAvaliacoes);
        }
    }
