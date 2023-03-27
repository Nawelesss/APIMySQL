package com.algaworks.algalog.algalogapi.domain.model;

import java.time.OffsetDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ocorrencia {
    
    @EqualsAndHashCode.Include
    private Long id;
    private Entrega entrega;
    private String descricao;
    private OffsetDateTime registro;
}
