package upskill.eCafetaria.domain;


import javax.persistence.*;

@Entity
public class DishType {
    @Id
    private Long id;
    @Embedded
    @Column(unique = true)
    private Acronym acronym;
    @Embedded
    private Description description;

    public DishType(Long id, Acronym acronym, Description description) {
        this.id = id;
        this.acronym = acronym;
        this.description = description;
    }

    public DishType() {

    }
}
