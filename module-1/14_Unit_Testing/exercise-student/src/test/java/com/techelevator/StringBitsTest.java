package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {

    private StringBits target;

    @Before
    public void setup() {
        target = new StringBits();
    }

    @Test
    public void hello_string_test() {
        String result = target.getBits("Hello");
        Assert.assertEquals("Hlo", result);
    }

    @Test
    public void hownowbrowncow_string_test() {
        String result = target.getBits("Hownowbrowncow");
        Assert.assertEquals("Hwobono", result);
    }

    @Test
    public void to_string_test() {
        String result = target.getBits("To");
        Assert.assertEquals("T", result);
    }

    @Test
    public void no_string_test() {
        String result = target.getBits("");
        Assert.assertEquals("", result);
    }

    @Test
    public void thehumantorchwasdeniedabankloan_string_test() {
        String result = target.getBits("Thehumantorchwasdeniedabankloan");
        Assert.assertEquals("Teuatrhadneaakon", result);
    }

    @Test
    public void mehoymeenyoy_string_test() {
        String result = target.getBits("Mehoymeenyoy");
        Assert.assertEquals("Mhyeno", result);
    }
}
