package com.maksud.spring_boot.project.city.service.passportService;

import com.maksud.spring_boot.project.city.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportService  {

    Passport getPassport(Long id);

    Passport cretePassport();
}
