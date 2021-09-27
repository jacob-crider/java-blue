package com.techelevator.books;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    //Instance Variable
    private List<Book> books = new ArrayList<Book>(); // Books will always at least be an empty list

    // Methods
    public void add(Book book) { // This will work like a Setter and add a book to the List
        books.add(book);
    }

    // Getters
    public List<Book> getBooks() {
        return books;
    }

    public int countOfBooks() { // Will return number of books in the collection
        return books.size();
    }


}
