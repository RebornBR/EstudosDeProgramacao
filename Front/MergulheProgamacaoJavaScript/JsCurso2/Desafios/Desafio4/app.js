/** 
Crie uma lista vazia, com o nome listaGenerica.
Crie uma lista de linguagens de programação chamada linguagensDeProgramacao com os seguintes elementos: 'JavaScript','C','C++', 'Kotlin' e 'Python'.
Adicione à lista linguagensDeProgramacao os seguintes elementos: 'Java', 'Ruby' e 'GoLang'.
Crie uma lista com 3 nomes e exiba no console apenas o primeiro elemento.
Crie uma lista com 3 nomes e exiba no console apenas o segundo elemento.
Crie uma lista com 3 nomes e exiba no console apenas o último elemento.
*/
let listaGenerica = [];
let linguagensProgramação= ["JavaScript", "C", "C++", "Kotlin", "Python"];
alert(linguagensProgramação);
alert("Pós push: " )
linguagensProgramação.push("Java")
linguagensProgramação.push("Ruby")
linguagensProgramação.push("Goulang")
alert(linguagensProgramação);

let listaTresNomes = ["Reborn", "Brasil", "Pernambuco"]
console.log(listaTresNomes[0]);
console.log(listaTresNomes[1]);
console.log(listaTresNomes[2]); // ou console.log(listaTresNomes[listaTresNomes.length - 1]); -- retorna o ultimo elemento do array
console.log(listaTresNomes[listaTresNomes.length - 1]);


