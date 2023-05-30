package com.mairanath.iesp.iespflix.resource;

import com.mairanath.iesp.iespflix.model.FormaPagamento;
import com.mairanath.iesp.iespflix.service.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/formapagamento")
public class FormaPagamentoController {
    @Autowired
    private FormaPagamentoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<FormaPagamento> salvar(@RequestBody FormaPagamento formaPagamento){
        formaPagamento = service.salvar(formaPagamento);
        return ResponseEntity.ok(formaPagamento);
    }
    @PutMapping
    public ResponseEntity<FormaPagamento> alterar(@RequestBody FormaPagamento formaPagamento){
        formaPagamento = service.alterar(formaPagamento);
        return ResponseEntity.ok(formaPagamento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormaPagamento> consultar(@PathVariable("id") Integer id){
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
