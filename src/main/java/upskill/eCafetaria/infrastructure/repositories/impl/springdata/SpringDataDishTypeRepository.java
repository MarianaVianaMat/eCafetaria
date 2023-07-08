package upskill.eCafetaria.infrastructure.repositories.impl.springdata;

import org.springframework.data.repository.CrudRepository;
import upskill.eCafetaria.domain.DishType;
import upskill.eCafetaria.repositories.DishTypeRepository;

public interface SpringDataDishTypeRepository extends CrudRepository <DishType, Long>, DishTypeRepository {
}
