package com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio3;

import com.aluraJavaPoo.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio3.model.SenhaInvalidaException;

import java.util.Scanner;

public class Main2 {
    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


}
