package org.example;

import java.util.Date;

public class Book extends Element{
    String author;
    String genre;

    public Book(String ISBN, String title, Date publicationYear, int pages, String author, String genre) {
        super(ISBN, title, publicationYear, pages);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

}
