/**
Criar uma função que exibe "Olá, mundo!" no console.

Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.

Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.

Criar uma função que recebe três números como parâmetros e retorna a média deles.

Criar uma função que recebe dois números como parâmetros e retorna o maior deles.

Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo
 */
function ola(){
    return "Olá mundo";
}

function olaNome(nome){
    return `Olá, ${nome}`;
}

function dobro(number){
return number * 2;
}

function mediaTres(number1, number2, number3){
    return (number1 + number2 + number3)/3;
}

function qualMaior(num1, num2){
return num1 > num2 ? `${num1} é o maior`: `${num2} é o maior`
}

function elevarQuadrado(num1){
 return num1 * num1;
}




console.log(ola);
console.log(olaNome("Reborn"));

let number = 50;
console.log("Resultado: " + dobro(number));

let number1 = 3;
let number2 = 4;
let number3 = 5;
console.log("Resultado média: " + mediaTres(number1, number2, number3));

numMaior = qualMaior(15, 9);
console.log("maior numero: " + numMaior);

let eleveQuad = elevarQuadrado(2);
console.log("ao quadrado: " + eleveQuad);
