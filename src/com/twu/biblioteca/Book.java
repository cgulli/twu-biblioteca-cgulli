package com.twu.biblioteca;

/**
 * Created by caitlingulliford on 06/03/2017.
 */
public class Book {

    private String name;
    private String author;
    private int bookPubDate;

    public Book(String name, String author, int bookPubDate) {
        this.name = name;
        this.author = author;
        this.bookPubDate = bookPubDate;
    }

    public String getName() {return this.name;}

    public int getBookPubDate() {return this.bookPubDate;}

    @Override
    public String toString() {return "| Title: " + name + " | Author: " + author + " | Published: " + bookPubDate + " |";}

}
