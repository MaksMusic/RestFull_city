package com.maksud.spring_boot.project.city.service.passport;

import com.maksud.spring_boot.project.city.model.Passport;

import java.util.List;

public interface PassportService  {

    Passport getPassport(Long id);

    Passport cretePassport();
     Boolean deletePassport(Passport passport);

     List<Passport> getPassports();
}
