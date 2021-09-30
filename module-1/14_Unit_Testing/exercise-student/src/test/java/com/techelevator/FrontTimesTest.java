package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {

    private FrontTimes frontTimes;

    @Before
    public void setup() {
        frontTimes = new FrontTimes();
    }

    @Test
    public void chocolate_to_chocho() {
        String result = "ChoCho";
        Assert.assertEquals(result, frontTimes.generateString("Chocolate", 2));
    }

    @Test
    public void front_to_frofrofro() {
        String result = "FroFroFro";
        Assert.assertEquals(result, frontTimes.generateString("Front", 3));
    }

    @Test
    public void pomodoro_to_pom() {
        String result = "PomPomPom";
        Assert.assertEquals(result, frontTimes.generateString("Pomodoro", 3));
    }
}