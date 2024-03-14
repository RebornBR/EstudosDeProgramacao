package com.example.testeslogica

fun main(){

    println("Digite o primeiro número da operação:")
    val primeiroN: Double = input.nextDouble()

    println("Digite o operador + para soma, - para subtraçao, x para multiplicaçao, / para divisão")
    val operador:String = readln()

    println("Digite o segundo número da operação:")
    val segundoN:Double = input.nextDouble()

when(operador){
    "+" -> { println(primeiroN + segundoN) }
    "-" -> { println(primeiroN - segundoN) }
    "x" -> { println(primeiroN * segundoN) }
    "/" -> { println(primeiroN / segundoN) }
    else ->{ println("Operador inválido!") }
}

}