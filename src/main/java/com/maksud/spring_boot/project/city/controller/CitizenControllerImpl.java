package com.maksud.spring_boot.project.city.controller;

import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class CitizenControllerImpl implements CitizenController {

    private final UserService userService;

    @Override
    public List<Citizen> getAllUser() {
        return userService.getAllUser();
    }


    //в данном методе была проблема  -> отсутствовала анотация RequestBody
    @Override
    public Citizen createUser(@RequestBody Citizen citysen) {
        return userService.createUser(citysen);
    }
}
