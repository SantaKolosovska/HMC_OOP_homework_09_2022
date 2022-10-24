package homework2.test;

import homework2.Country;
import homework2.Measurable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MaximumTest {

    private Country largerCountry = new Country("Large", 99999999.9);
    private Country mediumCountry = new Country("Medium", 5555.5);
    private Country smallCountry = new Country("Small", 1.0);
    private Measurable[] arrayOfCountries = new Measurable[3];

    @BeforeEach
    private void setup() {
        arrayOfCountries[0] = largerCountry;
        arrayOfCountries[1] = mediumCountry;
        arrayOfCountries[2] = smallCountry;
    }

    @Test
    void testMaximum() {
        Country.maximum(arrayOfCountries);
        Assertions.assertEquals(largerCountry, Country.maximum(arrayOfCountries));
    }

    @Test
    void testMaximumWithLambda() {
        Country.maximum(arrayOfCountries);
        Assertions.assertEquals(largerCountry, Country.maximumWithLambda(arrayOfCountries));
    }

}
