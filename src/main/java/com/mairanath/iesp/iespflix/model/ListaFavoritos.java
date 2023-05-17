package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_lfavoritos")
public class ListaFavoritos {
    @Id
    @GeneratedValue
    private String id;

    @ManyToOne
    private Usuario usuario;




}
