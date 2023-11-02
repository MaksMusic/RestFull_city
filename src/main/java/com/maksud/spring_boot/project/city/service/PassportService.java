package com.maksud.spring_boot.project.city.service;

import com.maksud.spring_boot.project.city.model.Passport;

public interface PassportService {

    Passport getPassport(Long id);

    Passport cretePassport();
}
