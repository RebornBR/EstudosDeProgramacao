alert("Olá Brasil! Boa Vindas ao jogo do número secreto!");
let numMax = 100;
let numeroSecreto = parseInt(Math.random() * numMax + 1) ; 
/**
 * Math.random traz um número decimal entre 0 e 9(ex: 0.223123123131), multiplicamos esse valor por 100, ou por 10, 1000, etc. e e podemos somar mais 1, para que possamos chegar
 * no caso de multiplicar, por exemplo por 10, possamos chegar no número 10, ou seja, indo de 0 a 10
 * */ 
let numeroChute;
let tentativas = 1;
    
while(numeroChute != numeroSecreto){ 
   numeroChute = prompt("Escolha um número entre 1 e " + numMax);
    console.log("o número escolhido é: " + numeroChute);
    console.log("Comparação número Secreto igual ao número escolhido ?", numeroChute == numeroSecreto);

    if(numeroSecreto == numeroChute ) {

        break; // quando acertar paramos o loop WHILE e executamos os códigos fora do while

    }else {
        tentativas++;
        console.log("o número secreto é: " + numeroSecreto);
        alert("VOCÊ NÃO DESCOBRIU O NÚMERO, TENTE NOVAMENTE");
        if(numeroChute > numeroSecreto) {
            alert(`o número secreto é MENOR que ${numeroChute}`);
        }else {
            alert(`o número secreto é MAIOR que ${numeroChute}`);
        }
    } 
}
// códigos executados quando o while for interrompido

/**
 * Podemos usar um operador ternário para substituirmos a palavra vez
 * exemplo:
 * let palavraVez = tentativas > 1 ? "vezes" : "vez";
 * tentativas maior que 1 ? se for, retorna "vezes", se nao for, retorna "vez"
 * Basicamente faz a mesma coisa abaixo, mas com muito menos código
 */
 alert("Número secreto descoberto, o número é: " + numeroSecreto );
    if (tentativas > 1 ) {
    alert(`Você tentou ${tentativas} vezes para acertar o número secreto`);
    //ou
    //  alert(`Número secreto descoberton, o número é: ${numeroSecreto}´);   
    }else {
 alert(`Você tentou ${tentativas} vez para acertar o número secreto`);
    }  
let palavraVez = tentativas > 1 ? "vezes" : "vez";
alert("com operador ternário:");
alert(`Você tentou ${tentativas} ${palavraVez} para acertar o número secreto`);
