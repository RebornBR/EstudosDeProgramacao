package main.java.List.Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  //atributo
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoas() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  /**
   * criamos uma list do tipo Pessoa, que será chamada pessoaPorIdade e será um novo Array list
   * para esse arraylist adicionamos o pessoaList, ou seja, pessoaPorIdade, terá todos os elementos, 
   * tudo que estiver na array pessoaList
   */
  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorIdade);
      System.out.println("Ordenação por idade: " + pessoasPorIdade);
      return pessoasPorIdade;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

/**
 * criamo umas list pessoasPorAltura que será um novo ArrayList, e pesssoasPorAltura irá
 * receber a lista, os elementos, tudo do nosso Array pessoaList.
 * <h3>Utilzamos o método Collections.sort para ordenar a lista, pessoasPorAltura que será
 * um novo CompartorPorAltura.<h3>
 */
  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
      System.out.println("Ordenação por altura: " + pessoasPorAltura);
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
    
}
