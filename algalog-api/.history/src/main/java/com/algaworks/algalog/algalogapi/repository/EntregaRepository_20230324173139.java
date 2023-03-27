package com.algaworks.algalog.algalogapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algalog.algalogapi.model.entrega;

@Repository
public interface EntregaRepository extends JpaRepository<entrega, Long>{
    
}
