package com.mairanath.iesp.iespflix.service;

import com.mairanath.iesp.iespflix.model.ListaFavoritos;
import com.mairanath.iesp.iespflix.repository.ListaFavoritosRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class ListaFavoritosService {
    @Autowired
    private ListaFavoritosRepository repository;
    public ListaFavoritos salvar(ListaFavoritos listaFavoritos) {
        return repository.save(listaFavoritos);
    }

    public ListaFavoritos alterar(ListaFavoritos listaFavoritos) {
        if (Objects.nonNull(listaFavoritos.getId())){
            listaFavoritos = repository.save(listaFavoritos);
        } else {
            throw new NotFoundException();
        }
        return listaFavoritos;
    }

    public List<ListaFavoritos> listar() {
        return repository.findAll();
    }

    public ListaFavoritos consultarPorId(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

    public boolean excluir(Integer id) {
        try {
            repository.deleteById(id);
        } catch (Exception e){
            log.info("Erro ao realizar Exclusão: " , e);
            return false;
        }
        return true;
    }


}
