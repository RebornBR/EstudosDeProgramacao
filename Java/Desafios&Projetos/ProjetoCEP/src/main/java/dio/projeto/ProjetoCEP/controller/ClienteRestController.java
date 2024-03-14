package dio.projeto.ProjetoCEP.controller;

import dio.projeto.ProjetoCEP.model.Cliente;
import dio.projeto.ProjetoCEP.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes") // nosso prefixo padrão, existe para todos nossos Mapping
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/todosclientes")
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("buscar-porid/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping("/inserir")
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) { //RequestBody converte nosso cliente para um JSON
        clienteService.inserir(cliente); // metodo da nossa classe ClienteService, que está sendo usado na LocalizacaoClienteService juntamente com outro metódo
        //para salvar nosso cliente
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        clienteService.atualizar(id, cliente); // metodo da nossa classe ClienteService, que está sendo usado na LocalizacaoClienteService juntamente com outro metódo
        //para salvar nosso cliente
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteService.deletar(id); // metodo da nossa classe ClienteService, que está sendo usado na LocalizacaoClienteService juntamente com outro metódo
        //para salvar nosso cliente
        return ResponseEntity.ok().build();
    }
}
