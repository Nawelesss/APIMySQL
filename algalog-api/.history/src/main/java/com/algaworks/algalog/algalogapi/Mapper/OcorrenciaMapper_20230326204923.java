package com.algaworks.algalog.algalogapi.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.algaworks.algalog.algalogapi.model.OcorrenciaModel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class OcorrenciaMapper {
    
    private ModelMapper modelMapper;

    public OcorrenciaModel toModel()

}
