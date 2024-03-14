package com;
import com.lanchonete.area.cliente.Cliente;
import com.lanchonete.atendimento.Atendente;
import com.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
    Cliente clienteLanchonete = new Cliente(); /*criamos um novo objeto chamado "clienteLanchonete" e instaciamos, chamamos seu construtor/classe com o new, chamado "Cliente" 
    que conterá as suas características */ 
    Cozinheiro cozinheiroLanchonete = new Cozinheiro(); /*criamos um novo objeto chamado "cozinheiroLanchonete" e instanciamos, chamamos seu construtor/classe com o new, chamado "Cozinheiro" 
    que conterá as suas características */ 
    Atendente atendenteLanchonete = new Atendente(); /*criamos um novo objeto chamado "clienteLanchonete" e instanciamos, chamamos seu construtor/classe com o new, chamado "Atendente" 
    que conterá as suas características */ 
// Agora chamaremos seus métodos, só vai funcionar com seus métodos publicos

        System.out.println("Cliente:");
    clienteLanchonete.escolherLanche();
    clienteLanchonete.fazerPedido();
        System.out.println("Cozinheiro:");
    cozinheiroLanchonete.adicionarLancheNoBalcao();
    cozinheiroLanchonete.adicionarSucoNoBalcao();
    cozinheiroLanchonete.adicionarComboNoBalcao();
        System.out.println("Atendente:");
    atendenteLanchonete.servindoMesa();
        System.out.println("Cliente:");
    clienteLanchonete.pagarConta();
        System.out.println("Atendente:");
    atendenteLanchonete.receberPagamento();

}
}
