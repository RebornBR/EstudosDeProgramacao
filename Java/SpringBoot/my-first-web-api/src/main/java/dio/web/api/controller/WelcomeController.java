package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // nossa classe é um RestController e isso significa que alguns dos seu métodos serão serviços HTTPP
// disponibiliza as funcionalidades de negócio através do protocolo HTTP
public class WelcomeController {
    @GetMapping("/welcome") // indica que o método é um recurso http do tipo get
    public String welcome(){
        return "Bem-vindo ao Spring Boot Rest API";
    }
}
