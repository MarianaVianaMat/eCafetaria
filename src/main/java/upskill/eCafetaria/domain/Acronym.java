package upskill.eCafetaria.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.validation.constraints.NotNull;

@Embeddable
public class Acronym {
    private final String acronym;

    public Acronym(String acronym) {
        this.acronym = acronym;
    }

    protected Acronym() {
        this.acronym = null;
    }
}
