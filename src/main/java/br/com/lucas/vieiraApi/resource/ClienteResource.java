package br.com.lucas.vieiraApi.resource;

import br.com.lucas.vieiraApi.model.Cliente;
import br.com.lucas.vieiraApi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteResource {

    @Autowired
    public ClienteRepository clienteRepository;

    @RequestMapping("/todos")
    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll();
    }
}
