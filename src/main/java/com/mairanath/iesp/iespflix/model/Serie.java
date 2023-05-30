package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_serie")
public class Serie implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty
    private String titulo;
    @NotEmpty
    private Integer ano;
    @NotEmpty
    private Long duracao;

    @Column(name= "ds_sinopse", length = 500)
    private String sinopse;

    private boolean relevancia;
    private Integer trailer;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;
}
