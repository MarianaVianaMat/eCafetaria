package upskill.eCafetaria.application.dishTypeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import upskill.eCafetaria.api.dto.CreateDishTypeDto;
import upskill.eCafetaria.api.DishTypeController.DishTypeDto;
import upskill.eCafetaria.api.mapper.DishTypeMapper;
import upskill.eCafetaria.domain.DishType;
import upskill.eCafetaria.repositories.DishTypeRepository;

import java.util.Optional;

@Component
public class CreateUpdateDishTypeController {

    @Autowired
    DishTypeMapper dishTypeMapper;
    @Autowired
    DishTypeRepository repo;

    public DishTypeDto createOrUpdateDishType(String acronym, CreateDishTypeDto createDishTypeDto) {
        Optional<DishType> dishType = repo.findByAcronym(dishTypeMapper.toAcronym(acronym));
        DishType dishType1;
        if (dishType.isEmpty()) {
            dishType1 = dishTypeMapper.createDishType(acronym, createDishTypeDto);
        } else {
            dishType1 = dishTypeMapper.updateDishType(dishType.get(), createDishTypeDto);
        }
        return dishTypeMapper.toDishTypeDTO(repo.save(dishType1));
    }
}
