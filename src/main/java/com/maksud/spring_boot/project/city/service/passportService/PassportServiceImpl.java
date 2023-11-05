package com.maksud.spring_boot.project.city.service.passportService;

import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.repozitory.PassportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
@RequiredArgsConstructor
public class PassportServiceImpl implements PassportService{
    private final PassportRepository passportRepository;

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


}

