package com.algaworks.algalog.algalogapi.service;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.algalogapi.repository.ClienteRepository;

@Service
public class CatalogoClienteService {
    private ClienteRepository clienteRepository;
    
    public Cliente salvar(Cliente cliente);

}
