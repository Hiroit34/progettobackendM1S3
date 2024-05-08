package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lend {


    // Attributi privati che rappresentano i dettagli di un prestito
    private Long id; // ID del prestito
    private User user; // Utente a cui è stato concesso il prestito
    private List<Element> lendedElement = new ArrayList<>(); // Lista degli elementi prestati
    private LocalDate startingLend; // Data di inizio del prestito
    private LocalDate endingLend = startingLend.plusDays(30); // Data di fine prevista del prestito, impostata a 30 giorni dalla data di inizio
    private LocalDate finalLend; // Data effettiva di restituzione degli elementi

    // Costruttore vuoto per la classe Prestito
    public Lend() {
    }

    // Metodi getter e setter per ogni attributo della classe

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Element> getLendedElement() {
        return lendedElement;
    }

    public void setLendedElement(List<Element> lendedElement) {
        this.lendedElement = lendedElement;
    }

    public LocalDate getStartingLend() {
        return startingLend;
    }

    public void setStartingLend(LocalDate startingLend) {
        this.startingLend = startingLend;
    }

    public LocalDate getEndingLend() {
        return endingLend;
    }

    public void setEndingLend(LocalDate endingLend) {
        this.endingLend = endingLend;
    }

    public LocalDate getFinalLend() {
        return finalLend;
    }

    public void setFinalLend(LocalDate finalLend) {
        this.finalLend = finalLend;
    }

    @Override
    public String toString() {
        return "Lend{" +
                "id=" + id +
                ", user=" + user +
                ", lendedElement=" + lendedElement +
                ", startingLend=" + startingLend +
                ", endingLend=" + endingLend +
                ", finalLend=" + finalLend +
                '}';
    }
}
