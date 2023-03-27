package com.algaworks.algalog.algalogapi.domain.exception;

public class negocioException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public negocioException(String message){
        super(message);
    }
}
