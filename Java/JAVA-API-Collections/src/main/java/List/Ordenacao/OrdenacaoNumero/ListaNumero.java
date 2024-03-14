package main.java.List.Ordenacao.OrdenacaoNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumero {
    private List<Integer> numerosList;
    public ListaNumero() {
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }
    
    public void numeroOrdenado(){
        List<Integer> numerosOrdemAZ = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(numerosOrdemAZ); //ordena a arraylist numerosOrdemAZ
        }else {
            System.out.println("Lista vazia");
        }
        System.out.println("Numeros ordenados A-Z(Menor para Maior ): " + numerosOrdemAZ);
    }

    public void numeroOrdenadoReverso() {
        List<Integer> numerosOrdemZA = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
          numerosOrdemZA.sort(Collections.reverseOrder()); //ordena inversamente a arraylist numerosOrdemZA
           // retorna a ordem inversa, ou seja, maior para menor.
          System.out.println("Numeros ordenados Z-A(Maior para Menor)" + numerosOrdemZA);
        } else {
      System.out.println("A lista está vazia!");
    }
  }

  public void exibirNumeros() {
    if (!numerosList.isEmpty()) {
      System.out.println("Ordem de cadastramento dos números: " + this.numerosList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }
  
}
