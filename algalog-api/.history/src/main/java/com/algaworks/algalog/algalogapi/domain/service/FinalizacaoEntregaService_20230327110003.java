package com.algaworks.algalog.algalogapi.domain.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {

    @Tran
    public void finalizar(Long entregaId){

    }
}
