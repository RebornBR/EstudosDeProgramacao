package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // restcontroller é responsavel pelo direcionamento das nossas funcionalidades
@RequestMapping("/usuarios") // @RequestMapping("prefix"): Determina qual a URI comum para todos os recursos disponibilizados pelo Controller.
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/todosUsuarios") // adicionamos o prefixo e dps seu endereço, exemplo, localhost:8080/usuarios/todosUsuarios
    public List<Usuario> list(){
        return repository.findAll(); // método da nossa classe UsuarioRepository
    }
    @PostMapping("/salvarUsuario") //@PostMapping: Determina que o método aceitará requisições HTTP do tipo POST.
    public void save(@RequestBody Usuario user){ // @RequestBody: Converte um JSON para o tipo do objeto esperado como parâmetro no método.
        repository.save(user); // método da nossa classe UsuarioRepository
    }
    @PutMapping("/alterarUsuario") //@PutMapping: Determina que o método aceitará requisições HTTP do tipo PUT.
    public void update(@RequestBody Usuario user){ //@RequestBody: Converte um JSON para o tipo do objeto esperado como parâmetro no método.
        repository.save(user); // método da nossa classe UsuarioRepository
    }
    @GetMapping("localizarPorLogin-username/{loginUsuario}") // nome do nosso direcionamento(URI), não podemos utilizar com mesmo nome
    // entre {} é o parametro que será utilizado no URI
    public Usuario findLogin(@PathVariable("loginUsuario") String loginUsuario){ // @PathVariable: Consegue determinar que parte da URI será composta por parâmetros recebidos nas requisições.
        return repository.findByUsername(loginUsuario); // método da nossa classe UsuarioRepository
    }
    @GetMapping("/localizarUsuarioPorID/{idUsuario}")
    public void findId(@PathVariable("idUsuario") Integer idUsuario){ // @PathVariable indica que o idUsuario será um paramentro no nosso URI/endereço
        repository.findById(idUsuario);
    }
    @DeleteMapping("deletarUsuario/{idUsuario}") //@DeleteMapping: Determina que o método aceitará requisições HTTP do tipo DELETE.
    public void delete(@PathVariable("idUsuario") Integer idUsuario){//@PathVariable: Consegue determinar que parte da URI será composta por parâmetros recebidos nas requisições.
        repository.deleteById(idUsuario); // método da nossa classe UsuarioRepository
    }
}
