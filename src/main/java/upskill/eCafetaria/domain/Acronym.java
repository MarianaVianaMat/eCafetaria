package upskill.eCafetaria.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.validation.constraints.NotNull;

@Embeddable
public class Acronym {
    private final String acronym;

    public Acronym(String acronym) {
        if (acronym == null || acronym.isEmpty() || acronym.length() > 10 || acronym.trim().split(" ").length != 1 || !acronym.matches("[a-z A-Z]")) {
            throw new IllegalArgumentException("Acrónimo inválido");
        }
        this.acronym = acronym;
    }

    protected Acronym() {
        this.acronym = null;
    }
}
