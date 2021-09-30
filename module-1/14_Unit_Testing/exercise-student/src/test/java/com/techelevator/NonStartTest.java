package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {

    private NonStart target;

    @Before
    public void setup() {
        target = new NonStart();
    }

    @Test
    public void hello_there_test() {
        String result = target.getPartialString("Hello", "There");
        Assert.assertEquals("ellohere", result);
    }

    @Test
    public void java_code_test() {
        String result = target.getPartialString("java", "code");
        Assert.assertEquals("avaode", result);
    }

    @Test
    public void ttwenty_one_test() {
        String result = target.getPartialString("ttwenty", "one");
        Assert.assertEquals("twentyne", result);
    }

    @Test
    public void shotl_java_test() {
        String result = target.getPartialString("shotl", "java");
        Assert.assertEquals("hotlava", result);
    }

    @Test
    public void totally_tubular_test() {
        String result = target.getPartialString("totally", "tubular");
        Assert.assertEquals("otallyubular", result);
    }
}
