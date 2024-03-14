package dio.aulapostgresConexao.repository;

import dio.aulapostgresConexao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> { /* nossa interface extends JpaRepository
e adquire todos os seus métodos, segure ctrl e de um clique para ver os métodos da JpaRepository*/
}
