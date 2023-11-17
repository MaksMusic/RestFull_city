package com.maksud.spring_boot.project.city.service.passportService;

import com.maksud.spring_boot.project.city.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PassportService  {

    Passport getPassport(Long id);

    Passport cretePassport();
     Boolean deletePassport(Passport passport);

     List<Passport> getPassports();
}
