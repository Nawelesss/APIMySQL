package com.algaworks.algalog.algalogapi.service;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.algalogapi.model.Cliente;
import com.algaworks.algalog.algalogapi.repository.ClienteRepository;

@Service
public class CatalogoClienteService {
    private ClienteRepository clienteRepository;
    @Transaction
    public Cliente salvar(Cliente cliente){
        
    }

}
