package com.algaworks.algalog.algalogapi.model;

import java.time.OffsetDateTime;

import lombok.Getter;
@Getter
@Setter
public class OcorrenciaModel {
    private Long id;
    private String descricao;
    private OffsetDateTime dataRegistro;
}
