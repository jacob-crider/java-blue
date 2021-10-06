package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlowerShopOrderTest {

    private FlowerShopOrder target;

    @Before
    public void setup() {
        target = new FlowerShopOrder();
    }

    @Test
    public void zipCode_10001_same_day_delivery() {
        double result = 5.99;
        Assert.assertEquals(result, target.deliveryTotal(true, 10001), .09);
    }
}
