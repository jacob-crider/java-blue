package com.techelevator;

public class Elevator {

    // Instance Variables
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen;

    // Constructor
    public Elevator(int numberOfLevels) {
        numberOfFloors = numberOfLevels;
    }

    // Methods

    public boolean isDoorOpen() {

        return doorOpen;
    }

    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if (isDoorOpen() == false) {
            if (desiredFloor >= 1) {
                if (desiredFloor >= currentFloor && desiredFloor <= numberOfFloors) {
                    currentFloor = desiredFloor;
                }
            }
        }
    }

    public void goDown(int desiredFloor) {
        if (isDoorOpen() == false) {
            if (desiredFloor <= numberOfFloors) {
                if (desiredFloor <= currentFloor && desiredFloor >= 1) {
                    currentFloor = desiredFloor;
                }
            }
        }

    }

// Getters
    public int getCurrentFloor() {
       return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean getDoorOpen() {
        return doorOpen;
    }

}
