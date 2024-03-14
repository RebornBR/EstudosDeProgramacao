package Construtor.model;

import Construtor.services.ExceptionCpf;

public class Pessoa {
    private String nome;
    private String cpf;
    private String sexo;

    // método construtor
	// o nome deverá ser igual ao nome da classe
    public Pessoa(String nome, String cpf, String sexo){ // método função construtor
// substitui o set
//this significa que é a variavel/atributo da classe
try {
    this.nome = nome;
    this.cpf = cpf;
    this.sexo = sexo;
    ValidandoCPF(this.cpf); // faz o procedimento, valida o cpf
    System.out.println("Cadastro realizado com sucesso"); // retorna isso se a exceção não for lançada
} catch (ExceptionCpf e) {
    System.out.println("Cadastro não realizado, seu CPF é inválido.");// se a exceção for lançada, retorna isso
}
    }

public static String ValidandoCPF(String cpf) throws ExceptionCpf{ // função validandoCPF
    if(cpf.length() != 11){ // se tamanho cpf diferente de 11
     throw new ExceptionCpf(); // faz isso, lança a exceção
     }
     return cpf; // se tamanho igual a 11, retorna o cpf
    }

 public String getCpf() { //usado para exibir o cpf
     return cpf;
 }

 public String getNome() {
     return nome;
 }

 public String getSexo() {
     return sexo;
 }
}
