package com.maksud.spring_boot.project.city.controller.Citizen;

import com.maksud.spring_boot.project.city.Dto.CitizenResponse;
import com.maksud.spring_boot.project.city.mapper.CitizenMapper;
import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.service.citizen.CitizenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CitizenControllerImpl implements CitizenController {
    private CitizenService citizenService;
    private CitizenMapper citizenMapper;

    public CitizenControllerImpl(CitizenService citizenService, CitizenMapper citizenMapper) {
        this.citizenService = citizenService;
        this.citizenMapper = citizenMapper;
    }

    @Override
    @GetMapping("/users")
    public List<CitizenResponse> getAllUser() {
        // return citizenService.getAllUser();
        return citizenMapper.citizenToCitizenResponse(citizenService.getAllUser());
//        return citizenRepository.findAll().stream()
//                .map(citizen-> CitizenResponse.builder()
//                        .id(citizen.getId())
//                        .name(citizen.getName())
//                        .passport(citizen.getPassport())
//                        .autos(autoMapper.listAutoToListAutoDto(citizen.getAutos()))
//                        .homes(homeMapper.listHomeToListHomeDto(citizen.getHomes()))
//                        .build())
//                .toList();

    }

    @Override
    @GetMapping("/users/{id}")
    public Citizen getCitizenById(@PathVariable("id") Long id) {
        return citizenService.getCitizenById(id);
    }

    //в данном методе была проблема -> отсутствовала анотация RequestBody
    @Override
    @PostMapping("/create")
    public Citizen createUser(@RequestBody Citizen citizen) {
        return citizenService.createUser(citizen);
    }

    @Override
    @DeleteMapping("/delete")
    public boolean deleteCitizen(@RequestBody Citizen citizen) {
        return citizenService.deleteCitizen(citizen);
    }

    @Override
    @GetMapping("/users/home/{street}")
    public List<CitizenResponse> getUsersByStreet(@PathVariable String street) {
        return citizenMapper.citizenToCitizenResponse(citizenService.getCitizensByStreet(street));
    }

    @Override
    @GetMapping("/users/{id}/passport")
    public Passport getPassport(@PathVariable Long id) {
        //return getCitizenById(id).getPassport();
        return citizenService.getPassport(id); //но нужна проверка orElse но тут ее прописать же нельзя
    }

    @Override
    @DeleteMapping("/deleteById/{id}")
    public boolean deleteCitizenById(@PathVariable Long id) {
        return citizenService.deleteCitizenById(id);
    }


    //    @Override
//    @GetMapping("/users")
//    public Citizen getCitizenById(@PathVariable("userId") Long userI) {
//        return userService.getCitizenById(id);
//    }


}