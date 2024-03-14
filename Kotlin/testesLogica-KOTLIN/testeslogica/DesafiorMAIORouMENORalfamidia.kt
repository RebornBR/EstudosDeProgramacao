package com.example.testeslogica

fun main(){
    var maiorNum:Double
    var menorNum:Double
    var entrada:Double
    var repetir:String

    println("Digite o primeiro número")
    entrada = input.nextDouble()
    maiorNum = entrada
    menorNum = entrada
    println("Maior numero até agora $maiorNum. Menor numero até agora $menorNum")

    do{ // executa os comandos abaixo, enquanto a condiçao "repetir" for == "s"
        println("proximo número")
        entrada= input.nextDouble()

        if(entrada > maiorNum){ maiorNum = entrada} // quando entrada for maior, o valor contido na variável maiorNum será substituido
        if(entrada < menorNum){ menorNum = entrada} // quando entrada for menor, o valor contido na variável menorNum será substituido

        println("Maior numero até agora $maiorNum. Menor numero até agora $menorNum")
        println("Aperte s para continuar ou digite 'fim' para parar")
        repetir = readln()

    }while (repetir != "fim")
}