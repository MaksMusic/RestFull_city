package com.maksud.spring_boot.project.city.service.auto;

import com.maksud.spring_boot.project.city.Dto.AutoResponse;
import com.maksud.spring_boot.project.city.model.Auto;


public interface AutoService {

   Auto getAutoById(Long id);

   void addAuto(Auto auto);

   AutoResponse getAutosByIdUser(Long idUser);
   //AutoResponse getAutoAll(Long userId);


}
