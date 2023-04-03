package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;

    @Column(name = "ds_detalhesUsuario")
    private Integer dataNascimento;
    private String email;
    private String senha;
    private String confirmarSenha;
    private String cpf;


}
