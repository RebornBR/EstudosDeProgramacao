package com.example.testeslogica

fun main(){
    println("Estrutura SEM bloco de comando -> {  }")
    println("Se X for maior que 10, exibe as 2 mensagens. Se X for menor exibe a segunda mensagem")
    println("digite o valor de x")
    val x:Int= input.nextInt()
    if(x >10)
        println("olá mundo") // só vai se exibido se a condiçao for atendida, ou seja, se x for maior que 10
        println("tchau mundo")

    println("---------------------------------------------------------------------------------------")
    //As chaves -> { }  definem um bloco, e precisamos definir blocos quando queremos fazer o fluxo
    // de execução executar em um conjunto de comandos.

    println("Estrutura COM bloco de comando -> {  }")
    println("Só vai exibir as mensagens, ou seja, executar os comandos se Y for maior que 10, isto é, se a condição do IF for atendida")
    println("Digite o valor para y")
    val y: Int = input.nextInt()
    if (y > 10){
        println("olá mundo")
        println("tchau mundo")
    }
}