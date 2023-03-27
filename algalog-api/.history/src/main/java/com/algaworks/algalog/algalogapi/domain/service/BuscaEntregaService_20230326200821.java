package com.algaworks.algalog.algalogapi.domain.service;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.algalogapi.domain.exception.negocioException;
import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import com.algaworks.algalog.algalogapi.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
    private EntregaRepository entregaRepository;

    public Entrega buscar(Long entregaId){
        return entregaRepository.findById(entregaId)
        .orElseThrow(() -> new negocioException("entrega não encontrada"));
    }
    }
}
}
