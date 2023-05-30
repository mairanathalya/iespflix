package com.mairanath.iesp.iespflix.repository;

import com.mairanath.iesp.iespflix.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer> {

}
