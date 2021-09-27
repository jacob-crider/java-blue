package com.techelevator;

public class Elevator {

    // Instance Variables
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen;

    // Constructor
    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
    }

    // Methods

    public boolean isDoorOpen() {
        return this.isDoorOpen();
    }

    public void openDoor() {
        this.isDoorOpen = true;
    }

    public void closeDoor() {
        this.isDoorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if (this.isDoorOpen()) {
            if (desiredFloor >= 1) {
                if (desiredFloor > currentFloor) {
                    currentFloor = desiredFloor;
                }
            }
        }
    }

    public void goDown(int desiredFloor) {
        if (this.isDoorOpen()) {
            if (desiredFloor < numberOfFloors) {
                if (desiredFloor > currentFloor) {
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
