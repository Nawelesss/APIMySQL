package com.algaworks.algalog.algalogapi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algalog.algalogapi.exception.negocioException;
import com.algaworks.algalog.algalogapi.model.Cliente;
import com.algaworks.algalog.algalogapi.repository.ClienteRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class CatalogoClienteService {
    private ClienteRepository clienteRepository;

    public Cliente buscar(Long clienteId){
        return
    }

    @Transactional
    public Cliente salvar(Cliente cliente){
        boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail())
                .stream()
                .anyMatch(clienteExistente -> !clienteExistente.equals(cliente));
                if(emailEmUso){
                    throw new negocioException("Já existe um cliente cadastrado com esse e-mail.");
                }


        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir(Long id){
        clienteRepository.deleteById(id);
    }

}
