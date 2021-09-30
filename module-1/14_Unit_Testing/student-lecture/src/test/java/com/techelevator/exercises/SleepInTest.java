package com.techelevator.exercises;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SleepInTest {

    // Declare a variable to reference the class we are testing
    private SleepIn sleepIn;


    // Tells JUnit to run this method before each test
    // Created a method and instantiate the object we are testing and assigning to the variable created above
    @Before
    public void setup() {
        sleepIn = new SleepIn();
    }

    @After
    public void cleanup() {
        // This test has nothing to clean up here, so is optional
    }
    /*
     weekday        vacation
     true           false       -> false
     true           true        -> true
     false          false       -> false
     false          true        -> true
     */

    /*
    The @Test annotation marks a method to be run as a test
     */
    @Test
    public void not_sleepin_when_not_vacation_and_weekday() {
        // Arrange (Setup)
            // This method doesn't need any steps to prepare it
        // Act (Test)
        boolean result = sleepIn.sleepIn(true, false);
        // Assert (Verify)
        Assert.assertFalse("SleepIn true when should be false", result);
    }

    @Test
    public void sleepin_when_weekday_and_vacation() {
        // Arrange
        // Act (Test)
        boolean result = sleepIn.sleepIn(true, true);
        // Assert
        Assert.assertTrue(result);
        }

    @Test
    public void sleepin_when_not_weekday_and_not_vacation() {
        boolean result = sleepIn.sleepIn(false, false);
        Assert.assertTrue(result);
    }

    @Test
    public void sleepin_when_not_weekday_and_vacation() {
        // Arrange
        // Act and Assert
        Assert.assertTrue(sleepIn.sleepIn(false, true));
    }


}
