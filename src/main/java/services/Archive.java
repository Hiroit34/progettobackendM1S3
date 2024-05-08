package services;

import org.example.Element;
import org.example.Lend;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface Archive {
    void save(Element cat);

    void add(Element c);
    void deleteISBN(Integer ISBN);

    List<Element> getByTitle(String title);

    List<Element> getLendedElement(Integer Id);

    List<Lend> getExpiredLendedElement();

    Optional<Element> getISBN (Integer ISBN);

    List<Element> getByAuthor(String author);

    void getAuthor(String author);

    List<Element> getPublicationYear(Date publicationYear);
}
