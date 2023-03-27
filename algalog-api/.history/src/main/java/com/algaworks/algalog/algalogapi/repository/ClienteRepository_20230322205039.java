package com.algaworks.algalog.algalogapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algalog.algalogapi.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
