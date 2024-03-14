//Crie um contador que comece em 1 e vá até 10 usando um loop while. Mostre cada número.
let contador = 1;
while(contador <= 10){
    alert(`Contando ${contador}`);
    contador++;
}

//Crie um contador que começa em 10 e vá até 0 usando um loop while. Mostre cada número.
alert("Ao contrário");
contador = 10; 
while(contador >= 0 ){
    alert(`Contando ${contador}`);
    contador--;
}

//Crie um programa de contagem regressiva. Peça um número e conte deste número até 0, usando um loop while no console do navegador.
let numeroEscolhido = prompt("Digite um número, conta regressiva");
while(numeroEscolhido >= 0){
    console.log(`contando ${numeroEscolhido}`)
    numeroEscolhido--;
}

// Crie um programa de contagem progressiva. Peça um número e conte de 0 até esse número, usando um loop while no console do navegador.
numeroEscolhido = prompt("Digite um número, conta progressiva");
contador = 0;
while(contador <= numeroEscolhido){
    console.log(`contando ${numeroEscolhido}`)
    contador++;
}