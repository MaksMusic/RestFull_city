package com.maksud.spring_boot.project.city.controller;

import com.maksud.spring_boot.project.city.model.Citizen;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@RequestMapping("/api")
public interface CitizenController {


    @GetMapping("/users")
    List<Citizen> getAllUser();


    @PostMapping("/create")
    Citizen createUser(Citizen citizen);




    @DeleteMapping("/delete")
    boolean deleteCitizen(Citizen citizen);


    @GetMapping("/user/{id}")
    Citizen getCitizenById(Long id);


}
