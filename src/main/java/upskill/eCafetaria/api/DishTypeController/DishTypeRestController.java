package upskill.eCafetaria.api.DishTypeController;

import nonapi.io.github.classgraph.utils.VersionFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import upskill.eCafetaria.api.Mapper.DishTypeMapper;
import upskill.eCafetaria.application.CreateUpdateDishTypeController;
import upskill.eCafetaria.application.FindDishTypeController;
import upskill.eCafetaria.domain.Acronym;

import java.util.Optional;

@RestController
@RequestMapping("api/dishtype")
public class DishTypeRestController {

    @Autowired
    FindDishTypeController finderController;
    @Autowired
    CreateUpdateDishTypeController createUpdateDishTypeController;


    @GetMapping



    @GetMapping ("/{acronym}")
    public DishTypeDto findByAcronym (@PathVariable String acronym ) {
        Optional <DishTypeDto> dishTypeDTO = finderController.findByAcronym(acronym);
        if (dishTypeDTO.isEmpty() ) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return dishTypeDTO.get();
    }


    @PutMapping





}
