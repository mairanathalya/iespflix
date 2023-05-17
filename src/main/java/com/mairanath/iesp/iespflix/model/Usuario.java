package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

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
    @Email @NotEmpty
    private String email;
    private String senha;
    private String confirmarSenha;
    @CPF
    private String cpf;


}
