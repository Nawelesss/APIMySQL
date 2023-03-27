package com.algaworks.algalog.algalogapi.model.input;

import javax.validation.Valid;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaInput {
    @Valid
    @Notnull
    private ClienteIdInput cliente;
    private DestinatarioInput destinatario;
}
