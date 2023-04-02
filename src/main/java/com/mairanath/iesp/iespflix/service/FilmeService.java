package com.mairanath.iesp.iespflix.service;


import com.mairanath.iesp.iespflix.model.Filme;
import com.mairanath.iesp.iespflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository repository;

    public Filme salvar(Filme filme){

        return repository.save(filme);
    }



}
