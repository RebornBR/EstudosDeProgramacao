package com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula4.model;

import com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula4.model.Interfaces.ConversaoFinanceira;

public class ConversorMoedas implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
