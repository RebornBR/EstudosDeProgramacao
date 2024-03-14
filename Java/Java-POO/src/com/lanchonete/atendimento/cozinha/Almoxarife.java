package com.lanchonete.atendimento.cozinha;

public class Almoxarife { 
	private void controlarEntrada() { // apenas a classe almoxarife tem conhecimento desse método
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() { // apenas a classe almoxarife tem conhecimento desse método
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() { // apenas as classes dentro do pacote/pasta(cozinha) tem conhecimento desse método.
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida(); // agora o cozinheiro vai ter acesso ao resultado do método controlarSaida, mas permanece sem conhecer a sua estrutura, o seu método.
		controlarEntrada(); // agora o cozinheiro vai ter acesso ao resultado do método controlarEntrada, mas permanece sem conhecer a sua estrutura, o seu método.
		// terá acesso atráves do método entregrarIngredientes, que é visível apenas ao pacote
	}
	void trocarGas() { // apenas as classes dentro do pacote/pasta(cozinha) tem conhecimento desse método.
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
