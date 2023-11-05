package com.maksud.spring_boot.project.city.controller.citizenController;

import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.service.citizenService.CitizenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CitizenControllerImpl implements CitizenController {
    private final CitizenService userService;

    @Override
    @GetMapping("/users")
    public List<Citizen> getAllUser() {
        return userService.getAllUser();
    }

    @Override
    @GetMapping("/users/{id}")
    public Citizen getCitizenById(@PathVariable("id") Long id) {
        return userService.getCitizenById(id);
    }

    //в данном методе была проблема -> отсутствовала анотация RequestBody
    @Override
    @PostMapping("/create")
    public Citizen createUser(@RequestBody Citizen citizen) {
        return userService.createUser(citizen);
    }

    @Override
    @DeleteMapping("/delete")
    public boolean deleteCitizen(@RequestBody Citizen citizen) {
        return userService.deleteCitizen(citizen);
    }


    @Override
    @GetMapping("/users/{id}/passport")
    public Passport getPassport(@PathVariable Long id) {
        return getCitizenById(id).getPassport();
       // return  userService.getPassport(id); но нужна проверка orElse но тут ее прописать же нельзя
    }

    @Override
    @DeleteMapping("/deleteById/{id}")
    public boolean deleteCitizenById(@PathVariable Long id) {
        return userService.deleteCitizenById(id);
    }

//    @Override
//    @GetMapping("/users")
//    public Citizen getCitizenById(@PathVariable("userId") Long userI) {
//        return userService.getCitizenById(id);
//    }


}