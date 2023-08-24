package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    private LeapYear leapYear;

    @Test
    public void testBiYearDivi400(){

        leapYear = new LeapYear();
        Boolean result = leapYear.calculatorLapYear(2000);
        //Assert
        Assertions.assertTrue(result);
    }

    @Test
    public void testBiYearDiviBy4Not100(){

        leapYear = new LeapYear();
        Boolean result = leapYear.calculatorLapYear(2016);
        //Assert
        Assertions.assertTrue(result);
    }

    @Test
    public void testBiYearDivi4000(){

        leapYear = new LeapYear();
        Boolean result = leapYear.calculatorLapYear(2000);
        //Assert
        Assertions.assertTrue(result);
    }
}
