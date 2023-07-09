package upskill.eCafetaria.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescriptionTest {

    @Test
    void ensureDescriptionIsNotNullThorwException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DishType(new Acronym("peixe"), new Description(null)));
    }
    @Test
    void ensureAcronymLessThanHundredCharThrowException() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            string.append("i");
        }
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DishType(new Acronym("carne"), new Description(string.toString())));
    }

    @Test
    void ensureDescriptionIsNotEmptyThorwException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DishType(new Acronym("peixe"), new Description("")));
    }
}