package com.algaworks.algalog.algalogapi.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        return clienteRepository.findAll();
    }
    @GetMapping("/clientes/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId){
        Optional<Cliente> cliente = clienteRepository.findById(clienteId);
        
        if(cliente.isPresent()){
            return ResponseEntity
        }
    }
  

}
