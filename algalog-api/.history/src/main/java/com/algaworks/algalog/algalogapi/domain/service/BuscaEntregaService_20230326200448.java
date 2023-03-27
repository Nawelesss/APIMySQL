package com.algaworks.algalog.algalogapi.domain.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
    

    public Entrega buscar(Long entregaId){
        return entregaRepository.findById(entregaId)
        .orElseThrow(() -> new negocioException("entrega não encontrada"));
    }
    }
}
