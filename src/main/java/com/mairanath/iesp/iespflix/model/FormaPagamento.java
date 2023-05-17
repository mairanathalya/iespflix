package com.mairanath.iesp.iespflix.model;

import com.mairanath.iesp.iespflix.enumeration.ChavePix;
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

    @Column(name = "dsd_cartao", length =500)
    private Integer cartao;
    private Integer numCartao;
    private Integer validadeCartao;
    private Integer codigoSeguranca;
    private String nomeTitularCartao;

    @Enumerated
    private ChavePix pix;

    private Integer cartaoPrePago;
    private Integer parceiros;


}
