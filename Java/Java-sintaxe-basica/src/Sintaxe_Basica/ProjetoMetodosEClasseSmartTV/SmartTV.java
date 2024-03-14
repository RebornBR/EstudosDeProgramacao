package Sintaxe_Basica.ProjetoMetodosEClasseSmartTV;

public class SmartTV {
    boolean ligadoOuDesligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){  // void, n temos parametro  // public significa que está visivel para todas as outras classes, teste trocar por private, pra ver na pratica.
        ligadoOuDesligado = true;
        System.out.println("Sua TV foi ligada");
    }

    public void desligar() {
        ligadoOuDesligado = false;
         System.out.println("Sua TV foi desligada..............");
    }

    public void aumentarCanal(){
        canal++; // mesma coisa que, canal = canal + 1
        System.out.println("Canal atual: " + canal );
    }

    public void diminuirCanal(){
        canal--; // mesma coisa que, canal = canal - 1
        System.out.println("Canal atual: " + canal );
    }

    public void mudarCanal( int usuarioDigitaCanal){
        canal = usuarioDigitaCanal;
        System.out.println("Você digitou o canal:" + usuarioDigitaCanal);
        System.out.println("Canal atual: " + usuarioDigitaCanal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume atual:" + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume atual:" + volume);
    }

}
