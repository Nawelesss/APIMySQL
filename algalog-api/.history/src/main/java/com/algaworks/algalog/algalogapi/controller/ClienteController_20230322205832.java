package com.algaworks.algalog.algalogapi.controller;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.algalogapi.model.Cliente;
import com.algaworks.algalog.algalogapi.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    
  

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        return clienteRepository.findByNomeContaining("joão");
    }
    
}
