package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProductTest {

    private Product product;
    @Test
    public void testSellinEgal0andQualityTwoTimesLess(){

        product = new Product("Saucisse", "viande", 0,10);
        product.update();
        int result = product.getQuality();
        //Assert
        Assertions.assertEquals(8, result);

    }

    @Test
    public void testQualityNotnegative(){

        product = new Product("Saucisse", "viande", 0,0);
        product.update();
        int result = product.getQuality();
        //Assert
        Assertions.assertEquals(0, result);

    }

    @Test
    public void testQualityNerverSup50(){

        product = new Product("Saucisse", "viande", 0,51);
        product.update();
        int result = product.getQuality();
        //Assert
        Assertions.assertEquals(51, result);

    }

    @Test
    public void testBriellVieillitmore1IfSellinLess(){

        product = new Product("brie vieillit", "laitier", 12,4);
        product.update();
        int result = product.getQuality();
        //Assert
        Assertions.assertEquals(5, result);

    }

    @Test
    public void testProductNameLaitiermore2IfSellinLess(){

        product = new Product("yahourt", "laitier", 12,4);
        product.update();
        int result = product.getQuality();
        //Assert
        Assertions.assertEquals(2, result);

    }
}
