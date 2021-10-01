package com.techelevator.books;

public class Book extends Media{

    private String isbn;
    private String author;

    public Book() {
        super("", "Book");
    }

    public Book(String title) {
        super(title, "Book");
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
