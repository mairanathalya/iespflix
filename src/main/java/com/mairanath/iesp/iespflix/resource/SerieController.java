package com.mairanath.iesp.iespflix.resource;

import com.mairanath.iesp.iespflix.model.Serie;
import com.mairanath.iesp.iespflix.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieController {
    @Autowired
    private SerieService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Serie> salvar(@RequestBody Serie serie){
        serie = service.salvar(serie);
        return ResponseEntity.ok(serie);
    }
    @PutMapping
    public ResponseEntity<Serie> alterar(@RequestBody Serie serie){
        serie = service.alterar(serie);
        return ResponseEntity.ok(serie);
    }

    @GetMapping
    public ResponseEntity<List<Serie>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> consultar(@PathVariable("id") Integer id){
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
