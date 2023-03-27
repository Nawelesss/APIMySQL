package com.algaworks.algalog.algalogapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cliente {
    @Id
    @Generated
    private Long id;
    private String nome;
    private String email;
    private int telefone;
    
}
