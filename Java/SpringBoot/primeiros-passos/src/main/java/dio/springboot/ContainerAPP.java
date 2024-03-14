package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
// nossa classe container
@Component // teremos um component que é um stereotype do spring terá outro component chamado calculadora(uma dependencia)
public class ContainerAPP implements CommandLineRunner { // implementação do CommandLineRunner
    // comando que ao inicializarmos nossa aplicação, tudo que estiver dentro dele, sera executado, oq tiver dentro dele é nosso "container"
    // quando o container subir, iniciar, essa classe será iniciada.
    @Autowired // para podermos inserir nossos components
    private Calculadora calculadora; // criamos um objeto/component calculadora sem o new
    @Override
    public void run(String... args) throws Exception {// quando iniciarmos nossa aplicação a linha abaixo será executada
        System.out.println("o resultado é " + calculadora.somar(2,7));
    }
}
