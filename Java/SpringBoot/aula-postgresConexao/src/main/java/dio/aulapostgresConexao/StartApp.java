package dio.aulapostgresConexao;

import dio.aulapostgresConexao.model.User;
import dio.aulapostgresConexao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Rodrigo");
        user.setUsername("Reborn");
        user.setPassword("21314");

        repository.save(user); //metodo save da nossa interface UserRepository

        for (User u : repository.findAll()) { // método findAll da nossa interface UserRepository
            System.out.println(u);
        }
    }
}
