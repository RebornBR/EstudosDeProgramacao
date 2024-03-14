package com.example.testeslogica


const val pi = 3.14

fun main(){


    println("Digite o Raio do cilindro:")
    val rCilindro:Double = input.nextDouble()
    println("Digite a altura do Cilindro:")
    val alturaCilindro:Double= input.nextDouble()

    val volume= pi *(rCilindro * rCilindro * alturaCilindro)

    println("O volume do cilindro é: $volume ")



}