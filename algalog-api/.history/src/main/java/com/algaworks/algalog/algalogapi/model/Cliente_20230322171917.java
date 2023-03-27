package com.algaworks.algalog.algalogapi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name =)
public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private int telefone;
    
}
