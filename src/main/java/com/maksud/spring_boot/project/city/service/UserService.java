package com.maksud.spring_boot.project.city.service;

import com.maksud.spring_boot.project.city.model.Citizen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface UserService {


    List<Citizen> getAllUser();
    Citizen createUser(Citizen citysen);

    boolean deleteCitizen(Citizen citizen);
    Citizen getCitizenById(Long id);


}
