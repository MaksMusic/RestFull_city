package com.maksud.spring_boot.project.city.controller.passportServise;

import com.maksud.spring_boot.project.city.model.Passport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



public interface PassportController {


      Passport getPassport(Long id);
     Boolean deletePassport(Passport passport);
     List<Passport> getPassports();
}
