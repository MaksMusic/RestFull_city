package com.maksud.spring_boot.project.city.service.citizen;

import com.maksud.spring_boot.project.city.Dto.CitizenResponse;
import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.model.Home;
import com.maksud.spring_boot.project.city.model.Passport;

import java.util.List;

public interface CitizenService {


    List<Citizen> getAllUser();
    Citizen createUser(Citizen citysen);

    boolean deleteCitizen(Citizen citizen);
    Citizen getCitizenById(Long id);
    boolean deleteCitizenById(Long id);
     Passport getPassport(Long userId);
    public List<Citizen> getCitizensByStreet(String street);

    void putHomesById(Home home);
}
