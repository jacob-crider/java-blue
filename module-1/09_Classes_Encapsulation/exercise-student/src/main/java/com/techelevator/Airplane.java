package com.techelevator;

public class Airplane {

// Instance Variables
    public String planeNumber;
    public int totalFirstClassSeats;
    public int bookedFirstClassSeats;
    public int totalCoachSeats;
    public int bookedCoachSeats;

// Constructor
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

// Methods
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass == true) {
            if (totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
                bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            } else {
                return false;
            }
        }
        if (forFirstClass == false && totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
                bookedCoachSeats += totalNumberOfSeats;
                return true;
            }
            return false;
        }



// Getters
    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

// Derived Getters
    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }

}
