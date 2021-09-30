package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupTest {

    private AnimalGroupName animalName;

    @Before
    public void setup() {
        animalName = new AnimalGroupName();
    }

    @Test
    public void return_Tower_if_giraffe() {
        String result = "Tower";
        Assert.assertEquals(result, animalName.getHerd("giraffe"));
    }

    @Test
    public void empty_string_return_unknown() {
        String result = "unknown";
        Assert.assertEquals(result, animalName.getHerd(""));
    }

    @Test
    public void walrus_has_no_group() {
        String result = "unknown";
        Assert.assertEquals(result, animalName.getHerd("walrus"));
    }

    @Test
    public void Rhino_returns_crash() {
        String result = "Crash";
        Assert.assertEquals(result, animalName.getHerd("Rhino"));
    }

    @Test
    public void lowercase_rhino_returns_crash() {
        String result = "Crash";
        Assert.assertEquals(result, animalName.getHerd("rhino"));
    }

    @Test
    public void lowercase_elephants_has_no_group() {
        String result = "unknown";
        Assert.assertEquals(result, animalName.getHerd("elephants"));
    }

    @Test
    public void uppercase_rhino_returns_crash() {
        String result = "Crash";
        Assert.assertEquals(result, animalName.getHerd("RHINO"));
    }

    @Test
    public void null_returns_unknown() {
        String result = "unknown";
        Assert.assertEquals(result, animalName.getHerd(null));
    }
}
