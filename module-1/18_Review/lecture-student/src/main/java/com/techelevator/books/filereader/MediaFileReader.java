package com.techelevator.books.filereader;

import com.techelevator.books.Book;
import com.techelevator.books.Magazine;
import com.techelevator.books.Media;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaFileReader {

    public List<Media> read(String fileName) throws FileNotFoundException {

        List<Media> media = new ArrayList<>(); // create a new list to return when done
        File file = new File(fileName); // create a File object

        try (Scanner fileScanner = new Scanner(file)) { // containing process in a try block to "close the stream??"

            while(fileScanner.hasNextLine()) { // continue the reading process if there is another line
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\|"); // \\| means treat "|" as not a special character
                Media mediaLoadedFromLineOfFile = null;
                if (parts[4].equalsIgnoreCase("BOOK")) {
                    mediaLoadedFromLineOfFile = new Book();
                    ((Book) mediaLoadedFromLineOfFile).setAuthor(parts[1]);
                } else if (parts[4].equalsIgnoreCase("MAGAZINE")) {
                    mediaLoadedFromLineOfFile = new Magazine();
                }
                mediaLoadedFromLineOfFile.setTitle(parts[0]);
                mediaLoadedFromLineOfFile.setGenre(parts[2]);
                mediaLoadedFromLineOfFile.setRating(Integer.parseInt(parts[3]));
                media.add(mediaLoadedFromLineOfFile);
            }
        }

        return media;
    }
}
