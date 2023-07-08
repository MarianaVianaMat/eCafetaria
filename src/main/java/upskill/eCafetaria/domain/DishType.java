package upskill.eCafetaria.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class DishType {
    @Id
    private Long id;
    @Embedded
    @Column(unique = true)
    @NotNull
    private Acronym acronym;
    @Embedded
    @NotNull
    private Description description;

    public DishType(Long id, Acronym acronym, Description description) {
        this.id = id;
        this.acronym = acronym;
        this.description = description;
    }

    public DishType() {

    }
}
