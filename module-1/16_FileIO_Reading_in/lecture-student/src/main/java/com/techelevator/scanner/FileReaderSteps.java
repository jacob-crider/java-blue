package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderSteps {

    public static void main(String[] args) {

        String fileName = "rtn.txt"; // this line represents the path of this file

        File file = new File(fileName);

        try(Scanner fileScanner = new Scanner(file)) {

            while(fileScanner.hasNextLine()) {
                String lineFromFile = fileScanner.nextLine();

                System.out.println(lineFromFile);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
