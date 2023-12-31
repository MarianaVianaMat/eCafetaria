package upskill.eCafetaria.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import upskill.eCafetaria.api.dto.CreateDishTypeDto;
import upskill.eCafetaria.api.dto.DishTypeDto;
import upskill.eCafetaria.domain.Acronym;
import upskill.eCafetaria.domain.Description;
import upskill.eCafetaria.domain.DishType;

@Mapper(componentModel = "spring")
public abstract class DishTypeMapper {

    public abstract Acronym toAcronym(String acronym);

    public String fromAcronym(Acronym acronym) {
        return acronym.getAcronym();
    }

    public abstract Description toDescription(String description);

    public String fromDescription(Description description) {
        return description.getDescription();
    }

    public abstract DishTypeDto toDishTypeDTO(DishType dishType);

    public abstract Iterable<DishTypeDto> toDishTypeDTOList(Iterable<DishType> all);

    public abstract DishType createDishType(String acronym, CreateDishTypeDto createDishTypeDto);

    public abstract DishType updateDishType(@MappingTarget DishType dishType, CreateDishTypeDto createDishTypeDto);


}