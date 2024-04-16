package com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula3.ClassesFilhas;

import com.alura.curso2OrientacaoObjetos.Desafios.DesafioAula3.model.Animal;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");;
    }
}
