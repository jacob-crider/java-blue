package com.techelevator;


import com.techelevator.books.Media;
import com.techelevator.books.BookUser;
import com.techelevator.books.Magazine;

import java.util.Scanner;

public class Application {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Media newMedia = new Media();

        BookUser user = new BookUser("1", "John", "Fulton");
        user.setEmail("john@techelevator.com");
        user.setFavoriteBook("John's Favorite Book");

        // Create and add a Magazine
        Magazine newMagazine = new Magazine("Omni");
        newMagazine.setRating(4);
        user.getCollection().add(newMagazine);

        Magazine newMagazine2 = new Magazine("Testing Times");
        newMagazine.setRating(2);
        user.getCollection().add(newMagazine2);

        Magazine newMagazine3 = new Magazine("Java Daily");
        newMagazine.setRating(2);
        user.getCollection().add(newMagazine3);

        Ebook eBook = new Ebook("Head First Testing", "MOBI", "headfirsttesting.mobi", 1278);
        user.getCollection().add(eBook);

        // Create and Add a Book
        Book cleanCode = new Book();
        cleanCode.setTitle("Clean Code");
        cleanCode.setGenre("Programming");
        cleanCode.setAuthor("Martin Robert");
        cleanCode.setRating(5);
        cleanCode.setDescription("Details how to write clean code");
        user.getCollection().add(cleanCode);


        // Create a Second book
        Book braveNewWorld = new Book();
        braveNewWorld.setTitle("Brave New World");
        braveNewWorld.setAuthor("Aldous Huxley");
        braveNewWorld.setGenre("Science Fiction");
        braveNewWorld.setRating(5);
        user.getCollection().add(braveNewWorld);


        Book headFirstJava = new Book();

        System.out.print("Book Title: ");
        String bookTitle = input.nextLine();
        headFirstJava.setTitle(bookTitle);

        System.out.print("Book rating: ");
        int bookRating = input.nextInt();
        input.nextLine();
        headFirstJava.setRating(bookRating);

        user.getCollection().add(headFirstJava);


        /*
         Print out the Users Books
         */

        System.out.println();
        System.out.println();

        System.out.println( user.getFullName() + "'s book collection");
        System.out.println("-----------------------------------------------");

        for (Media media : user.getCollection().getBooks()) {
            System.out.println("Title: " + media.getTitle());
           // System.out.println("Author: " + media.getAuthor());
            System.out.println("Rating: " + media.getRating());
            System.out.println();
        }

        System.out.println("Total Books in Collection: " + user.getCollection().countOfBooks());



    }


    
}
