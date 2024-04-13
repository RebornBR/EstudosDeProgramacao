package com.alura.cuso2OrientacaoObjetos.Desafios.DesafioAula4.model;

import com.alura.cuso2OrientacaoObjetos.Desafios.DesafioAula4.model.Interfaces.ConversorTemperatura;

public class ConversorCelsiusFahrenheit implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
