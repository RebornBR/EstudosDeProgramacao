package Construtor;

import java.util.Locale;
import java.util.Scanner;

import Construtor.model.Pessoa;


public class CadastrarPessoa {
public static void main(String[] args) {
    
    String cpfPessoa, nomePessoa, sexoPessoa;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite seu cpf");
    cpfPessoa = scanner.nextLine();
    System.out.println("Digite seu nome:");
    nomePessoa = scanner.nextLine();
    System.out.println("Digite seu sexo");
    sexoPessoa= scanner.nextLine();
    Pessoa cadastroPessoa = new Pessoa(nomePessoa, cpfPessoa, sexoPessoa);// criamos o objeto "cadastroPessoa" e chamamos o método/função construtor e colocamos seus parametros
    System.out.println("\n Dados Fornecidos: \n" +cadastroPessoa.getNome() + "\n" + cadastroPessoa.getCpf() + "\n" + cadastroPessoa.getSexo() );
}
}
