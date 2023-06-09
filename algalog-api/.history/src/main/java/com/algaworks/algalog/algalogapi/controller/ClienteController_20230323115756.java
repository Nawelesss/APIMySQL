package com.algaworks.algalog.algalogapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.algalogapi.model.Cliente;
import com.algaworks.algalog.algalogapi.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    
  

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long id){
        return clienteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id,@RequestBody Cliente cliente){
        if(!clienteRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        cliente.setId(id);
       cliente = clienteRepository.save(cliente);

       return ResponseEntity.ok(cliente);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPorId(Long id){

        if(!clienteRepository.existsById(id){
            return ResponseEntity
        })
        return ResponseEntity.noContent().build();
    }
  

}
