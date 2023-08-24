package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {

//    Score : 95%, Présence : 90 => Note: A
//    Score : 85%, Présence : 90 => Note: B
//    Score : 65%, Présence : 90 => Note: C
//    Score : 95%, Présence : 65 => Note: B
//    Score : 95%, Présence : 55 => Note: F
//    Score : 65%, Présence : 55 => Note: F
//    Score : 50%, Présence : 90 => Note: F
    @Test
    public void testScore95Presence90(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        //Act
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(90);
        double result = gradingCalculator.getGrade();
        //Assert
        Assertions.assertEquals("A", result);
    }

    @Test
    public void testScore85Presence90(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        //Act
        gradingCalculator.setScore(85);
        gradingCalculator.setAttendancePercentage(90);
        double result = gradingCalculator.getGrade();
        //Assert
        Assertions.assertEquals('B', result);
    }

    @Test
    public void testScore65Presence90(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        //Act
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(90);
        double result = gradingCalculator.getGrade();
        //Assert
        Assertions.assertEquals('C', result);
    }

    @Test
    public void testScore95Presence65(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        //Act
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(65);
        double result = gradingCalculator.getGrade();
        //Assert
        Assertions.assertEquals('B', result);
    }

    @Test
    public void testScore95Presence55(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        //Act
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(55);
        double result = gradingCalculator.getGrade();
        //Assert
        Assertions.assertEquals('F', result);
    }

    @Test
    public void testScore65Presence55(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        //Act
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(55);
        double result = gradingCalculator.getGrade();
        //Assert
        Assertions.assertEquals('F', result);
    }

    @Test
    public void testScore50Presence90(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();
        //Act
        gradingCalculator.setScore(50);
        gradingCalculator.setAttendancePercentage(90);
        double result = gradingCalculator.getGrade();
        //Assert
        Assertions.assertEquals('F', result);
    }
}
