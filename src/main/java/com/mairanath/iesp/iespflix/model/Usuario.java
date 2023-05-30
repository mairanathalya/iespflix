package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="tb_usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty
    private String nome;

    @Column(name = "ds_detalhesUsuario")
    private Integer dataNascimento;
    @Email @NotEmpty
    private String email;
    @NotEmpty
    private String senha;
    @NotEmpty
    private String confirmarSenha;
    @CPF
    private String cpf;


}
