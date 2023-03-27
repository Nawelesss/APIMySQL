package com.algaworks.algalog.algalogapi.model.input;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinatarioInput {
    @NotBlank
    private String nome;

    @NotBlank
    @Column(name= "destinatario_logadouro")
    private String logadouro;

    @NotBlank
    @Column(name= "destinatario_numero")
    private String numero;

    @NotBlank
    @Column(name= "destinatario_complemento")
    private String complemento;

    @NotBlank
    @Column(name= "destinatario_bairro")
    private String bairro;
}
