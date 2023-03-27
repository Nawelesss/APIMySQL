package com.algaworks.algalog.algalogapi.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.algaworks.algalog.algalogapi.domain.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaModel {
    private long id;
    private String nomeCliente;
    private BigDecimal taxa;
    private StatusEntrega status;
    private OffsetDateTime dataPedido;
    private OffsetDateTime dataPedido;
}
