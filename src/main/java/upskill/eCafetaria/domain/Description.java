package upskill.eCafetaria.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Description {

    private final String description;

    public Description(String description) {
        if (description ==null || description.length() <1 || description.length() >99) { throw new IllegalArgumentException("Description must be between 1 and 100 characters");
        }
        this.description = description;
    }

    protected Description() {
        this.description = null;
    }
}
