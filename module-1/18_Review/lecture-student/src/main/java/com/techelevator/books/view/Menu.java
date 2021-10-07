package com.techelevator.books.view;

import java.util.Scanner;

public class Menu {

    private final static Scanner userInput = new Scanner(System.in);

    public String askUserForFilename() {
        System.out.println("Inventory filename: ");
        return userInput.nextLine();
    }

    public void tellUserInvalidFile() {
        System.out.println("Invalid file, please try again!");
    }

    public void showCollectionName(String userName) {
        System.out.println();
        System.out.println();

        System.out.println( userName + "'s book collection");
        System.out.println("-----------------------------------------------");
    }
}
