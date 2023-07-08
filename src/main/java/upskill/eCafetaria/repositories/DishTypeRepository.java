package upskill.eCafetaria.repositories;

import upskill.eCafetaria.api.dto.DishTypeDto;
import upskill.eCafetaria.domain.Acronym;
import upskill.eCafetaria.domain.DishType;

import java.util.List;
import java.util.Optional;

public interface DishTypeRepository {

    Iterable <DishType> findAll();
    Optional<DishType> findByAcronym(Acronym acronym);
    DishType save(DishType dishType);
}
