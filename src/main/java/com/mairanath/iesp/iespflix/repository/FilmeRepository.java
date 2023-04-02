package com.mairanath.iesp.iespflix.repository;

import com.mairanath.iesp.iespflix.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {

}
