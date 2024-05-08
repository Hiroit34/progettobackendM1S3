package org.example;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity

@DiscriminatorValue("Book")

public class Book extends Element{
    String author;
    String genre;

    public Book(String ISBN, String title, int publicationYear, int pages, String author, String genre) {
        super(ISBN, title, publicationYear, pages);
        this.author = author;
        this.genre = genre;
    }

    public Book() {

    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
