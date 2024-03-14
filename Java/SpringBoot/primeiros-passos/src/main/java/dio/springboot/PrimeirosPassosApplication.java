package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {
// quando iniciarmos nossa aplicação os objetos e o que estiver dentro do nosso container será executado
	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}
}
