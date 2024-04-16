package com.alura.curso3ColecoesDeDadosEListas.Desafios.DesafioAula3.model;

public class CachorroC3A3 extends AnimalC3A3 {

    String raca;

    public CachorroC3A3(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }


    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "CachorroC3A3{" +
                "raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
