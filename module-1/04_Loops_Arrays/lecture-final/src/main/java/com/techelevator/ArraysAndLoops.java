package com.techelevator;

public class ArraysAndLoops {

    public static void main(String[] args) {

        String[] instructors = new String[5];

        int[] count = new int[] {10, 20, 30, 40, 50};

        count[2] = 100;

        instructors[0] = "John";
        instructors[1] = "Brian";
        instructors[2] = "Steve";
        instructors[3] = "Matt";
        instructors[4] = "Kevin";

        instructors[1] = "you are fired";
        instructors[1] = "Brian2";
        String name = instructors[1];

        //the following code will give us an ArrayIndexOutOfBounds exception
        //instructors[5] = "Andrew";

        String greeting = " " + name;

        System.out.println(greeting);
        System.out.println("funky address ref " + count);
        System.out.println("I want to see the first " + count[0]);
        System.out.println(instructors[1] + " " + instructors[4]);
    }

}
