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

        System.out.println("Print out of Bus");
        System.out.println(busOne);

        Bus busA = new Bus("abc");
        Bus busB = new Bus("abs");

        if (busA.equals(busB)) {
            System.out.println("This is the same bus");
        }

        Bus.getDistanceRemaining(10, 7);

    }
}
