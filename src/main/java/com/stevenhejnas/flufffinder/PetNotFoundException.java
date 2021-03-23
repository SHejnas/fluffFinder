package com.stevenhejnas.flufffinder;

public class PetNotFoundException extends RuntimeException{
    public PetNotFoundException(Integer id) {
        super("Could not find pet: " + id);
    }
}
