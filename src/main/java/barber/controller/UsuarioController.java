package barber.controller;

import barber.model.Usuario;
import barber.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/usuarios")
    public List<Usuario> getAll() {
        return repository.listAll();
    }

    @GetMapping("/usuario/{id}")
    public Usuario getOne(@PathVariable("id") Integer id) {
        return repository.finById(id);
    }

    @PostMapping("/usuarios")
    public void post(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @PutMapping("/usuarios")
    public void put(@RequestBody Usuario usuario) {
        repository.update(usuario);
    }

    @DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.remove(id);
    }
}
