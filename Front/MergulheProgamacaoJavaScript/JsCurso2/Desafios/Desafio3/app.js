/*
Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.

Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.

Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. Para isso, considere a cotação do dólar igual a R$4,80.

Crie uma função que mostre na tela a área e o perímetro de uma sala retangular, utilizando altura e largura que serão dadas como parâmetro.

Crie uma função que mostre na tela a área e o perímetro de uma sala circular, utilizando seu raio que será fornecido como parâmetro. Considere Pi = 3,14.

Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.
 */
 
let titulo = document.querySelector("h1");
titulo.innerHTML= "Desafio 3";

function calcularImc(peso, altura){
    return peso / (altura * altura);
}

function fatorial(numero){
      let resultado = 1;
      for (let i = numero; i >= 1; i--) {
        // exemplo: numero = 5 . i = numero // i = 5//
        // resultado * i == 1 x 5 // resultado = 5; i-- / i== 4
        // resultado * i == 5 *4 e assim vai
        resultado *= i; // multiplicamos o valor presente em resultado por i e somamos o resultado da multiplição ao valor em resultado
      }
    
      return resultado;
}

function converterDolarParaReal(valor){
return valor * 4.80;
}

function calcularAreaPerimetroRetangular(altura, largura){
    let area = altura * largura;
    let perimetro =(altura + largura) * 2;
    alert(`a área é de ${area} metros`)
    alert(`o perimetro é de ${perimetro} metros`)
}

function calcularAreaPerimetroCircular(raio){
    let pi = 3.14
    let area = pi * raio * raio;
    let perimetro = 2 * pi * raio;
  
  alert(`a Área é de: ${area} metros`);
  alert(`o Perímetro é de : ${perimetro} metros`);

}

function tabuada(num){
    for (let i = 1; i <= 10; i++) {
    resultado = num * i
    alert(`${num} x ${i} = ${resultado}`)
    }
}
//=======================================================================================================================================================================================//
function clickImc(){
    alert("Use ponto(.) para decimal");
    let peso = prompt("Digite seu peso");
    let altura = prompt("Digite sua altura");
    let imc = calcularImc(peso, altura);
    alert(`Seu imc é de ${imc}`)
}

function clickFatorial(){
    let numero = prompt("Digite um número:")
    parseInt(numero);
    let resultado = fatorial(numero);
    alert(`O fatorial de ${numero} é ${resultado}`);
}

function clickDolarReal(){
    let valor = prompt("Digite o valor a ser convertido para real")
    let resultado = converterDolarParaReal(valor);
    alert(`O valor $${valor} em dolar convertido para real é R$${resultado} `)
}

function clickAreaPerimetroRetangular(){
    let altura = parseFloat(prompt("Digite o valor da altura "));
    let largura = parseFloat(prompt("Digite o valor da largura "));
    calcularAreaPerimetroRetangular(altura, largura);
}

function clickAreaPerimetroCircular(){
    let raio = parseFloat(prompt("Digite o valor ddo raio"));
    calcularAreaPerimetroCircular(raio);
}

function clickTabuada(){
    let numeroTabuada = prompt("Digite a tabuada que quer")
    tabuada(numeroTabuada);
}
