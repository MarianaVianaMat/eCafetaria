package upskill.eCafetaria.application.dishTypeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import upskill.eCafetaria.api.dto.DishTypeDto;
import upskill.eCafetaria.api.mapper.DishTypeMapper;
import upskill.eCafetaria.domain.DishType;
import upskill.eCafetaria.repositories.DishTypeRepository;

import java.util.Optional;

@Component
public class FindDishTypeController {


    @Autowired
    DishTypeMapper dishTypeMapper;

    @Autowired
    DishTypeRepository repo;

    public Optional<DishTypeDto> findByAcronym(String acronym) {
        Optional<DishType> dishType = repo.findByAcronym(dishTypeMapper.toAcronym(acronym));
        if (dishType.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(dishTypeMapper.toDishTypeDTO(dishType.get()));
    }

    // var maybeDishType = rep.findby...
   //return maybeDishType.map(dishtype -> dishtypemapper.todishtype(dishtype) dishtypemapper :: dishtype
    public Iterable<DishTypeDto> findAll() {
        return dishTypeMapper.toDishTypeDTOList(repo.findAll());
    }
}
