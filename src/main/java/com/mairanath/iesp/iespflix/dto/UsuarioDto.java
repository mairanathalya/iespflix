package com.mairanath.iesp.iespflix.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsuarioDto {
    private int idade;
    private String nome;
    @Email @NotEmpty
    private String email;

    private String sobrenome;

}
