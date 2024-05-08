package org.example;

import java.util.Date;

public class Magazine extends Element {

    private Periodicity periodicity;

    public Magazine(String ISBN, String title, Date publicationYear, int pages, Periodicity periodicity) {
        super(ISBN, title, publicationYear, pages);
    }

    public Magazine(){}


    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "periodicity=" + periodicity +
                '}';
    }
}
