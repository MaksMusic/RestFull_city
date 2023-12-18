package com.maksud.spring_boot.project.city.service.auto;

import com.maksud.spring_boot.project.city.Dto.AutoDto;
import com.maksud.spring_boot.project.city.Dto.AutoResponse;
import com.maksud.spring_boot.project.city.model.Auto;
import com.maksud.spring_boot.project.city.repozitory.AutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class AutoServiceImpl implements AutoService{
    private final AutoRepository autoRepository;

    @Override
    public void addAuto(Auto auto) {
        autoRepository.save(auto);
    }

    @Override
    public Auto getAutoById(Long id) {
          return autoRepository.findById(id).orElse(null);
    }

    @Override
    public AutoResponse getAutosByIdUser(Long idUser) {
        List<Auto> autosByCitizenId = autoRepository.getAutosByCitizenId(idUser);
        List<AutoDto> list = new ArrayList<>();


        for (Auto auto : autosByCitizenId) {
            String model = auto.getModel();
            double price = auto.getPrice();
            Long id = auto.getId();

            list.add(new AutoDto(id,model,price));
        }

        return new AutoResponse(list,idUser);
    }




//    @Override
//    public AutoResponse getAutoAll(Long userId) {
//
//    }
}
