package main.java.Set.Pesquisa.AgendaContatos;

import java.util.Objects;

public class Contato {
      
  private String nome;
  private String numero;

  public Contato(String nome, String numero) {
    this.nome = nome;
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  ///////////////////////////////////////////////////
  /*método equal() and hashCode()
   set só aceita elementos unicos, utilizamos essa função abaixo para verificar se ao adicionarmos, 
   criarmos um contato com o mesmo nome presente no nosso HashsSet, ele não será salvo.
   */
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Contato contato)) return false; // faz verificação 
    System.out.println("Contato já cadastrado"); // se já existir, retorna essa mensagem.
    return Objects.equals(getNome(), contato.getNome());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNome());
  }
//////////////////////////////////////////////////////

  public String toString() {//formatação, a forma que vai retornar o nosso HashSet
    return "Contato: {" + nome + ", " + numero + "}" + "\n";
  }
}
