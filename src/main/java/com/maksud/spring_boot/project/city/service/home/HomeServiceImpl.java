package com.maksud.spring_boot.project.city.service.home;

import com.maksud.spring_boot.project.city.model.Home;
import com.maksud.spring_boot.project.city.repozitory.HomeRepository;
import com.maksud.spring_boot.project.city.service.citizen.CitizenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HomeServiceImpl implements HomeService{
    private HomeRepository homeRepository;
    private CitizenService service;
    @Override
    public Home createHome(Home home) {
       Home createdHome =  homeRepository.save(home);
       service.putHomesById(home);
       return home;
    }






    @Override
    public List<Home> getHomelist() {
        return homeRepository.findAll();
    }
}
