package com.mairanath.iesp.iespflix.repository;

import com.mairanath.iesp.iespflix.model.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Integer> {
}
