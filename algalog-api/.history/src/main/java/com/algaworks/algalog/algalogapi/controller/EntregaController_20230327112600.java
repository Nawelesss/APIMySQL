package com.algaworks.algalog.algalogapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.algalogapi.Mapper.EntregaMapper;
import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import com.algaworks.algalog.algalogapi.domain.repository.EntregaRepository;
import com.algaworks.algalog.algalogapi.domain.service.SolicitacaoEntregaService;
import com.algaworks.algalog.algalogapi.model.EntregaModel;
import com.algaworks.algalog.algalogapi.model.input.EntregaInput;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas")
public class EntregaController {

    private EntregaMapper entregaMapper;
    private EntregaRepository entregaRepository;
    private SolicitacaoEntregaService solicitacaoEntregaService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EntregaModel solicitar(@Valid @RequestBody EntregaInput entregaInput){
        Entrega novaEntrega = entregaMapper.toEntity(entregaInput);
        Entrega entregaSolicitada = solicitacaoEntregaService.solicitar(novaEntrega);
        
        return entregaMapper.toModel(entregaSolicitada);
    }

    @PutMapping("/{entregaId}/finalizacao")
    public void finalizar(@PathVariable Long entregaId){

    }

    @GetMapping
    public List<EntregaModel> listar(){
        return entregaMapper.toCollectionModel(entregaRepository.findAll());
    }

    @GetMapping("/{entregaId}")
    public ResponseEntity<EntregaModel> buscar(@PathVariable Long entregaId){
        return entregaRepository.findById(entregaId)
                        .map(entrega -> ResponseEntity.ok(entregaMapper.toModel(entrega)))
                        .orElse(ResponseEntity.notFound().build());
    }

}
