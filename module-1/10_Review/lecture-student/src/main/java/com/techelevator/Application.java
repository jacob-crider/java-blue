package com.techelevator;

import com.techelevator.books.Book;
import com.techelevator.books.BookUser;

import java.util.Scanner;

public class Application {

    private static Scanner input = new Scanner(System.in); // Input Scanner so we can ask user question

    public static void main(String[] args) {

        BookUser user = new BookUser("1", "John", "Fulton"); // Calls info from BookUser Class
        user.setEmail("john@techelevator.com");
        user.setFavoriteBook("John's Favorite Book");

        // Book 1
        // Add info from Book Class
        Book cleanCode = new Book();
        cleanCode.setTitle("Clean Code");
        cleanCode.setGenre("Programming");
        cleanCode.setAuthor("Martin Robert");
        cleanCode.setRating(5);
        cleanCode.setDescription("Details how to write clean code");

        user.getCollection().add(cleanCode); // Calls getCollection() Getter from BookUser + Adds book to BookCollection

        // Book 2
        // Add info from Book Class
        Book braveNewWorld = new Book();
        braveNewWorld.setTitle("Brave New World");
        braveNewWorld.setAuthor("Aldous Huxley");
        braveNewWorld.setGenre("Science Fiction");
        braveNewWorld.setRating(5);

        user.getCollection().add(braveNewWorld); // See line 26

        // Book from User
        Book headFirstJava = new Book(); // Calls info from Book Class

        System.out.print("Book Title: ");
        String bookTitle = input.nextLine();
        headFirstJava.setTitle(bookTitle);

        System.out.print("Book rating: ");
        int bookRating = input.nextInt();
        input.nextLine();
        headFirstJava.setRating(bookRating);

        user.getCollection().add(headFirstJava);

        // Print out the Users Books
        System.out.println();
        System.out.println();

        System.out.println(user.getFullName() + "'s book collection"); // Calls Derived Property from BookUser Class
        System.out.println("--------------------");

        for (Book book : user.getCollection().getBooks()) { // Gets the getCollection() from BookUser Class and loops through getBooks() in BookCollection Class
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Rating: " + book.getRating());
            System.out.println();
        }

        System.out.println("Total Books in Collection: " + user.getCollection().countOfBooks()); // Calls getCollection() from BookUser then countOfBooks() from BookCollection


    }
    
}
