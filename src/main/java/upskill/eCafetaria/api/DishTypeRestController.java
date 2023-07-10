package upskill.eCafetaria.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import upskill.eCafetaria.api.dto.CreateDishTypeDto;
import upskill.eCafetaria.api.dto.DishTypeDto;
import upskill.eCafetaria.application.dishTypeController.CreateUpdateDishTypeController;
import upskill.eCafetaria.application.dishTypeController.FindDishTypeController;
import upskill.eCafetaria.domain.DishType;

import java.util.Optional;

@RestController
@RequestMapping("api/dishtype")
public class DishTypeRestController {

    @Autowired
    FindDishTypeController finderController;
    @Autowired
    CreateUpdateDishTypeController createUpdateDishTypeController;


    @GetMapping
    @Operation(
            summary = "To get all dishtypes.",
            description = "get all dishtypes existent in the dababase.",
            tags = {"DishType"},
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = DishType.class))
                    ),
                    @ApiResponse(description = "Not found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal error", responseCode = "500", content = @Content)
            }
    )


    public Iterable<DishTypeDto> findAll() {
        return finderController.findAll();
    }


    @GetMapping("/{acronym}")
    @Operation(
            summary = "to get a dishtype",
            description = "to get a dishtype by its acronym.",
            tags = {"DishType"},
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = DishType.class))
                    ),
                    @ApiResponse(description = "Not found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal error", responseCode = "500", content = @Content)
            }
    )

    public DishTypeDto findByAcronym(@PathVariable @Parameter(description = "dishtype acronym") String acronym) {
        Optional<DishTypeDto> dishTypeDTO = finderController.findByAcronym(acronym);
        if (dishTypeDTO.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return dishTypeDTO.get();
    }

    @PutMapping("/{acronym}")
    @Operation(
            summary = "Update or Create a new dishtype",
            description = "to create or update a new dishtype, depending if it already exists or not in the database.",
            tags = {"DishType"},
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = DishType.class))
                    ),
                    @ApiResponse(description = "Not found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal error", responseCode = "500", content = @Content)
            }
    )
    public DishTypeDto createOrUpdateDishType(@PathVariable @Parameter(description = "dishtype acronym")  String acronym, @RequestBody @Parameter (description = "Dishtype description") CreateDishTypeDto createDishTypeDto) {
        return createUpdateDishTypeController.createOrUpdateDishType(acronym, createDishTypeDto);
    }


}
