package upskill.eCafetaria.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Description {

    private final String description;

    public Description(String description) {
        this.description = description;
    }

    protected Description() {
        this.description = null;
    }
}
