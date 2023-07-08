package upskill.eCafetaria.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import upskill.eCafetaria.api.DishTypeController.DishTypeDto;
import upskill.eCafetaria.api.Mapper.DishTypeMapper;
import upskill.eCafetaria.domain.DishType;
import upskill.eCafetaria.repositories.DishTypeRepository;

import java.util.Optional;

@Component
public class FindDishTypeController {


    @Autowired
    DishTypeMapper dishTypeMapper;

    @Autowired
    DishTypeRepository repo;


    public Optional<DishTypeDto> findByAcronym (String acronym) {

        Optional <DishType> dishType = repo.findByAcronym(dishTypeMapper.toAcronym(acronym));




    }
}
