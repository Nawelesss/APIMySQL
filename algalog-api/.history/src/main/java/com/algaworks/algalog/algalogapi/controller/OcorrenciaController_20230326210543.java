package com.algaworks.algalog.algalogapi.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.algalogapi.Mapper.OcorrenciaMapper;
import com.algaworks.algalog.algalogapi.domain.model.Ocorrencia;
import com.algaworks.algalog.algalogapi.domain.service.ResgistroOcorrenciaService;
import com.algaworks.algalog.algalogapi.model.OcorrenciaModel;
import com.algaworks.algalog.algalogapi.model.input.OcorrenciaInput;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas/{entregaId}/ocorrencias")
public class OcorrenciaController {

    private OcorrenciaMapper ocorrenciaMapper;
    private ResgistroOcorrenciaService registroOcorrenciaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OcorrenciaModel registrar(@PathVariable Long entregaId,
   @Valid @RequestBody OcorrenciaInput ocorrenciaInput){

   Ocorrencia ocorrenciaRegistrada = registroOcorrenciaService
                        .registrar(entregaId, ocorrenciaInput.getDescricao());

                        return ocorrenciaMapper.toModel(ocorrenciaRegistrada);

   }

   public List<OcorrenciaModel> listar(@PathVariable)
}
