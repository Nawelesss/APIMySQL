package com.algaworks.algalog.algalogapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algalog.algalogapi.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeContaining(String nome);
    
}
