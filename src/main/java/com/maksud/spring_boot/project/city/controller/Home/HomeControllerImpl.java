package com.maksud.spring_boot.project.city.controller.Home;

import com.maksud.spring_boot.project.city.model.Home;
import com.maksud.spring_boot.project.city.service.home.HomeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor

public class HomeControllerImpl implements HomeController{
    private HomeService homeService;


    @PostMapping("/homes/create")
    public Home addHome(@RequestBody Home home){
        return homeService.createHome(home);
    }

    @GetMapping("/homes")
    public List<Home> getHomeList(){
        return homeService.getHomelist();
    }
}
