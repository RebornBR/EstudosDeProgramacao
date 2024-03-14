package main.java.List.Ordenacao.OrdenacaoPessoas;

import java.util.Locale;
import java.util.Scanner;

public class UsuarioOrdenacao {
    public static void main(String[] args) {
        OrdenacaoPessoas criandoPessoas = new OrdenacaoPessoas();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean x = true;
        String repetir;
        String nome;
        int idade;
        double altura;
        while(x == true){
            System.out.println("Digite apenas o primeiro nome");
            nome = scanner.next();
            System.out.println("Digite a idade");
            idade = scanner.nextInt();
            System.out.println("Digite a altura");
            altura = scanner.nextDouble();
            System.out.println("Digite '1' para parar");
            repetir = scanner.next();
            criandoPessoas.adicionarPessoa(nome, idade, altura);
            if(repetir.equals("1")){
                x = false;
            }
        }
            System.out.println("Exibindo ordenado por idade");
            criandoPessoas.ordenarPorIdade();
            System.out.println("Exibindo ordenado por altura");
            criandoPessoas.ordenarPorAltura();
    }
}
