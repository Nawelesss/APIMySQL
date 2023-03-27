package com.algaworks.algalog.algalogapi.domain.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
    public Entrega buscar(Long entregaId){
        Entrega entrega = entregaRepository.findById(entregaId)
        .orElseThrow(() -> new negocioException("entrega não encontrada"));

       return entrega.adicionarOcorrencia(descricao);
    }
    }
}
