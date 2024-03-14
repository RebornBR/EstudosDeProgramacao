package com.lanchonete.atendimento.cozinha;

import com.lanchonete.atendimento.Atendente; // import, pois a classe Atendente está em outro pacote(package)

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() { // todas as classes, toda nossa aplicaçâo conhece esse método
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() { // todas as classes, toda nossa aplicaçâo conhece esse método
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}
	//pode ser default
	public void adicionarComboNoBalcao() { // todas as classes, toda nossa aplicaçâo conhece esse método
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() { // apenas a classe cozinheiro precisa saber da existencia desse método
		System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
	}
	private void prepararVitamina() { // apenas a classe cozinheiro precisa saber da existencia desse método
		System.out.println("PREPARANDO SUCO");
	}
	private void prepararCombo() { // apenas a classe cozinheiro precisa saber da existencia desse método
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() { // apenas a classe cozinheiro precisa saber da existencia desse método
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	private void selecionarIngredientesVitamina() { // apenas a classe cozinheiro precisa saber da existencia desse método
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() { // apenas a classe cozinheiro precisa saber da existencia desse método
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() { // apenas a classe cozinheiro precisa saber da existencia desse método
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	private void fritarIngredientesLanche() { // apenas a classe cozinheiro precisa saber da existencia desse método
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();  //chama o método trocarGas da classe Almoxarife
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();  //chama o método entregarIngredientes da classe Almoxarife
	}
}
