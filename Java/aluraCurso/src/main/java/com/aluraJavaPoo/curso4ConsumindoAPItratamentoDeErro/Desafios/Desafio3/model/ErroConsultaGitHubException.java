package com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio3.model;

public class ErroConsultaGitHubException extends RuntimeException {

    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}
