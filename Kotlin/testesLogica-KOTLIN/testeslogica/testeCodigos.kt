package com.example.testeslogica

import java.util.Scanner

val input = Scanner(System.`in`)
fun main (){
    println("Nome aluno:")
    val nome: String = readln()

    println("Digite a primeira nota")
    val nota1:Double = input.nextDouble()

    println("Digite a segunda nota")
    val nota2:Double = input.nextDouble()

    val media:Double = (nota1 + nota2) /2
    println("Sua média é: $media ")

    if( media < 6) {
        println("Aluno: $nome \nStatus: Reprovado ")
         }

}