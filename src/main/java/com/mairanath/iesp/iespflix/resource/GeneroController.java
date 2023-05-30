package com.mairanath.iesp.iespflix.resource;

import com.mairanath.iesp.iespflix.model.Genero;
import com.mairanath.iesp.iespflix.service.GeneroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    private GeneroService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Genero> salvar(@RequestBody Genero genero){
        genero = service.salvar(genero);
        return ResponseEntity.ok(genero);
    }

    @PutMapping
    public ResponseEntity<Genero> alterar(@RequestBody Genero genero){
        genero = service.alterar(genero);
        return ResponseEntity.ok(genero);
    }

    @GetMapping
    public ResponseEntity<List<Genero>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genero> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if (service.excluir(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }




}
