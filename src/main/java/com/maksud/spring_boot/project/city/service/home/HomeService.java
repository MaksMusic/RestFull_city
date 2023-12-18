package com.maksud.spring_boot.project.city.service.home;

import com.maksud.spring_boot.project.city.Dto.HomeDto;
import com.maksud.spring_boot.project.city.model.Home;

import java.util.List;

public interface HomeService {

    Home createHome(Home home);

    List<Home> getHomelist();

}
