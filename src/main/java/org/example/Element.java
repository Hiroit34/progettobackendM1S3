package org.example;

import java.util.Date;

public abstract class Element {
    String ISBN;
    String title;
    Date publicationYear;
    int pages;

    public Element (String ISBN, String title, Date publicationYear, int pages) {
        this.ISBN = ISBN;
        this.title = title;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Date getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public String getISBN() {
        return ISBN;
    }
}
