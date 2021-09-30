package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {

    private Lucky13 target;

    @Before
    public void setup() {
        target = new Lucky13();
    }

    @Test
    public void test_array_024() {
        int[] testArray = {0, 2, 4};
        boolean result = target.getLucky(testArray);
        Assert.assertTrue(result);
    }

    @Test
    public void test_array_123() {
        int[] testArray = {1, 2, 3};
        boolean result = target.getLucky(testArray);
        Assert.assertFalse(result);
    }

    @Test
    public void test_array_254() {
        int[] testArray = {2, 5, 4};
        boolean result = target.getLucky(testArray);
        Assert.assertTrue(result);
    }

    @Test
    public void test_array_124() {
        int[] testArray = {1, 2, 4};
        boolean result = target.getLucky(testArray);
        Assert.assertFalse(result);
    }
}
