package com.maksud.spring_boot.project.city.service.autoService;

import com.maksud.spring_boot.project.city.Dto.AutoResponse;
import com.maksud.spring_boot.project.city.model.Auto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AutoService {

   Auto getAutoById(Long id);

   void addAuto(Auto auto);

   AutoResponse getAutosByIdUser(Long idUser);
   //AutoResponse getAutoAll(Long userId);


}
