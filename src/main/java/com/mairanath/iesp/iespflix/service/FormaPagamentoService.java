package com.mairanath.iesp.iespflix.service;

import com.mairanath.iesp.iespflix.model.FormaPagamento;
import com.mairanath.iesp.iespflix.repository.FormaPagamentoRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class FormaPagamentoService {
    @Autowired
    private FormaPagamentoRepository repository;

    public FormaPagamento salvar(FormaPagamento formaPagamento){
        return repository.save(formaPagamento);
    }
    public FormaPagamento alterar( FormaPagamento formaPagamento){
        if(Objects.nonNull(formaPagamento.getId())){
            formaPagamento = repository.save(formaPagamento);
        }else {
            throw new NotFoundException();
        }
        return formaPagamento;
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
    public FormaPagamento consultarPorId(Integer id){
        return (FormaPagamento) repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
