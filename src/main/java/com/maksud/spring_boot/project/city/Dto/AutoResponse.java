package com.maksud.spring_boot.project.city.Dto;

import com.maksud.spring_boot.project.city.model.Auto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class AutoResponse {
    private List<AutoDto> autoList;
    private Long userId;


}

