package com.maksud.spring_boot.project.city.controller.passportServise;

import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.service.passportService.PassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class PassportControllerImpl implements PassportController{
   private final PassportService passportService;
    @Override

    public Passport getPassport(@PathVariable Long id) {
        return passportService.getPassport(id);
    }
}
