package com.maksud.spring_boot.project.city.controller.Passport;

import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.service.passport.PassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PassportControllerImpl implements PassportController{
   private final PassportService passportService;
    @Override
    @GetMapping("/passport/{id}")
    public Passport getPassport(@PathVariable Long id) {
        return passportService.getPassport(id);
    }

    @Override
    @DeleteMapping("/delete/passport") // доработать
    public Boolean deletePassport(@RequestBody Passport passport) {
        return passportService.deletePassport(passport);
    }

    @Override
    @GetMapping("/passports")
    public List<Passport> getPassports() {
        return passportService.getPassports();
    }
}
