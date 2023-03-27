package com.algaworks.algalog.algalogapi.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algalog.algalogapi.model.Entrega;
import com.algaworks.algalog.algalogapi.model.StatusEntrega;
import com.algaworks.algalog.algalogapi.repository.ClienteRepository;
import com.algaworks.algalog.algalogapi.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {
    private Cliente
    private EntregaRepository entregaRepository;

    @Transactional
    public Entrega solicitar(Entrega entrega){
        ClienteRepository

        entrega.setStatus(StatusEntrega.PENDENTE);
        entrega.setDataPedido(LocalDateTime.now());

        return entregaRepository.save(entrega);
    }
    
}
