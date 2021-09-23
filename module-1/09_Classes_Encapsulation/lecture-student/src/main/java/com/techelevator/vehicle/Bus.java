package com.techelevator.vehicle;

public class Bus {

    private final static int TOTAL_SEATS = 40; // "final" allows the variable to be assigned only once, "static" variables and methods all share the same value, TOTAL_SEATS is a constant

    private String routeName; // made private so no one outside can modify/access
    private int passengers;
    private int gallonsOfGas = 50;
    private boolean isDoorOpen = false; // Bus starts with closed door by default

    /*
        No Argument Constructor
        Provided by implicitly default as long as there is only 1 constructor
        Once a constructor overload has been added, then the no argument constructor must be explicit in the code.
        If there are no other constructors (overloads), then the no argument constructor is assumed by Java.
     */
    public Bus() {

    }

    /*
        Constructor Overload provides values that can be set when instantiating the class into an object.
        Can have 0...n constructor overloads
        Constructors should never call public methods
     */
    public Bus(String routeName) {
        this.routeName = formatRouteName(routeName);
    }

    public Bus(String routeName, int currentGas) {
        this.routeName = routeName;
        this.gallonsOfGas = currentGas;
    }

    /*
        Getters -- allows users to retrieve a value
     */
    public String getRouteName() { // Pattern every Getter will follow
        return this.routeName; // "this" keyword only changes value of specific instance -- refers to  the member variable specific to the instance of an object where the code is run
    }
    public int getGallonsOfGas() {
        return this.gallonsOfGas;
    }
    public boolean isDoorOpen() { // Booleans use "is" rather than "get"
        return this.isDoorOpen;
    }

    /*
        Setters -- allows user to change a value
     */
    public void setRouteName(String routeName)  {  // "routeName" here refers to "routeName" variable on line 28 -- Void will not return value/answer, just does some work in background
        this.routeName = formatRouteName(routeName);// "this" refers to "private String routeName" variable at top
    }

    private String formatRouteName(String routeName) { // Pass "formatRouteName and routName around here to format routeName, allows for changes to be made in one place if need be
        String name = routeName.replaceAll(" ", "-");
        return name.toUpperCase();
    }

    /*
        Encapsulated Setters encapsulate the functionality behind more intuitive names
        Gives the user much easier way to use the class
     */
    public void openDoor() {
        this.isDoorOpen = true;
    }
    public void closeDoor() {
        this.isDoorOpen = false;
    }

    public void addGas(int gallons) {
        this.gallonsOfGas += gallons;
    }

    /*
        Derived Property - calculates value it returns instead of storing it. NEVER stores the value.
     */
    public int getRemainingSeats() {
        return TOTAL_SEATS - this.passengers;
    }

    /*
    Method
     */
    public boolean board() {
        if (this.isDoorOpen && getRemainingSeats() >= 1) {
            this.passengers += 1;
            return true;
        }
        return false;
    }

    /*
    Method Overloading - Methods w/ the same name and return type and different arguments
        Have either a different number of arguments and/or the arguments have different data types
     */
    public boolean board(int boardingPassengers) {
        if (this.isDoorOpen && getRemainingSeats() >= boardingPassengers) { // if # of people are getting on, increase passengers by #
            this.passengers += boardingPassengers;
            return true;
        }
        return false;
    }
}
