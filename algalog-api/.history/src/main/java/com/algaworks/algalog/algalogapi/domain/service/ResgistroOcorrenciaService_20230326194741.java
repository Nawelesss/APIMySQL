package com.algaworks.algalog.algalogapi.domain.service;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import com.algaworks.algalog.algalogapi.domain.model.Ocorrencia;
import com.algaworks.algalog.algalogapi.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ResgistroOcorrenciaService {
        private EntregaRepository entregaRepository;

        public Ocorrencia registrar(Long entregaId,String descricao){
            Entrega entrega = entregaRepository.findById(entregaId)
            .orElseThrow()
        }
}
