package upskill.eCafetaria.api.Mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import upskill.eCafetaria.api.DishTypeController.DishTypeDto;
import upskill.eCafetaria.domain.Acronym;
import upskill.eCafetaria.domain.DishType;

import java.util.Optional;

@Mapper(componentModel = "spring")
public abstract class DishTypeMapper {

    public abstract Acronym toAcronym(String acronym);

    public abstract DishTypeDto toDishTypeDTO(DishType dishType);
}