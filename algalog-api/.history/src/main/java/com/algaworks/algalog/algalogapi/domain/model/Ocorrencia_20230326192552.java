package com.algaworks.algalog.algalogapi.domain.model;

import java.time.OffsetDateTime;
@Getter
public class Ocorrencia {
    private Long id;
    private Entrega entrega;
    private String descricao;
    private OffsetDateTime registro;
}
