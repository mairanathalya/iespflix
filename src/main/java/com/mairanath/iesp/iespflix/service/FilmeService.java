package com.mairanath.iesp.iespflix.service;


import com.mairanath.iesp.iespflix.model.Filme;
import com.mairanath.iesp.iespflix.repository.FilmeRepository;
import lombok.extern.slf4j.Slf4j;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class FilmeService {
    @Autowired
    private FilmeRepository repository;

    public Filme salvar(Filme filme){
        return repository.save(filme);
    }

    public List<Filme> listar(){
        return repository.findAll();
    }

    public Filme alterar(Filme filme){
        if (Objects.nonNull(filme.getId())){
            filme = repository.save(filme);
        } else {
            throw new NotFoundException();
        }
        return filme;
    }

    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        } catch (Exception e){
            log.info("Erro ao realizar Exclusão: " , e);
            return false;
        }
        return true;
    }

    public Filme consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

}
