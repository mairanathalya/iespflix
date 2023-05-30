package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_lfavoritos")
public class ListaFavoritos implements Serializable {
    @Id
    @GeneratedValue
    private String id;

    @ManyToOne
    private Usuario usuario;
    private Filme filme;




}
