package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CityTest {

    City city;
    @Test
    void testCityParis() {
        //Arrange
        city = new City();

        //Act
        List<String> result = city.searchCity("Paris");

        //Assert
        Assertions.assertEquals(Arrays.asList("Paris"), result);
    }

    @Test
    void testCityAll() {
        //Arrange
        city = new City();

        //Act
        List<String> result = city.searchCity("*");
        //Assert
        Assertions.assertEquals(16, result.size());
    }

    @Test
    void testCityFalseCity() {
        //Arrange
        city = new City();

        //Act
        List<String> result = city.searchCity("Lille");

        //Assert
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void testCityEmpty() {
        //Arrange
        city = new City();

        //Act
        List<String> result = city.searchCity("");

        //Assert
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void testCityNoFoundExceptionTest2Char() {
        //Arrange
        city = new City();

        //Act
        city.setListCity(Arrays.asList("Paris", "Valence"));

        //Assert
        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            city.searchCity("t");
        });
    }

}
