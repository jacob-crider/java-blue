package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupTest {

    private AnimalGroupName animalGroup;

    @Before
    public void setup() {
        animalGroup = new AnimalGroupName();
    }

    @Test
    public void return_unknown_if_null() {
        String emptyString = animalGroup.getHerd(null);
       // Assert.assertEquals( "unknown");
    }
}
