package com.example.testeslogica
fun calcularImc(): Double {
    println("peso")
    val peso:Double = input.nextDouble()
    println("altura")
    val altura:Double = input.nextDouble()
    val imc:Double = peso / (altura * altura)

    return imc  // quando a função for executa ou chamada, irá retornar o valor da alocado na variavel imc
}
fun main(){
    // usamos o resultado/RETORNO da função calularImc
    // podemmos fazer sem a função exemplo:
    // println("Digite seu peso")
    // val peso:Double = input.nextDouble()
    // println("Digite sua altura")
    // val altura:Double = input.nextDouble()
    // val imc:Double = peso / (altura * altura)
    // println("IMC igual a $imc")
    // if (imc < 17){ println("muito abaixo do peso") }
    // else if(imc <= 18.49) { println("abaixo do peso") }
    do {
val resultadoImc = calcularImc() // armazena o retorno da funçao calcularImc(), ou seja, armazena o valor da variavel imc presente na funçao calcularImc().

    if (resultadoImc < 17){ println("muito abaixo do peso") }
    else if(resultadoImc <= 18.49) { println("abaixo do peso") }
    else if(resultadoImc <= 24.99) { println("peso normal") }
    else if(resultadoImc <= 29.99) { println("acima do peso") }
    else if(resultadoImc <= 34.99) { println("Obesidade I") }
    else if(resultadoImc <= 39.99) { println("Obesidade II(Severa)") }
    else if(resultadoImc >= 40.00) { println("Obesidade III(Mórbida)") }

    //IF INVERTIDO, CODIGO DE CIMA COM A ORDEM INVERTIDA E ALGUMAS ALTERAÇÕES
    // SUBSTITUIÇÃO DO <= PELO >=
    println(".................IF INVERTIDO.................")

    if(resultadoImc >= 40.00) { println("Obesidade III(Mórbida)") }
    else if(resultadoImc >= 34.99)  { println("Obesidade II(Severa)") }
    else if(resultadoImc >= 29.99) { println("obesidade I") }
    else if(resultadoImc >= 24.99) { println(" acima do peso") }
    else if(resultadoImc >= 18.49) { println("peso normal") }
    else if(resultadoImc >=  17.00) {println("abaixo do peso")}
    else if (resultadoImc < 17){ println("muito abaixo do peso") }

    //IF UTILIZANDO O RANGE, MAS PODEMOS USAR O OPERADOR LOGICO AND(&&). EX: imc >= 17.00 && imc <= 18.49
    println(".................IF RANGE.................")
    if(resultadoImc < 17){ println("muito abaixo do peso") }
    else if(resultadoImc in 17.00..18.49)  { println("Abaixo do peso") } // pode usar -> imc >= 17.00 && imc <= 18.49
    else if (resultadoImc in 18.50..24.99) { println("Peso normal") }
    else if (resultadoImc in 25.00..29.99) { println("Acima do peso") } // pode usar -> imc >= 25.00 && imc <= 29.99
    else if (resultadoImc in 30.00..34.99) { println("Obesidade I")}
    else if (resultadoImc in 35.00..39.99) { println("Obesidade II(Severa)")}
    else if (resultadoImc >= 40) { println("Obesidade III(Mórbida)") }

    println("-----------------------------------------------------")
    println("Digite S para calcular outro imc")
    val repetir:String = readln()
} while (repetir == "s")
}