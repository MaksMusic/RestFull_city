package com.maksud.spring_boot.project.city.service;

import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.model.Passport;

import java.util.List;

public interface CitizenService {


    List<Citizen> getAllUser();
    Citizen createUser(Citizen citysen);

    boolean deleteCitizen(Citizen citizen);
    Citizen getCitizenById(Long id);
    boolean deleteCitizenById(Long id);
     Passport getPassword(Long userId);
}
