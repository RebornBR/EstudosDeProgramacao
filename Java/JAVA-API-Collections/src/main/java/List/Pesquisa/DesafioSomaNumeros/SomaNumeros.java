package main.java.List.Pesquisa.DesafioSomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros{
  
  private List<Integer> numeros;

  public SomaNumeros() {
    this.numeros = new ArrayList<>();
  }


  public void adicionarNumero(int numero) {
    this.numeros.add(numero);
  }

  /**
   * ForEach, para cada Integer(numero) presente no array numeros, será somado a variavel soma.
   * atraves do soma+= numero, isto é, soma = soma + numero.
   */
  public void calcularSoma() {
    int soma = 0;
    for (Integer numero : numeros)
      soma += numero;
    System.out.println("Soma total =" + soma);
  }

  /**
   * criamos um inteiro chamado "maiorNumero" que receberá  o menor valor do tipo Integer.
   * verificamos se nossa ArrayList numeros é diferente de vazio.
   * <h3>nosso for each diz que para cada Integer(numero) presente no nosso array numeros, será feita a verificação 
   * se nosso Integer(numero) for maior ou igual a nossa variavel maiorNumero, nossa variavel maiorNumero receberá esse numero como atributo<h3>
   * Basicamente verificamos se os inteiros presentes na array numeros, são maiores que nossa variavel maiorNumero, se forem, nossa variavel
   * maiorNumero receberá esse valor, essa verificação será feita em cada posição do array, assim será retornado o maior numero presente nela
   */
  public void encontrarMaiorNumero() {
    int maiorNumero = Integer.MIN_VALUE;
    if (!numeros.isEmpty()) {
      for (Integer numero : numeros) {
        if (numero >= maiorNumero) {
          maiorNumero = numero;
        }
      }
System.out.println("Maior numero = " + maiorNumero);   
 } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

/**
 * 
 * Mesma explicação do método encontrarMaiorNumero, a diferença é que teremos uma variavel do tipo inteiro chamada menorNumero
 * que receberá o menor valor do tipo Integer. 
 *<h3>Agora o numero presente no array será verificado se é menor ou igual a nossa variavel menorNumero, sempre que for menor, nosso
 menorNumero receberá esse novo valor<h3>
 */
  public void encontrarMenorNumero() {
    int menorNumero = Integer.MAX_VALUE;
    if (!numeros.isEmpty()) {
      for (Integer numero : numeros) {
        if (numero <= menorNumero) {
          menorNumero = numero;
        }
      }
System.out.println("Menor numero = " + menorNumero);
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public void exibirNumeros() {
    if (!numeros.isEmpty()) {
      System.out.println(this.numeros);
    } else {
      System.out.println("A lista está vazia!");
    }
  }
}