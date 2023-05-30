package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Cartao {


    @NotEmpty
    private Integer numCartao;
    @NotEmpty
    private Integer validadeCartao;
    @NotEmpty
    private Integer codigoSeguranca;
    @NotEmpty
    private String nomeTitularCartao;
}
