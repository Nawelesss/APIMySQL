package com.algaworks.algalog.algalogapi.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Destinatario {
    private String nome;
    private String logadouro;
    private String complemento;
    private String bairro;
}
