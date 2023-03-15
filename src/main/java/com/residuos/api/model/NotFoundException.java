package com.residuos.api.model;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
