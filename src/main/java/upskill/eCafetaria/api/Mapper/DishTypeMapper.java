package upskill.eCafetaria.api.Mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import upskill.eCafetaria.domain.Acronym;

@Mapper(componentModel = "spring")
public abstract class DishTypeMapper {

    public abstract Acronym toAcronym(String acronym);

}