package GettersAndSetters;

import java.util.Locale;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Aluno alunoEscola = new Aluno(); /*criamos um novo objeto chamado "alunoEscola" e instaciamos, chamamos seu construtor/classe com o new, chamado "Aluno()" 
    que conterá as suas características */ 
    String nomeAluno;
    int idadeAluno;
    double nota1, nota2;
        System.out.println("Nome do aluno:");
            nomeAluno= scanner.nextLine();
        System.out.println("Idade do aluno:");
            idadeAluno = scanner.nextInt(); 
        System.out.println("Digite a primeira nota");
            nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
            nota2 = scanner.nextDouble();
    alunoEscola.setNota(nota1, nota2); // chamamos o método/funçâo setNota, e  passamos seus parametros.
    alunoEscola.setNome(nomeAluno);// chamamos o método/funçâo setNome, e  passamos seu parametro.
    alunoEscola.setIdade(idadeAluno);// chamamos o método/funçâo setIdade, e  passamos seus parametros.

//utilizamos o get para trazer as informações obtidas com os métodos/funcões set
System.out.println("Aluno: " + alunoEscola.getNome() + "\n Idade: " + alunoEscola.getIdade() + " anos" + "\n Média:" + alunoEscola.getNota());

if(alunoEscola.getNota() >= 7){ // verifica se o valor do getNota é maior ou igual a 7, se for true, retorna aprovado, se não for, retorna, reprovado
    System.out.println("O aluno foi aprovado");
} else {
    System.out.println("Aluno reprovado");
}
    } 
}
