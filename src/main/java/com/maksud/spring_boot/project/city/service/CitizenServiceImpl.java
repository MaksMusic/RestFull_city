package com.maksud.spring_boot.project.city.service;

import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.repozitory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CitizenServiceImpl implements CitizenService {
    private final UserRepository userRepository;
    private final PassportService passportService;



    @Override
    public List<Citizen> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Citizen createUser(Citizen citzsen) {
        citzsen.setPassport(passportService.cretePassport());
        return userRepository.save(citzsen);
    }


    @Override
    public boolean deleteCitizen(Citizen citizen) {
        if (citizen.getId() != 1){
            userRepository.delete(citizen);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Citizen getCitizenById(Long id) {
       return userRepository.findById(id).get();
    }

    @Override
    public boolean deleteCitizenById(Long id) {
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public Passport getPassword(Long id){
        return userRepository.getReferenceById(id).getPassport();
    }
}
