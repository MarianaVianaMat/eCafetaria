package upskill.eCafetaria.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class DishType {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    @Embedded
    @Column(unique = true)
    @NotNull
    private Acronym acronym;
    @Embedded
    @NotNull
    private Description description;

    public DishType(Acronym acronym, Description description) {
        this.acronym = acronym;
        this.description = description;
    }

    protected DishType() {
    }

    public Acronym getAcronym() {
        return acronym;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}
