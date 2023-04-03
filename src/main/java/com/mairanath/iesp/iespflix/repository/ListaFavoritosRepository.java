package com.mairanath.iesp.iespflix.repository;

import com.mairanath.iesp.iespflix.model.ListaFavoritos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaFavoritosRepository extends JpaRepository<ListaFavoritos, Integer> {
}
