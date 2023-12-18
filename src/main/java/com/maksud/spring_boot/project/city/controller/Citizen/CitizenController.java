package com.maksud.spring_boot.project.city.controller.Citizen;

import com.maksud.spring_boot.project.city.Dto.CitizenResponse;
import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.model.Passport;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
public interface CitizenController {

    List<CitizenResponse> getAllUser();

    Citizen createUser(Citizen citizen);
    boolean deleteCitizen(Citizen citizen);

    boolean deleteCitizenById(Long id);

    Citizen getCitizenById(Long id);

    Passport getPassport(Long id);
    List<CitizenResponse> getUsersByStreet(@PathVariable String street) ;


}
