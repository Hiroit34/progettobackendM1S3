package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "Catalogue_element", discriminatorType = DiscriminatorType.STRING)

@NamedQuery(name = "GET_ISBN", query = "SELECT c FROM Element c WHERE c.ISBN = :ISBN")
@NamedQuery(name = "GET_YEAR", query = "SELECT c FROM Element c WHERE c.publicationYear = :publicationYear")
@NamedQuery(name = "GET_AUTHOR", query = "SELECT c FROM Element c WHERE c.author = :AUTHOR")
@NamedQuery(name = "GET_TITLE", query = "SELECT c FROM Element c WHERE c.title LIKE CONCAT('%', :title, '%')")

public abstract class Element {
    @Id
    @GeneratedValue
    String ISBN;
    String title;
    int publicationYear;
    int pages;

    public Element (String ISBN, String title, int publicationYear, int pages) {
        this.ISBN = ISBN;
        this.title = title;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    public Element() {}

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Element{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", pages=" + pages +
                '}';
    }
}
