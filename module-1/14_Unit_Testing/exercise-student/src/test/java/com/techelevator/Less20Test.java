package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {

    private Less20 target;

    @Before
    public void setup() {
        target = new Less20();
    }

    @Test
    public void is_40_multiple_of_20() {
        boolean result = target.isLessThanMultipleOf20(40);
        Assert.assertFalse(result);
    }

    @Test
    public void is_18_multiple_of_20() {
        boolean result = target.isLessThanMultipleOf20(18);
        Assert.assertTrue(result);
    }

    @Test
    public void is_19_multiple_of_20() {
        boolean result = target.isLessThanMultipleOf20(19);
        Assert.assertTrue(result);
    }
}
