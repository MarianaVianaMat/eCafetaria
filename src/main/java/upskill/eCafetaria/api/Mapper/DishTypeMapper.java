package upskill.eCafetaria.api.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;
import upskill.eCafetaria.api.DishTypeController.CreateDishTypeDto;
import upskill.eCafetaria.api.DishTypeController.DishTypeDto;
import upskill.eCafetaria.domain.Acronym;
import upskill.eCafetaria.domain.DishType;

import java.util.Optional;

@Mapper(componentModel = "spring")
public abstract class DishTypeMapper {

    public abstract Acronym toAcronym(String acronym);

    public abstract DishTypeDto toDishTypeDTO(DishType dishType);

    public abstract Iterable<DishTypeDto> toDishTypeDTOList(Iterable<DishType> all);

    public abstract DishType createDishType(String acronym, CreateDishTypeDto createDishTypeDto);

    public abstract DishType updateDishType(@MappingTarget DishType dishType, CreateDishTypeDto createDishTypeDto);
}