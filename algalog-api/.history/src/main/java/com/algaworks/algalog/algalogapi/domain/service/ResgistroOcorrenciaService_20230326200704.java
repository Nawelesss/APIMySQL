package com.algaworks.algalog.algalogapi.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algalog.algalogapi.domain.exception.negocioException;
import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import com.algaworks.algalog.algalogapi.domain.model.Ocorrencia;
import com.algaworks.algalog.algalogapi.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ResgistroOcorrenciaService {
        private BuscaEntregaService buscaEntregaService;

        @Transactional
        public Ocorrencia registrar(Long entregaId,String descricao){
            Entrega entrega = entregaRepository.findById(entregaId)
            .orElseThrow(() -> new negocioException("entrega não encontrada"));

           return entrega.adicionarOcorrencia(descricao);
        }
}
