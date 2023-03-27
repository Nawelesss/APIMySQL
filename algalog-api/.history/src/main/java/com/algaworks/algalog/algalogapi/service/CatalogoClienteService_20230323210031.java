package com.algaworks.algalog.algalogapi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algalog.algalogapi.model.Cliente;
import com.algaworks.algalog.algalogapi.repository.ClienteRepository;

@Service
public class CatalogoClienteService {
    private ClienteRepository clienteRepository;

    @Transactional
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    

}
