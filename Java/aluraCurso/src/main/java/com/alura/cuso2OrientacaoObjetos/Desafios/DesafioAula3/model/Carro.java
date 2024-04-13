package com.alura.cuso2OrientacaoObjetos.Desafios.DesafioAula3.model;

public class Carro {
    private String modelo;
    private double pAno1;
    private double pAno2;
    private double pAno3;
    private double maiorPreco = pAno1;
    private double menorPreco = pAno1;
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setpAno1(double pAno1) {
        this.pAno1 = pAno1;
    }

    public void setpAno2(double pAno2) {
        this.pAno2 = pAno2;
    }

    public void setpAno3(double pAno3) {
        this.pAno3 = pAno3;
    }

    public double getMaiorPreco() {
        maiorPreco = pAno1;
        if(pAno2 > maiorPreco){
            maiorPreco = pAno2;
        }
        if (pAno3 > maiorPreco) {
            maiorPreco = pAno3;
        }
        return maiorPreco;
    }

    public double getMenorPreco() {
        menorPreco = pAno1;
        if (pAno2 < menorPreco){
            menorPreco = pAno2;
        }
        if (pAno3 < menorPreco){
            menorPreco = pAno3;
        }
        return menorPreco;
    }

    public void exibirInformacoes(){
        System.out.println(
                """
                Modelo: %s
                Preço 1 ano: %f
                Preço 2 ano: %f
                Preço 3 ano: %f
                Maior Preço: %f
                Menor Preço: %f
                """.formatted(modelo, pAno1, pAno2 ,pAno3, getMaiorPreco(), getMenorPreco()));
    }

}
