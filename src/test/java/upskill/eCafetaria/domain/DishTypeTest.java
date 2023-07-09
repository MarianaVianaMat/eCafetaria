package upskill.eCafetaria.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DishTypeTest {


    @Test
    void ensureAcronymIsNotNullThorwException () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DishType(new Acronym(null), new Description("prato vegetariano")));
    }
    @Test
    void ensureAcronymNotEmptyThrowException () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DishType(new Acronym(""), new Description("prato de peixe")));
    }
    @Test
    void ensureAcronymNoMoreThanTenLettersThrowException () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DishType(new Acronym("pratopeixes"), new Description("prato vegetariano")));
    }
    @Test
    void ensureOneWordOnlyAcronymThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DishType(new Acronym("Prato Carne"), new Description("prato de carne")));
    }

    @Test
    void ensureNoSpecialCharAcronymThrowException () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DishType(new Acronym("prato*peixes"), new Description("prato vegetariano")));

    }
}
