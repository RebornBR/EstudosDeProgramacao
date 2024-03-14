package GettersAndSetters;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;

/*
 Utilizamos o get para exibir informações 
 Utilizamos set para obter informações
 */
    public double getNota(){
        return nota;
    }
    public double setNota(double nota1, double nota2){
        //podemos fazer um try catch aqui.
         return nota = (nota1 + nota2) / 2 ;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){ // void porque não retorna nenhum valor
        nome = novoNome; // o atributo nome da classe aluno receberá como valor o parametro novoNome
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int novaIdade){ // void porque não retorna nenhum valor
        idade = novaIdade; //o atributo idade da classe aluno receberá como valor o parametro novaIdade
    }
}
