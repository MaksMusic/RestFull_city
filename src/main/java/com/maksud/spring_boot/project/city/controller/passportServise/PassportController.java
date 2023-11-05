package com.maksud.spring_boot.project.city.controller.passportServise;

import com.maksud.spring_boot.project.city.model.Passport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api")
public interface PassportController {

    @GetMapping("/passport/{id}")
      Passport getPassport(Long id);
}
