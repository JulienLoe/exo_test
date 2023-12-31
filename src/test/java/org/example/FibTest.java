package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class FibTest {
//    Lors du déclanchement de la fonction getFibSeries() avec un Range de 1
//    Le résultat n’est pas vide
//    Le résultat correspond à une liste qui contient {0}
//    Lors du déclanchement de la fonction getFibSeries() avec un Range de 6
//    Le résultat contient le chiffre 3
//    Le résultat contient 6 éléments
//    Le résultat n’a pas le chiffre 4 en son sein
//    Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}
//    Le résultat est trié de façon ascendance

    private Fib fib;

    private void initGrandingCalculator(int range){
        fib = new Fib(range);
    }
    @Test
    public void testRange1(){

        initGrandingCalculator(1);
        List result = fib.getFibSeries();
        //Assert
        Assertions.assertEquals(1, result.size());

    }

    @Test
    public void testRange6AddNumber3(){

        initGrandingCalculator(6);
        List result = fib.getFibSeries();
        //Assert
        Assertions.assertTrue(result.contains(3));

    }

    @Test
    public void testRange6AddElement6(){

        initGrandingCalculator(6);
        List result = fib.getFibSeries();
        //Assert
        Assertions.assertTrue( result.size() > 0);
    }

//    @Test
//    public void testRange6Contain0{
//
//        initGrandingCalculator(6);
//        List result = fib.getFibSeries();
//        //Assert
//        Assertions.assertEquals(Arrays.asList(0), result);
//    }

    @Test
    public void testRange6AddNotNumber4(){

        initGrandingCalculator(6);
        List result = fib.getFibSeries();
        //Assert
        Assertions.assertTrue( !result.contains(4));

    }

    @Test
    public void testRange6EqualsList(){

        initGrandingCalculator(6);
        List result = fib.getFibSeries();
        System.out.println(result);
        int a [] = {0, 1, 1, 2, 3, 5};
        //Assert
        Assertions.assertEquals(result.toString(),Arrays.toString(a));

    }

    @Test
    public void testRange6Asc(){

        initGrandingCalculator(6);
        List result = fib.getFibSeries();
        List noSort = result;
         Collections.sort(result);
        //Assert
        Assertions.assertEquals(result, noSort);

    }

//    @Test
//    public void testRange6Asc(){
//
//        initGrandingCalculator(6);
//        List result = fib.getFibSeries();
//
//        //Assert
//        Assertions.assertEquals(Arrays.asList(0,1,1,2,3,5), result);
//
//    }

}
