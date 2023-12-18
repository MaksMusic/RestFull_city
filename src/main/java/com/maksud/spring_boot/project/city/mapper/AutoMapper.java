package com.maksud.spring_boot.project.city.mapper;

import com.maksud.spring_boot.project.city.Dto.AutoDto;
import com.maksud.spring_boot.project.city.model.Auto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AutoMapper {
    AutoMapper INSTANCE = Mappers.getMapper(AutoMapper.class);

    AutoDto  autoToAutoDto(Auto auto);

    List<AutoDto> listAutoToListAutoDto(List<Auto> autoList);

}
