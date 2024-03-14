package com.example.testeslogica

fun main (){
    var numFator:Int
    var contador:Int
    var repetir:String


    do { // executa os comandos abaixo, enquanto a condiçao "repetir" for == "s"
        println("Digite o número")
        numFator = input.nextInt()
        contador = numFator - 1 //contador vai ser obter o valor da variavel numFator e ira subtrair 1 pra que possa começar a multiplicão em, por ex, 5x4x3x2x1 em vez de 5x5x4x3x2x1

        while (contador > 1) {
            println(" $numFator x $contador") // exibe o fatorial, por exemplo, 5 x 4 = 20, 20 x 3 = 60... e continua
            contador -= 1
            numFator += numFator * contador // += é a mesma coisa q numFator + numFator * contador
            println("$numFator") // exibe o resultado da multiplição, ou seja, o valor contido após cada multiplicaçao

        }
        println("O resultado é: $numFator")
        println("Se deseja continuar, digite 'sim'")
        repetir = readln()
    } while (repetir == "sim")


}
