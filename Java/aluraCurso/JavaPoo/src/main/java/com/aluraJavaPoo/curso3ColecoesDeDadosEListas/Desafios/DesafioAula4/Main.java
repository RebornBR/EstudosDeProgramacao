package com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula4;

import com.aluraJavaPoo.curso3ColecoesDeDadosEListas.Desafios.DesafioAula4.model.TituloDesafio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(7);
        listaDeNumeros.add(10);
        listaDeNumeros.add(1);
        System.out.println("Lista Desordenada: " + listaDeNumeros);
        Collections.sort(listaDeNumeros);
        System.out.println("Lista ordenada: " + listaDeNumeros);

        System.out.println("=====================================================");
        TituloDesafio4 titulo1 = new TituloDesafio4("O chefe");
        TituloDesafio4 titulo2 = new TituloDesafio4("A matança");
        TituloDesafio4 titulo3 = new TituloDesafio4("El Dorado");
        TituloDesafio4 titulo4 = new TituloDesafio4("Zorro");
        List<TituloDesafio4> listDeTitulos = new ArrayList<>();
        listDeTitulos.add(titulo1);
        listDeTitulos.add(titulo2);
        listDeTitulos.add(titulo3);
        listDeTitulos.add(titulo4);
        System.out.println("Lista Desordenada: " + listDeTitulos);
        Collections.sort(listDeTitulos);
        System.out.println("Lista ordenada: " + listDeTitulos);
        System.out.println("=====================================================");

        List<String> listaPolimorfica;
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
 }

