package UMLiphoneProjeto;

public class Usuario {
    public static void main(String[] args) {
        Iphone usuario = new Iphone();
        System.out.println("Telefone");
        usuario.atender();
        usuario.ligar();
        usuario.iniciarCorreioVoz();
        System.out.println("\n" + "Navegador");
        usuario.adicionarNovaAba();
        usuario.exibirPagina();
        usuario.atualizarPagina();
        System.out.println("\n" +"Reprodutor música");
        usuario.tocar();
        usuario.pausar();
        usuario.selecionarMusica();
    }
}
