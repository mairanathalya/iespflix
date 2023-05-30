package com.mairanath.iesp.iespflix.resource;

import com.mairanath.iesp.iespflix.model.ListaFavoritos;
import com.mairanath.iesp.iespflix.service.ListaFavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listafavoritos")
public class ListaFavoritosController {
    @Autowired
    private ListaFavoritosService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ListaFavoritos> salvar(@RequestBody ListaFavoritos listaFavoritos){
        listaFavoritos = service.salvar(listaFavoritos);
        return ResponseEntity.ok(listaFavoritos);
    }
    @PutMapping
    public ResponseEntity<ListaFavoritos> alterar(@RequestBody ListaFavoritos listaFavoritos){
        listaFavoritos = service.alterar(listaFavoritos);
        return ResponseEntity.ok(listaFavoritos);
    }

    @GetMapping
    public ResponseEntity<List<ListaFavoritos>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ListaFavoritos> consultar(@PathVariable("id") Integer id){
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
