package DesafioAbstracaoDominioBancario.Desafio3.model;

import DesafioAbstracaoDominioBancario.Desafio3.model.Cofre.Cofre;

public class CofreFisico extends Cofre {
    private int senha;
    
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
      }

}
