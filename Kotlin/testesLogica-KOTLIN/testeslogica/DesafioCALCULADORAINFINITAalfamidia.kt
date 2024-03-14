package com.example.testeslogica

fun main(){
    var resultadoAtual= 0.0 // variavel que vai armazenar o resultado da operação e somar com a proxima operação
    var num1:Double
    var num2:Double
    var operador:String
    var repetir:String
    



   do { // executa os comandos abaixo enquanto a condiçao "repetir" for == "s"
       println("Digite o primeiro numero")
       num1 = input.nextDouble()
       println("Digite o operador + para soma, - para subtraçao, x para multiplicaçao, / para divisão")
       operador= readln()
       println("Digite o segundo numero")
       num2 = input.nextDouble()
       println("Soma atual: $resultadoAtual") // exibe a variavel que vai armazenar o resultado da operação e somar com a proxima operação
       println("+")

       when(operador){

           // valor contido na variavel resultadoAtual será somado com o valor obtido da operação com o num1 e o num2

           "+" -> { resultadoAtual += num1 + num2; println(num1 + num2) } //ou resultadoAtual = resultadoAtual + num1 + num2

           "-" -> { resultadoAtual +=  num1 - num2; println(num1 - num2) } //ou resultadoAtual = resultadoAtual + num1 - num2

           "x" -> { resultadoAtual += num1 * num2;  println(num1 * num2) } //ou resultadoAtual = resultadoAtual + num1 * num2

           "/" -> { resultadoAtual += num1 / num2;  println(num1 / num2) } //ou resultadoAtual = resultadoAtual + num1 / num2

           else ->{ println("Operador inválido!") }
       }
       println("A soma atual + o resultado da última operação realizada é = $resultadoAtual" )
       println("Deseja continuar ?")
       repetir = readln()
   }while (repetir == "s")

}