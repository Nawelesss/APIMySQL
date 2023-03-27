package com.algaworks.algalog.algalogapi.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import com.algaworks.algalog.algalogapi.model.EntregaModel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EntregaMapper {
    private ModelMapper modelMapper;
    
    public EntregaModel toModel(Entrega entrega){
        return modelMapper.map()
    }
}
