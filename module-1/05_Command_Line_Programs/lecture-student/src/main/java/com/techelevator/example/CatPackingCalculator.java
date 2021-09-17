package com.techelevator.example;

import java.util.Scanner;

public class CatPackingCalculator {
    /*
        3 steps of a command line application
        1) Take input
        2) Calculate data (do something with the input)
        3) Give/return output
     */
    public static void main(String[] args) { // every Java app starts with this method

        Scanner userInput = new Scanner(System.in);


        /* Get the dimensions of the box */
        System.out.println("What is the length of the container in feet?");
        String lengthOfContainerFromUser = userInput.nextLine();
        double containerLength = Double.parseDouble(lengthOfContainerFromUser); // return lengthOfContainerFromUser userInput as a double

        System.out.println("What is the width of the container in feet?");
        String widthOfContainerFromUser = userInput.nextLine();
        int containerWidth = Integer.parseInt(widthOfContainerFromUser);

        System.out.println("What is the height of the container in feet?");
        String heightOfContainerFromUser = userInput.next();
        double containerHeight = Double.parseDouble(heightOfContainerFromUser);

        double estimatedPackingDensityOfCat = 0.5;
        double averageVolumeOfHouseCat = 0.83;
        double containerVolume = containerWidth * containerHeight * containerLength;
        double catsByVolume = containerVolume / averageVolumeOfHouseCat;
        double packedCats = catsByVolume * estimatedPackingDensityOfCat;

        // println() prints the text and automatically adds a new line
        System.out.println();
        // print() just prints the text without a new line
        // printf() prints formatted text using a formatter

        /* We want the console to look like this:

            Height      Width       Length      Cats in Box
            ------------------------------------------------
            10          15          20          18000
         */

        // this line prints the output with 15/25 spaces with the Height, Width, Length, and Cats in Box values
        System.out.printf("%-15s %-15s %-15s %-25s %n",  "Height", "Width", "Length", "Cats in Box");
        System.out.println("---------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-6.0f %n", containerHeight, containerWidth, containerLength, packedCats);

    }

}
