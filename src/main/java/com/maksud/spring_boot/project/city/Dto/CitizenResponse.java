package com.maksud.spring_boot.project.city.Dto;

import com.maksud.spring_boot.project.city.model.Auto;
import com.maksud.spring_boot.project.city.model.Passport;
import com.maksud.spring_boot.project.city.service.citizen.CitizenService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CitizenResponse {

    private Long id;
    private String name;
    private Passport passport;
    private List<AutoDto> autos;
    private List<HomeDto> homes;


}
