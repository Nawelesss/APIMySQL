package com.algaworks.algalog.algalogapi.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaModel {
    private long id;
    private String nomeCliente;
    private BigDecimal taxa;
    
}
