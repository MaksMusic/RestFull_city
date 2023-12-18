package com.maksud.spring_boot.project.city.service.citizen;

import com.maksud.spring_boot.project.city.Dto.CitizenResponse;
import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.model.Home;
import com.maksud.spring_boot.project.city.model.Passport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MokCitizenServiceImpl implements CitizenService{

    @Override
    public List<Citizen> getAllUser() {
        return null;
    }

    @Override
    public Citizen createUser(Citizen citysen) {
        return null;
    }

    @Override
    public boolean deleteCitizen(Citizen citizen) {
        return false;
    }

    @Override
    public Citizen getCitizenById(Long id) {
        return null;
    }

    @Override
    public boolean deleteCitizenById(Long id) {
        return false;
    }

    @Override
    public Passport getPassport(Long userId) {
        return null;
    }

    @Override
    public List<Citizen> getCitizensByStreet(String street) {
        return null;
    }

    @Override
    public void putHomesById(Home home) {

    }
}
