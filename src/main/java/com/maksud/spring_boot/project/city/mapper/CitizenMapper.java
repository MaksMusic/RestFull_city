package com.maksud.spring_boot.project.city.mapper;

import com.maksud.spring_boot.project.city.Dto.AutoDto;
import com.maksud.spring_boot.project.city.Dto.CitizenResponse;
import com.maksud.spring_boot.project.city.model.Auto;
import com.maksud.spring_boot.project.city.model.Citizen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class CitizenMapper {



    @Mapping(source = "autos", target = "autos", qualifiedByName = "toAutoDto")
    public abstract CitizenResponse citizenToCitizenResponse(Citizen citizen);



    public abstract List<CitizenResponse> citizenToCitizenResponse(List<Citizen> citizenList);




    @Named("toAutoDto")
    public List<AutoDto> toAutoDto(List<Auto> autoList) {
        return AutoMapper.INSTANCE.listAutoToListAutoDto(autoList);
    }



}
