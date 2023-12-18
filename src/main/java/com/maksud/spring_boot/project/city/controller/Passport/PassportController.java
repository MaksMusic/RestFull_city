package com.maksud.spring_boot.project.city.controller.Passport;

import com.maksud.spring_boot.project.city.model.Passport;

import java.util.List;



public interface PassportController {


      Passport getPassport(Long id);
     Boolean deletePassport(Passport passport);
     List<Passport> getPassports();
}
