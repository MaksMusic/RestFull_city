package com.maksud.spring_boot.project.city.service.citizenService;

import com.maksud.spring_boot.project.city.model.Auto;
import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.repozitory.CitizenRepository;
import com.maksud.spring_boot.project.city.service.passportService.PassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CitizenServiceImpl implements CitizenService {
    private final CitizenRepository citizenRepository;
    private final PassportService passportService;



    @Override
    public List<Citizen> getAllUser() {
        return citizenRepository.findAll();
    }

    @Override
    public Citizen createUser(Citizen citzsen) {
        citzsen.setPassport(passportService.cretePassport());
        return citizenRepository.save(citzsen);
    }


    @Override
    public boolean deleteCitizen(Citizen citizen) {
        if (citizen.getId() != 1){
            citizenRepository.delete(citizen);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Citizen getCitizenById(Long id) {
       return citizenRepository.findById(id).get();
    }

    @Override
    public boolean deleteCitizenById(Long id) {
        citizenRepository.deleteById(id);
        return true;
    }

    @Override
    public Passport getPassport(Long id){
        return citizenRepository
                .findById(id)
                .orElseThrow(()->new RuntimeException("passport is not found"))
                .getPassport();
    }


}
