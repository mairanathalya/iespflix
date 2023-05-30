package com.mairanath.iesp.iespflix.resource;

import com.mairanath.iesp.iespflix.model.Usuario;
import com.mairanath.iesp.iespflix.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
        usuario = service.salvar(usuario);
        return ResponseEntity.ok(usuario);
    }
    @PutMapping
    public ResponseEntity<Usuario> alterar(@RequestBody Usuario usuario){
        usuario = service.alterar(usuario);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Usuario> consultar(@PathVariable("cpf") String cpf){
        return ResponseEntity.ok(service.consultarPorCpf(cpf));
    }

    @DeleteMapping("/{cpf}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Boolean> excluir(@PathVariable("cpf") String cpf){
        if (service.excluir(cpf)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
