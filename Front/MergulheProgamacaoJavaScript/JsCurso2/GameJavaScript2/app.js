let listaNumerosSorteados = [];
let numMax = 100;
let i = 1;
/**
 * 
 * Função que gera um número aleatorio e insere todos os numeros aleatorios já gerados em um array, e impede que eles sejam chamados novamente
 * @returns numeroAleatorio:Int
 */
function gerarNumAleatorio(){
    alert("Números já sorteados" + listaNumerosSorteados);
    numeroAleatorio = parseInt(Math.random() * numMax + 1) ; 
    let quantidadeListaNumeros = listaNumerosSorteados.length;
    
    if(quantidadeListaNumeros == numMax){
        listaNumerosSorteados= [];
    }

    if(listaNumerosSorteados.includes(numeroAleatorio)){// includes, verifica se existe o elemento no array(lista)
        gerarNumAleatorio(); // se existe, geramos outro numero aleatorio
    }else{ // se n existe, insere na lista
        listaNumerosSorteados.push(numeroAleatorio); // push, insere um elemento na lista
        return numeroAleatorio;
    }
}

/**
 * Função para limpar o campo do input, presente no html
 */
function limparCampo(){
chute = document.querySelector("input");
chute.value = "";
}

 let numeroSecreto = gerarNumAleatorio();


/**
 * let titulo = document.querySelector("h1"); // estamos dizendo qual elemento/tag(nome) presente no html, será atribuido a nossa variavel
titulo.innerHTML= "Jogo do número secreto"; // método que passa o novo valor para o elemento presente no html
let paragrafo = document.querySelector("p");
paragrafo.innerHTML= `Escolha um número entre 0 e ${numMax}`;
podemos criar uma função que faca isso, para que n precise fazer o mesmo codigo para cada tag(elemento)
 */

function passarTextoParaHtml(tag, texto){
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
    responsiveVoice.speak(texto, "Brazilian Portuguese Female", {rate:1.2}); // html presente linha 7, para utilizarmos um voz que narra o nosso texto
}

/**
 * Função que exibe as mensagens iniciais, ao inicio e ao final do game
 */
function mensagemInicial(){
passarTextoParaHtml("h1","Jogo do número secreto");
passarTextoParaHtml("p",`Escolha um número entre 0 e ${numMax}` )
}


    mensagemInicial(); // mensagem exibida quando abrimos o jogo



/**
 * Função onclick botão Chute, presente html
 */
function verificarChute(){ // função onclick(botão) presente no html, nome botão "chutar"
         let chute = document.querySelector("input").value;
         if(numeroSecreto == chute ) {
            limparCampo();
            let palavraVez = i > 1 ? "tentativas" : "tentativa";
            passarTextoParaHtml("h1", `Parabéns, você acertou em ${i} ${palavraVez}`);
            passarTextoParaHtml("p", `Número secreto descoberto (${numeroSecreto})`)
            document.getElementById("reiniciar").removeAttribute("disabled") //responsavel por obter um elemento com id respectivo no html, e nesse caso utilizamos
            // a função removeAttribute para retirar o disabled, assim ativando o botão
         }else {
             i++;
             if(chute > numeroSecreto) {
                passarTextoParaHtml("p", `O número secreto é MENOR que (${chute})`);
             }else {
                passarTextoParaHtml("p", `O número secreto é MAIOR que (${chute})`);
             }
             limparCampo(); // limpa o campo do input, toda vez que erramos 
         } 
     }

/**
 * Função onclick botão Novo Jogo, presente html
 */
function reiniciarJogo(){
    numeroSecreto = gerarNumAleatorio();
    tentativas = 1;
    limparCampo();
    mensagemInicial(); // função onclik, presente html
    document.getElementById('reiniciar').setAttribute("disabled", true); // agr estamos atribuiindo um atributo, no caso o disabled, e queremos que ele seja verdadeiro(true)
}