package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="tb_filme")
public class Filme {
    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    private Integer ano;
    private Long duracao;

    @Column(name= "ds_sinopse", length = 500)
    private String sinopse;
    private String genero;
    private boolean relevancia;
    private Integer trailer;

}
