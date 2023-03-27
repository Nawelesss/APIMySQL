package com.algaworks.algalog.algalogapi.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import com.algaworks.algalog.algalogapi.domain.model.Ocorrencia;


import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ResgistroOcorrenciaService {
        private BuscaEntregaService buscaEntregaService;

        @Transactional
        public Ocorrencia registrar(Long entregaId,String descricao){
            Entrega entrega = buscaEntregaService.buscar(entregaId);

           return entrega.adicionarOcorrencia(descricao);
        }
}
