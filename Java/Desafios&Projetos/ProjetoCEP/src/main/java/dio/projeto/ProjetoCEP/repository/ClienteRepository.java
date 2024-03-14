package dio.projeto.ProjetoCEP.repository;

import dio.projeto.ProjetoCEP.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    // Extendemos CrudRepository e passamos a ter todos os seu metódos de interação com nosso banco de dados H2
}