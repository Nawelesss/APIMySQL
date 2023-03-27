package com.algaworks.algalog.algalogapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Destinatario {
    @Column()
    private String nome;
    private String logadouro;
    private String complemento;
    private String bairro;
}
