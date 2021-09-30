package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {

    private MaxEnd3 target;

    @Before
    public void setup() {
        target = new MaxEnd3();
    }

    @Test
    public void test_array_3_is_largest() {
        int[] testArray = {1, 2, 3};
        int[] expectedResult = {3, 3, 3};
        int[] actualResult = target.makeArray(testArray);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void test_array_11_is_largest() {
        int[] testArray = {11, 5, 9};
        int[] expectedResult = {11, 11, 11};
        int[] actualResult = target.makeArray(testArray);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void test_array_20_is_largest() {
        int[] testArray = {20, 12, 9};
        int[] expectedResult = {20, 20, 20};
        int[] actualResult = target.makeArray(testArray);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void test_array_15_is_largest() {
        int[] testArray = {10, 1, 15};
        int[] expectedResult = {15, 15, 15};
        int[] actualResult = target.makeArray(testArray);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
