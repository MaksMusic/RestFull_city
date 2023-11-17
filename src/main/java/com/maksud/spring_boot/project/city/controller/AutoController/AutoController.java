package com.maksud.spring_boot.project.city.controller.AutoController;

import com.maksud.spring_boot.project.city.Dto.AutoResponse;
import com.maksud.spring_boot.project.city.model.Auto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
public interface AutoController {

     Auto getAutoById(Long id);
     void addAuto(Auto auto);

     AutoResponse getAutosByIdUser(Long id);
}
