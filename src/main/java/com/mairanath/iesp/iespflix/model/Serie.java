package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_serie")
public class Serie {
    @Id
    @GeneratedValue
    private Integer id;
}
