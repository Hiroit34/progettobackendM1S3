package org.example;

import java.util.Date;

public class Magazine extends Element {

    private Periodicity periodicity;

    public Magazine(String ISBN, String title, Date publicationYear, int pages, Periodicity periodicity) {
        super(ISBN, title, publicationYear, pages);
        this.periodicity = periodicity;
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }
}
