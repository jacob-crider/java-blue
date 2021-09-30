package com.techelevator.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

    private FruitTree fruitTree;

    @Before
    public void setup() {
        fruitTree = new FruitTree("Pear", 10);
    }

    /*
        pick 1 fruit -- complete
        pick too many fruit -- complete
        pick negative fruit -- complete
        pick 0 fruit
        verify type of fruit
        pick exactly 10 fruit
        pick 5 fruit
        pick fruit multiple times
        pick fruit and then try to pick too many --
        pick some fruit then the remaining
     */

    @Test
    public void pick_one_fruit() {
        // Arrange
        // Act
        boolean pickedSuccessfully = fruitTree.pickFruit(1);
        // Assert
        Assert.assertTrue(pickedSuccessfully);
        int fruitThatShouldRemainingOnTree = 9;
        int fruitActuallyLeftOnTree = fruitTree.getPiecesOfFruitLeft();
        Assert.assertEquals(fruitThatShouldRemainingOnTree, fruitActuallyLeftOnTree);
    }

    @Test
    public void pick_too_many_fruit() {
        // Arrange
        // Act
        boolean pickedSuccessfully = fruitTree.pickFruit(11);
        //Assert
        // Verify the return was false
        Assert.assertFalse(pickedSuccessfully);
        // Verify the number on the fruitTree did not change
        Assert.assertEquals(10, fruitTree.getPiecesOfFruitLeft());
    }

    // Test is correct, but test is failing because the code on FruitTree.java is not handling negative numbers
    @Test
    public void pick_negative_fruit() {
        //Arrange
        //Act
        boolean pickedSuccessfully = fruitTree.pickFruit(-1);
        //Assert
        Assert.assertFalse("Allowed negative fruit to be picked", pickedSuccessfully);
        String failureMessage = "Expected 10 but was " + fruitTree.getPiecesOfFruitLeft();
        Assert.assertEquals(failureMessage, fruitTree.getPiecesOfFruitLeft());
    }

    @Test
    public void pick_fruit_then_try_to_pick_too_many() {
        //Arrange
            //to arrange for our test to try to pick too many fruit on the second time,
            // arrange the state of the class by picking some fruit
        fruitTree.pickFruit(3);
        //Act - try to pick too many fruit
        boolean pickSuccessfully = fruitTree.pickFruit(8);
        //Assert
        Assert.assertFalse(pickSuccessfully);
        Assert.assertEquals(7, fruitTree.getPiecesOfFruitLeft());
    }
}
