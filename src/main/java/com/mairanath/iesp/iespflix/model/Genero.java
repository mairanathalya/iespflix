package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String comedia;
    private String romance;
    private String terror;

}
