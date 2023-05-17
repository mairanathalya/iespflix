package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Genero {
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    private String descricao;

}
