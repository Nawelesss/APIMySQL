package com.algaworks.algalog.algalogapi.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.algalogapi.model.Cliente;

@RestController
public class ClienteController {
    
    @persistence
    private EntityManager manager;
    
}
