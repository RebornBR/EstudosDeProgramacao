package DesafioAbstracaoDominioBancario.Desafio3.model;

import DesafioAbstracaoDominioBancario.Desafio3.model.Cofre.Cofre;

public class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
    
}
