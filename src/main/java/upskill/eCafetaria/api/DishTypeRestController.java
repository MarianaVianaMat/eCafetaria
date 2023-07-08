package upskill.eCafetaria.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import upskill.eCafetaria.api.dto.CreateDishTypeDto;
import upskill.eCafetaria.api.dto.DishTypeDto;
import upskill.eCafetaria.application.dishTypeController.CreateUpdateDishTypeController;
import upskill.eCafetaria.application.dishTypeController.FindDishTypeController;

import java.util.Optional;

@RestController
@RequestMapping("api/dishtype")
public class DishTypeRestController {

    @Autowired
    FindDishTypeController finderController;
    @Autowired
    CreateUpdateDishTypeController createUpdateDishTypeController;


    @GetMapping
    public Iterable<DishTypeDto> findAll() {
        return finderController.findAll();
    }

    @GetMapping ("/{acronym}")
    public DishTypeDto findByAcronym (@PathVariable String acronym ) {
        Optional <DishTypeDto> dishTypeDTO = finderController.findByAcronym(acronym);
        if (dishTypeDTO.isEmpty() ) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return dishTypeDTO.get();
    }

    @PutMapping("/{acronym}")
    public DishTypeDto createOrUpdateDishType(@PathVariable String acronym, @RequestBody CreateDishTypeDto createDishTypeDto) {
        return createUpdateDishTypeController.createOrUpdateDishType(acronym, createDishTypeDto);
    }


}
