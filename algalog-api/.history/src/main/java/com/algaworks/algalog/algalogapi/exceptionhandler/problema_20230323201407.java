package com.algaworks.algalog.algalogapi.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Problema {
    private Integer status;
    private LocalDateTime dataHora;
    private String titulo;
    private List<Campo> campos;
    
    public static class Campo{
        private String nome;
        private String mensagem;
    }
}