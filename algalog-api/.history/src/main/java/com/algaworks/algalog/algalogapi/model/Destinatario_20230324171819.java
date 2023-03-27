package com.algaworks.algalog.algalogapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Destinatario {
    @Column(name= "destinatario_nome")
    private String nome;
    
    private String logadouro;
    private String complemento;
    private String bairro;
}
