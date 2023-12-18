package com.maksud.spring_boot.project.city.controller.Auto;

import com.maksud.spring_boot.project.city.Dto.AutoResponse;
import com.maksud.spring_boot.project.city.model.Auto;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface AutoController {

     Auto getAutoById(Long id);
     void addAuto(Auto auto);

     AutoResponse getAutosByIdUser(Long id);
}
