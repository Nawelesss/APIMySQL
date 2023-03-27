package com.algaworks.algalog.algalogapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.algalogapi.model.Cliente;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List <Cliente> listar(){
        return "teste"; 
    }
}
