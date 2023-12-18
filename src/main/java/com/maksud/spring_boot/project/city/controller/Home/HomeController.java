package com.maksud.spring_boot.project.city.controller.Home;

import com.maksud.spring_boot.project.city.model.Home;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface HomeController {
     Home addHome(@RequestBody Home home);
     List<Home> getHomeList();
}
