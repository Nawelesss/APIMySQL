package com.algaworks.algalog.algalogapi.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private int telefone;
    
}
