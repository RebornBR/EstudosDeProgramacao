package dio.springboot;

import org.springframework.stereotype.Component;

@Component
// comando para que possamos criar, utilizar nosso objeto calculadora no nosso container
// e não o instanciarmos com o new
public class Calculadora {
    public int somar(int numero1, int numero2){
        return numero1 + numero2;
    }

}
