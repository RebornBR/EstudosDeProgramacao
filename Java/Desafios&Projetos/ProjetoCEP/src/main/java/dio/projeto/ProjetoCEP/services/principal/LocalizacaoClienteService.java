package dio.projeto.ProjetoCEP.services.principal;

import java.util.Optional;

import dio.projeto.ProjetoCEP.model.Cliente;
import dio.projeto.ProjetoCEP.model.Endereco;
import dio.projeto.ProjetoCEP.repository.ClienteRepository;
import dio.projeto.ProjetoCEP.repository.EnderecoRepository;
import dio.projeto.ProjetoCEP.services.ClienteService;
import dio.projeto.ProjetoCEP.services.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizacaoClienteService implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;


    @Override
    public Iterable<Cliente> buscarTodos() { // metodo da classe ClienteService
        // Método findAll da nossa classe ClienteRepository
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) { // metodo da classe ClienteService
        // Metódo findById da nossa classe ClienteRepository
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) { // metodo da classe ClienteService
        // metódo que insere/salva nosso cliente
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {// metodo da classe ClienteService
        // metodo para atualizar nosso long id e Cliente
        Optional<Cliente> clienteBd = clienteRepository.findById(id); // vai buscar nosso cliente pelo id
        if (clienteBd.isPresent()) { // se ele existir, isto é, estiver presente, será salvo com o método salvarClienteComCep(cliente)
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) { // metodo da classe ClienteService
        // Deletar Cliente por ID.
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) { //CRIANDO METÓDO
        // obtemos o Endereco do Clientepelo metodo getEndereco esse por sua vez retorna um Endereco e utilizamos o metodo getCep do endereco para obter o cep do endereço retornado
        // nosso parametro recebera esse valor
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> { // buscamos pelo id o cep com o método da classe EnderecoRepository, buscamos no nosso banco de dados
            // Caso não seja encontrado, utilizamos o metodo da nossa classe ViaCepService, para retornamos o cep equivalente
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco); // salvamos esse valor
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        clienteRepository.save(cliente);
    }


}
