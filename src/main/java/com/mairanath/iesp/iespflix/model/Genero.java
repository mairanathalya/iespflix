package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Genero implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    private String titulo;

    @OneToMany
    private List<Filme> filme;
}
