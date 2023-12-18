package com.maksud.spring_boot.project.city.exceptionHandler;

import com.maksud.spring_boot.project.city.exception.CitizenNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CitizenExceptionHandler {
    @ExceptionHandler(CitizenNotFoundException.class)
    public ResponseEntity<String> handlerCitizenNotFound(CitizenNotFoundException citizenNotFoundException) {
        return ResponseEntity.status(500).body(citizenNotFoundException.getMessage());
    }
}
