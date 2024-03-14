package PilaresDoPOO.Interface.Impressora;

public class Deskjet implements Impressora{ 
    /*
Estamos implementando, as caracteristicas da nossa interface na nossa classe filha Deskjet
O comando implements, implementa algo, podemos dizer que ele transforma, dar a classe que o utiliza a função e as caracteristicas da interface.
basicamente dizendo que a classe tambem, nesse caso(Deskjet) é uma impressora
     */

    public void imprimir() {
        System.out.println("Imprimindo pelo Deskjet");
    }
    
}
