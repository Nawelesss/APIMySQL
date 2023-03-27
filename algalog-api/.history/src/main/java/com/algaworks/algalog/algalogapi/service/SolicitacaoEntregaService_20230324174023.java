package com.algaworks.algalog.algalogapi.service;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.algalogapi.model.Entrega;
import com.algaworks.algalog.algalogapi.model.StatusEntrega;
import com.algaworks.algalog.algalogapi.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {
    private EntregaRepository entregaRepository;

    public Entrega solicitar(Entrega entrega){
        entrega.setStatus(StatusEntrega.PENDENTE);
        return entregaRepository.save(entrega);
    }
    
}
