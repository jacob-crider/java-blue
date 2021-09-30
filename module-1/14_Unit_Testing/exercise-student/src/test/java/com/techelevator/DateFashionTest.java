package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {

    private DateFashion target;

    @Before
    public void setup() {
        target = new DateFashion();
    }

    @Test
    public void can_5_and_10_get_table() {
        int result = 2;
        Assert.assertEquals(result, target.getATable(5, 10));
    }

    @Test
    public void can_5_and_2_get_table() {
        int result = 0;
       Assert.assertEquals(result, target.getATable(5, 2));
    }

    @Test
    public void can_5_and_5_get_table() {
        int result = 1;
        Assert.assertEquals(result, target.getATable(5, 5));
    }

    // Edge case
    @Test
    public void can_11_and_11_get_table() {
        int result = 0;
        Assert.assertEquals(result, target.getATable(11, 11));
    }
}
