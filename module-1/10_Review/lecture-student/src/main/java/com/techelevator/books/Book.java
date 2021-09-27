package com.techelevator.books;

public class Book {

    // Instance Variables
    private String genre;
    private String title; // Created a Constructor for every new instance
    private String author;
    private int pageCount;
    private String isbn;
    private int rating;
    private String description;

    // Constructors

    public Book(){

    }

    public Book(String title) {

        this.title = title;
    }

    // Everything here has Getter and Setter
    // Getters
    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }


    // Setters
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
