package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
// User é o tipo, Integer é o tipo do id da nossa tabela
public interface UserRepository extends JpaRepository<User, Integer> { /* nossa interface extends JpaRepository
e adquire todos os seus métodos, segure ctrl e de um clique para ver os métodos da JpaRepository*/
}
