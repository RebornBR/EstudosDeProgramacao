package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CamposObrigatoriosException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository { // fake banco de dados, simulando um banco de dados
    public void save(Usuario usuario){
        if(usuario.getLogin()== null){ // quando não inserimos nosso login, isto é, ele for null, lançaremos a nossa Exception que é uma BusinessException
          //  throw new BusinessException("O campo login é obrigatório"); // ideal para quando tivermos, varios tipos de exception que podem ocorrer com diferentes tipos de negocios
            // como temos 2 campos obrigatórios, podemos criar uma exception que extenda nosso BusinessException e tenha uma mensagem padrão para esse tipo de exceção
            throw  new CamposObrigatoriosException("login"); // o campo(parametro) recebe login
        }
        if(usuario.getPassword() == null){
            throw  new CamposObrigatoriosException("password");
        } // com isso temos uma única exception que padroniza a mensagem para exceçoes em que precisamos de campos obrigatórios, e indicamos o nome de tal campo que é obrigatorio
        // evitando redundancia, escrita de código repetitiva.


        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario); // retornamos o usuario
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("rodrigo","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("rodrigo","password"); // sempre retorna isso, pois é apenas uma simulação de banco de dados
    }
    public Usuario findByUsername(String loginUsuario){
        System.out.println(String.format("FIND/loginUsuario - Recebendo o login: %s para localizar um usuário", loginUsuario));
        // %s indica que o parametro que está fora do "" será retornado ali dentro
        return new Usuario("frannk","password");

    }
}
