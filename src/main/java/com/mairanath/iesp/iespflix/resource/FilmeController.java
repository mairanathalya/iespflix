package com.mairanath.iesp.iespflix.resource;


import com.mairanath.iesp.iespflix.model.Filme;
import com.mairanath.iesp.iespflix.service.FilmeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {
    @Autowired
    private FilmeService service;

    @PostMapping
    public ResponseEntity<Filme> salvar(Filme filme){
        filme= service.salvar(filme);
        return ResponseEntity.ok(filme);
    }
     @GetMapping
    public ResponseEntity<List<Filme>> listar(){
         return service.

     }

}
