package com.example.testeslogica


fun main(){
    var num1:Int
    var num2:Int
    var num3:Int
    var num4:Int
    val num5:Int

    println("digite o número de entradas, min 2 e max 5")
    val xis:Int= input.nextInt()

// se xis estiver entre 2 e 5 ira exucutar os comandos abaixo

    if(xis in 2..5 ){  // pode usar xix >=2 && xis <= 5
        println("Deseja ver a ordem inversa ? Digite S para a visualizar")
        val ordem:String = readln()

        println("A quantidade de entradas é $xis:")
        if(xis == 2) { // se xix igualmente(==), ou seja, se o valor de xis for igual a 2, executará os comandos abaixo
            println("Primeira entrada:")
            num1= input.nextInt()
            println("Segunda entrada:")
            num2 = input.nextInt()
            println("entrada 1 = $num1 e entrada 2 = $num2")

            if (ordem == "s") { println("Ordem inversa: $num2 e $num1")}
        }
        if(xis == 3) {
            println("Primeira entrada:")
            num1= input.nextInt()
            println("Segunda entrada:")
            num2 = input.nextInt()
            println("Terceira entrada:")
            num3= input.nextInt()
            println("entrada 1 = $num1 , entrada 2 = $num2 e entrada 3 = $num3")
            if (ordem == "s") { println("Ordem inversa: $num3, $num2 e $num1") }
        }
        if(xis == 4 ){
            println("Primeira entrada:")
            num1= input.nextInt()
            println("Segunda entrada:")
            num2 = input.nextInt()
            println("Terceira entrada:")
            num3= input.nextInt()
            println()
            println("Quarta entrada:")
            num4 = input.nextInt()
            println("entrada 1 = $num1, entrada 2 = $num2, entrada 3 = $num3 e  entrada 4 =$num4")
            if (ordem == "s") { println("Ordem inversa: $num4, $num3, $num2 e $num1") }
        }
        if(xis == 5) {
            println("Primeira entrada:")
            num1= input.nextInt()
            println("Segunda entrada:")
            num2 = input.nextInt()
            println("Terceira entrada:")
            num3= input.nextInt()
            println()
            println("Quarta entrada:")
            num4 = input.nextInt()
            println("Quinta entrada:")
            num5 = input.nextInt()
            println("entrada 1 = $num1, entrada 2 = $num2, entrada 3 = $num3,  entrada 4 =$num4 e entrada 5 = $num5 ")
            if (ordem == "s") { println("Ordem inversa: $num5, $num4, $num3, $num2 e $num1") }
        }
    } else {println("Por favor escolha um número entre 2 e 5 !")}

}