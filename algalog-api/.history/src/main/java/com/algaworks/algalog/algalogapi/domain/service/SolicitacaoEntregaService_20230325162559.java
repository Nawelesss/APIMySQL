package com.algaworks.algalog.algalogapi.domain.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algalog.algalogapi.domain.exception.negocioException;
import com.algaworks.algalog.algalogapi.domain.model.Cliente;
import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import com.algaworks.algalog.algalogapi.domain.model.StatusEntrega;
import com.algaworks.algalog.algalogapi.domain.repository.ClienteRepository;
import com.algaworks.algalog.algalogapi.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {
    private CatalogoClienteService catalogoClienteService;
    private EntregaRepository entregaRepository;

    @Transactional
    public Entrega solicitar(Entrega entrega){
       Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId()); 
        entrega.setCliente(cliente);
        entrega.setStatus(StatusEntrega.PENDENTE);
        entrega.setDataPedido(LocalDateTime.now());

        return entregaRepository.save(entrega);
    }
    
}
