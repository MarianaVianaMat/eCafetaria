package upskill.eCafetaria.repositories;

import upskill.eCafetaria.domain.Acronym;
import upskill.eCafetaria.domain.DishType;

import java.util.Optional;

public interface DishTypeRepository {

    Iterable <DishType> findAll();
    Optional<DishType> findByAcronym(Acronym acronym);
    DishType save(DishType dishType);
}
