package br.com.alura.curso1PrimeirosPassosSpringFramework.DesafioFinalCurso;

import br.com.alura.curso1PrimeirosPassosSpringFramework.DesafioFinalCurso.sevices.api.FipeAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiFipeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApiFipeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        FipeAPI fipeAPI = new FipeAPI();
        fipeAPI.exibeMenu();
    }
}

