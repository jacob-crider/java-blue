package com.techelevator.books;

public class BookUser {

    // Instance Variables
    private String id; // built a Constructor for this since object can vary depending on user, not Setter
    private String firstName;
    private String lastName;
    private String favoriteBook;
    private String email;
    private BookCollection collection = new BookCollection(); // This connects BookUser Class to BookCollection Class

    // private BookCollection

    // Constructor
    public BookUser(String id) {
        this.id = id;
    }

    // Overloading Constructor -- users now have two options for id
    public BookUser(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public BookCollection getCollection() { // Gives access to BookUser so user can add things to their BookCollection
        return this.collection;
    }

    // Derived Property
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFavoriteBook(String favoriteBook) {
        this.favoriteBook = favoriteBook;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
