package com.techelevator.splitter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleFileSplitter {

    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Path to file to split: ");
        String path = userInput.nextLine();
        System.out.println("Number of lines per section: ");
        int lineCount = userInput.nextInt();
        userInput.nextLine();

        File fileObject = new File(path);

        try (Scanner fileScanner = new Scanner(fileObject)) {

            int segmentNumber = 0;
            while (fileScanner.hasNextLine()) {

                List<String> linesInSegment = new ArrayList<>(); // contains linesInSegment

                int count = lineCount;
                while(count > 0 && fileScanner.hasNextLine()) { // loop continues while the lineCount is greater than 0, and only if there is another line
                    String lineFromFile = fileScanner.nextLine();
                    linesInSegment.add(lineFromFile); // adds lineFromFile to the linesInSegment List
                    count--;
                }

                String pathToNewSegmentFile = path + "-" + segmentNumber; // creates segments/new files labeled Dracula-1, Dracula-2, etc...
                segmentNumber++; // increases segmentNumber

            try (PrintWriter printWriter = new PrintWriter(pathToNewSegmentFile); // pass the path and creates new file/segment
                 BufferedWriter bufferedWriter = new BufferedWriter(printWriter)) {

                    for (String line : linesInSegment) { // loops through array of strings in file
                        bufferedWriter.write(line); // writes out the line
                        bufferedWriter.newLine(); // writes out next line and ensures each lineSegment is on a new line
                    }
            }

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileObject.getAbsolutePath()); // fileObject.getAbsolutePath() retrieves full file path in directory
        } catch (IOException e) {
            System.out.println("Unable to access file: " + e.getMessage());
        }
    }
}
