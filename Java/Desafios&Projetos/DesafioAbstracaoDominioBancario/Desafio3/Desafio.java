package DesafioAbstracaoDominioBancario.Desafio3;

import java.util.Scanner;

import DesafioAbstracaoDominioBancario.Desafio3.model.CofreDigital;
import DesafioAbstracaoDominioBancario.Desafio3.model.CofreFisico;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de cofre, 'digital' ou 'fisico': ");
        String tipoCofre = scanner.nextLine();
      
        if (tipoCofre.equalsIgnoreCase("digital")) {
            System.out.println("Digite a senha:");
            int senha = scanner.nextInt();
            System.out.println("Confime a senha");
            int confirmarSenha = scanner.nextInt();
            CofreDigital cofreUsuarioDigital = new CofreDigital(senha);

            if (cofreUsuarioDigital.validarSenha(confirmarSenha)) {
                cofreUsuarioDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            } else {
                cofreUsuarioDigital.imprimirInformacoes();
                System.out.println("Senha incorreta, senhas não coincidem!");
            }
        } 
        else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisicoUsuario = new CofreFisico(); 
            cofreFisicoUsuario.imprimirInformacoes();
        } else {
            System.out.println("Cofre precisar ser digital ou fisico");
        }
    }
}
