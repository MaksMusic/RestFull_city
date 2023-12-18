package com.maksud.spring_boot.project.city.service.citizen;

import com.maksud.spring_boot.project.city.Dto.AutoDto;
import com.maksud.spring_boot.project.city.Dto.CitizenResponse;
import com.maksud.spring_boot.project.city.Dto.HomeDto;
import com.maksud.spring_boot.project.city.exception.CitizenNotFoundException;
import com.maksud.spring_boot.project.city.mapper.AutoMapper;
import com.maksud.spring_boot.project.city.mapper.CitizenMapper;
import com.maksud.spring_boot.project.city.mapper.HomeMapper;
import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.model.Home;
import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.repozitory.CitizenRepository;
import com.maksud.spring_boot.project.city.service.passport.PassportService;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary

public class CitizenServiceImpl implements CitizenService {
    private  CitizenRepository citizenRepository;
    private  PassportService passportService;

    private AutoMapper autoMapper;
    private HomeMapper homeMapper;
    private CitizenMapper citizenMapper;

//    public CitizenServiceImpl(CitizenRepository citizenRepository,@Lazy PassportService passportService) {
//        this.citizenRepository = citizenRepository;
//        this.passportService = passportService;
//    }


    public CitizenServiceImpl(CitizenRepository citizenRepository, PassportService passportService, AutoMapper autoMapper, HomeMapper homeMapper, CitizenMapper citizenMapper) {
        this.citizenRepository = citizenRepository;
        this.passportService = passportService;
        this.autoMapper = autoMapper;
        this.homeMapper = homeMapper;
        this.citizenMapper = citizenMapper;
    }

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
       return citizenRepository.findById(id).orElseThrow(()->new CitizenNotFoundException("не найден житель  по id:" + id));
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

    @Override
    public List<Citizen> getCitizensByStreet(String street) {
        return citizenRepository.findCitizensByStreet(street);
    }

    @Override
    public void putHomesById(Home home) {
        List<Long> listId = home.getCityzens().stream()
                .map(citizen -> citizen.getId())
                .toList();
    }
}
