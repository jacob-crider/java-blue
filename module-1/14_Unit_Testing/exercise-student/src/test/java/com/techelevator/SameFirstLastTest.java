package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {

    private SameFirstLast target;

    @Before
    public void setup() {
        target = new SameFirstLast();
    }

    @Test
    public void first_and_last_same_10() {
        int[] testArray = {10, 1, 4, 10};
        boolean result = target.isItTheSame(testArray);
        Assert.assertTrue(result);
    }

    @Test
    public void first_and_last_same_1() {
        int[] testArray = {1, 5, 4};
        boolean result = target.isItTheSame(testArray);
        Assert.assertFalse(result);
    }

    @Test
    public void first_and_last_same_2() {
        int[] testArray = {2, 10, 2};
        boolean result = target.isItTheSame(testArray);
        Assert.assertTrue(result);
    }

    @Test
    public void first_and_last_same_3() {
        int[] testArray = {3, 11, 1};
        boolean result = target.isItTheSame(testArray);
        Assert.assertFalse(result);
    }

    @Test
    public void first_and_last_same_12() {
        int[] testArray = {12, 13, 14, 15, 16, 17, 18, 19, 12};
        boolean result = target.isItTheSame(testArray);
        Assert.assertTrue(result);
    }
}
