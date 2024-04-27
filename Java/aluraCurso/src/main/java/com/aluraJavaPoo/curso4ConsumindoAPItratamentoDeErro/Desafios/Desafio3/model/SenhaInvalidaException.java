package com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio3.model;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
