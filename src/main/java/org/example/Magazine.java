package org.example;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Magazine")

public class Magazine extends Element {

    private Periodicity periodicity;

    public Magazine(Integer ISBN, String title, int publicationYear, int pages, Periodicity periodicity) {
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
