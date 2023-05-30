package com.mairanath.iesp.iespflix.model;

import com.mairanath.iesp.iespflix.enumeration.ChavePix;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "tb_formapagamento")
public class FormaPagamento  {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "dsd_cartao", length =500)
    @Embedded
    private Cartao cartao;

    @Enumerated @NotEmpty
    private ChavePix pix;
    private Integer cartaoPrePago;
    private Integer parceiros;


}
