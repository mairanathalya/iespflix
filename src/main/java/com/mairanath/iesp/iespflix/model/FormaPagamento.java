package com.mairanath.iesp.iespflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_formapagamento")
public class FormaPagamento {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "ds_cartao", length =500)
    private Integer cartao;
    private Integer numCartao;
    private Integer validadeCartao;
    private Integer codigoSeguranca;
    private String nomeTitularCartao;

    @Column(name = "ds_pix", length = 500)
    private Integer pix;
    private String cpf;
    private Integer telefone;
    private String email;
    private String chaveAleatoria;

    private Integer cartaoPrePago;
    private Integer parceiros;


}
