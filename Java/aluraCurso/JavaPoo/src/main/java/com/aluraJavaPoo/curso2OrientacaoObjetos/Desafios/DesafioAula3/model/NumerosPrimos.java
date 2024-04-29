package com.aluraJavaPoo.curso2OrientacaoObjetos.Desafios.DesafioAula3.model;

public class NumerosPrimos {
    private boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limiteSuperior) {
        System.out.println("Números primos até " + limiteSuperior + ": ");
        for (int i = 2; i <= limiteSuperior; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ,");
            }
        }
        System.out.println();
    }

    public void VerificarNumeroPrimo(int numero){
        if (verificarPrimalidade(numero) == true) { // ou verificarPrimalidade(numero)
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }

    public void gerarProximoPrimo(int numeroPrimoConhecido){
        int proximoNumero = numeroPrimoConhecido + 1;
        while (verificarPrimalidade(proximoNumero) == false) { // ou !verificarPrimalidade(proximoNumero)
            proximoNumero++;
        }
        System.out.println("O próximo número primo é: " + proximoNumero);
    }
}
