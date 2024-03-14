package main.java.Set.OperacoesBasicas.ConjuntoConvidado;

import java.util.Objects;

public class Convidado {
  private String nome;
  private int codigoConvite;

  public Convidado(String nome, int codigoConvite) { // método construtor
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  public String getNome() {
    return nome;
  }

  public int getCodigoConvite() {
    return codigoConvite;
  }
////////////////////////////////////////////////////////////////////////////////////////////
/*como o set, só aceita elementos unicos, utilizaremos o código como identificação, ou seja,
 * podem existir convidados de mesmo nome, mas todos devem ter um código de convite diferente
 * verifica se existe um código de convite identico dentro do nosso Hashset, se for identico
 * ele não será inserido no Hashset
 */
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
  }

  
  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }
///////////////////////////////////////////////////////////////////////////////////////////

  public String toString() {
    return "Convidado{" + " nome= " + nome  + ", Código do Convite=" + codigoConvite +'}' + "\n";
  }
}
