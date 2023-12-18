package com.maksud.spring_boot.project.city.mapper;


import com.maksud.spring_boot.project.city.Dto.HomeDto;
import com.maksud.spring_boot.project.city.model.Home;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HomeMapper {

    HomeMapper INSTANCE = Mappers.getMapper(HomeMapper.class);

    HomeDto homeToHomeDto(Home home);

    List<HomeDto> listHomeToListHomeDto(List<Home> homeList);
}
