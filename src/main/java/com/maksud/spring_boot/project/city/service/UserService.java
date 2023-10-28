package com.maksud.spring_boot.project.city.service;

import com.maksud.spring_boot.project.city.model.Citizen;

import java.util.List;

public interface UserService {


    List<Citizen> getAllUser();



    Citizen createUser(Citizen citysen);
}
