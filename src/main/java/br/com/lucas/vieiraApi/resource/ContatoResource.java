package br.com.lucas.vieiraApi.resource;
import br.com.lucas.vieiraApi.model.Contato;
import br.com.lucas.vieiraApi.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contatos")
public class ContatoResource {

    @Autowired
    public ContatoRepository contatoRepository;

    @RequestMapping("/todos")
    public List<Contato> listarTodosContatos() {
        return contatoRepository.findAll();
    }

}