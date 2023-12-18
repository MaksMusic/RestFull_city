package com.maksud.spring_boot.project.city.service.passport;

import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.repozitory.PassportRepository;
import com.maksud.spring_boot.project.city.service.citizen.CitizenService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
@AllArgsConstructor
public class PassportServiceImpl implements PassportService{
    private  PassportRepository passportRepository;

    //private  CitizenService citizenService;

    @Override
    public Passport getPassport(Long id) {
        return passportRepository
                .findById(id)
                .orElseThrow( ()-> new RuntimeException("not fount passport"));
    }

    @Override
    public Passport cretePassport() {
       return passportRepository.save(
               Passport.builder()
                       .number(getNumber(99))
                       .serial(getNumber(9999))
                       .build()
       );
    }

    private static int getNumber(int countNum ) {
        return (new Random().nextInt(countNum) + 100) + (new Random().nextInt(countNum) + 100);
    }

    @Override
    public Boolean deletePassport(Passport passport) {
         passportRepository.delete(passport);
         return true;
    }

    @Override
    public List<Passport> getPassports() {
        return passportRepository.findAll();
    }
}

