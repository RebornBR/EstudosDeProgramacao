package com.lanchonete.area.cliente;


public class Cliente {
	public void escolherLanche() {
		System.out.println("ESCOLHENDO O LANCHE");
	}
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
	public void pagarConta() {
		consultarSaldoAplicativo(); // obtém o resultado do método, mas a aplicação, as outras classes, não conhecem esse método
		System.out.println("PAGANDO A CONTA");
	}
	private void consultarSaldoAplicativo() { // apenas a classe cliente precisa conhecer esse método
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}

}