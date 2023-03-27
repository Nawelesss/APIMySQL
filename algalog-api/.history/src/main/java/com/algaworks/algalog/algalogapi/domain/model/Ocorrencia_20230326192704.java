package com.algaworks.algalog.algalogapi.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Ocorrencia {

    @EqualsAndHashCode.Include
    @Id
    private Long id;
    private Entrega entrega;
    private String descricao;
    private OffsetDateTime registro;
}
