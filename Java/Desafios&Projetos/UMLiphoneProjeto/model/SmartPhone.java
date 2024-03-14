package UMLiphoneProjeto.model;

import UMLiphoneProjeto.model.Funcionalidades.AparelhoTelefonico;
import UMLiphoneProjeto.model.Funcionalidades.NavegadorIntenet;
import UMLiphoneProjeto.model.Funcionalidades.ReprodutorMusical;

public class SmartPhone implements AparelhoTelefonico, NavegadorIntenet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página do G1");
    }

    @Override
    public void adicionarNovaAba() {
       System.out.println("Aba adicionada");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Atualizando página");
    }

    @Override
    public void ligar() {
       System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
}
