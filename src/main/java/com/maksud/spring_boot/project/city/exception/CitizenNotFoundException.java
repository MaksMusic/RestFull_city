package com.maksud.spring_boot.project.city.exception;

public class CitizenNotFoundException extends RuntimeException{
    public CitizenNotFoundException(String message) {
        super(message);
    }
}
