package com.algaworks.algalog.algalogapi.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaInput {
    @Valid
    private ClienteIdInput cliente;
    private DestinatarioInput destinatario;
}
