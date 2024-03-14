package PilaresDoPOO.Interface.EquipamentoMultifuncional;

import PilaresDoPOO.Interface.Copiadora.Copiadora;
import PilaresDoPOO.Interface.Digitalizadora.Digitalizadora;
import PilaresDoPOO.Interface.Impressora.Impressora;

public class Multifuncional implements Impressora, Copiadora, Digitalizadora {
/*
Como nossa classe/objeto Multifuncional precisa ser 3 coisas, Impressora, Copiadora, Escaneadora.
e através da herança normal de uma classe, ou seja, com o  extends, não seria possível herdar dessas 3.
pois o java não permite a herança multipla, por isso quando criamos essas 3 as chamamos de interface e não de class
e utilizamos o comando implements, para a classe Multifuncional ter acesso as funções e carateristicas dessas 3 interfaces.
O comando implements, implementa algo, podemos dizer que ele transforma, dar a classe que o utiliza a função e as caracteristicas da interface.
basicamente dizendo que a classe tambem, nesse caso(Multifuncional) é uma impressora, copiadora e uma escaneadora.
 */
    
    public void digitalizarEscaneando() {
        System.out.println("Ditalizando pelo equipamento multifuncional");
    }

    
    public void copiar() {
        System.out.println("Copiando pelo equipamento multifuncional");
    }

    
    public void imprimir() {
        System.out.println("Imprimindo pelo equipamento multifuncional");
    }
  


}
