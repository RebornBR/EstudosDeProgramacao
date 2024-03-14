/**
Altere o conteúdo da tag h1 com document.querySelector e atribua o seguinte texto: Hora do Desafio.

Crie uma função que exiba no console a mensagem O botão foi clicado sempre que o botão Console for pressionado.

Crie uma função que exiba um alerta com a mensagem: Eu amo JS, sempre que o botão Alerta for pressionado.

Crie uma função que é executada quando o botão prompt é clicado, perguntando o nome de uma cidade do Brasil. Em seguida, exiba um alerta com a mensagem concatenando a resposta com o texto: Estive em {cidade} e lembrei de você.

Ao clicar no botão soma, peça 2 números e exiba o resultado da soma em um alerta.
 */

let titulo = document.querySelector("h1");
titulo.innerHTML= "Hora do desafio";

function clickConsole(){
    alert("Botão OK");
    console.log("Botão OK");
}

function clickAlert(){
    alert("!JS!");
}
    
function clickPrompt(){
    let cidade = prompt("Qual sua cidade ?");
    alert(`Estive em ${cidade} e lembrei de você.`);
}

function clickSoma(){
    alert("Digite 2 numeros a serem somados, use ponto(.) para decimal");
    let num1 = parseFloat(prompt());
    let num2 = parseFloat(prompt());
    let resultado = num1 + num2;
    alert(resultado);
}