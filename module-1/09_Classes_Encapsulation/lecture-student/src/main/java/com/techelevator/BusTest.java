package com.techelevator;

import com.techelevator.vehicle.Bus;

public class BusTest {

    public static void main(String[] args) { // psvm shortcut returns this line

        Bus busOne = new Bus();
        busOne.setRouteName("High Street");

        Bus busTwo = new Bus("2nd Street");

        Bus busThree = new Bus("Front Street", 8);

        System.out.println(busOne.getRouteName());

        busOne.openDoor();
        busOne.closeDoor();

        System.out.println(busOne.getRemainingSeats());

        final int x;
        x = 10;

        busOne.openDoor();
        busOne.board(); // calls method without parameters
        busOne.board(5); // calls method with parameters

    }

}
