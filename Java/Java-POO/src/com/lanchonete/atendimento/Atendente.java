package com.lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() { // todas as classes, toda nossa aplicaçâo conhece esse método
        pegarLancheCozinha(); // obtém o resultado desse método, mas as outras classes, a aplicação não conhece a existencia desse método
		pegarPedidoBalcao();// obtém o resultado desse método, mas as outras classes, a aplicação não conhece a existencia desse método
		System.out.println("SERVINDO A MESA");
	}
	private void pegarLancheCozinha() { // apenas a classe Atendente precisa saber da existencia desse método
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	 private void trocarGas() { // apenas a classe Atendente precisa saber da existencia desse método
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}
	private void pegarPedidoBalcao() { // apenas a classe Atendente precisa saber da existencia desse método
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
    }
}