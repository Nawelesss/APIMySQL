package com.algaworks.algalog.algalogapi.model;

import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@EqualsAndHashCode
public class entrega {
    private Long id;
    private Cliente cliente;
    private Destinatario Destinatario;
    private BigDecimal taxa;
    private StatusEntrega status;
    private LocalDateTime dataPedido;
    private localDateTime dataFinalizacao;

}
