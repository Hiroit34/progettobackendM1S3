package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Element;
import org.example.Lend;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ArchiveFile implements Archive{
    
    private static final Logger logger = LoggerFactory.getLogger(ArchiveFile.class);

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
    protected EntityManager em = emf.createEntityManager();

    private File f = new File("./catalogo.csv");
    
    @Override
    public void save(Element cat) {
        var t = em.getTransaction();
        t.begin();
        em.persist(cat); // Persiste l'oggetto nel database
        t.commit(); // Commit della transazione
    }

    @Override
    public void add(Element c) {

    }

    @Override
    public void deleteISBN(Integer ISBN) {
        try {
            Element catalogo = em.find(Element.class, ISBN); // Trova il catalogo per ISBN

            if (catalogo != null) {
                var t = em.getTransaction();
                t.begin();
                em.remove(catalogo); // Rimuove il catalogo dal database
                t.commit();
                logger.info("Catalogo con ISBN {} rimosso con successo", ISBN);
            } else {
                logger.warn("Nessun catalogo trovato tramite ISBN {}", ISBN);
            }
        } catch (Exception e) {
            logger.error("Errore durante la rimozione del catalogo tramite ISBN {}", ISBN, e);
        }
    }

    @Override
    public List<Element> getByTitle(String title) {
        try {
            var query = em.createNamedQuery("GET_TITLE", Element.class);
            query.setParameter("TITLE", title);
            List<Element> result = query.getResultList();
            return result;
        } catch (Exception e) {
            logger.error("Errore durante la ricerca tramite titolo", e);
            return Collections.emptyList();
        }
    }

    @Override
    public List<Element> getLendedElement(Integer Id) {
        return List.of();
    }

    @Override
    public List<Lend> getExpiredLendedElement() {
        return List.of();
    }

    @Override
    public Optional<Element> getISBN(Integer ISBN) {
        try {
            var query = em.createNamedQuery("GET_ISBN");
            query.setParameter("ISBN", ISBN);
            var cat = (Element) query.getSingleResult();
            return Optional.of(cat);
        } catch (Exception e) {
            logger.error("Exception searching catalogo by id", e);
            return Optional.empty();
        }
    }

    @Override
    public List<Element> getByAuthor(String author) {
        try {
            var query = em.createNamedQuery("GET_AUTHOR");
            query.setParameter("AUTHOR", author);
            List<Element> result = query.getResultList();
            return result;
        } catch (Exception e) {
            logger.error("Elemento con autore specificato inesistente", e);
            return Collections.emptyList();
        }
    }

    @Override
    public void getAuthor(String author) {

    }

    @Override
    public List<Element> getPublicationYear(Date publicationYear) {
        try {
            var query = em.createNamedQuery("GET_YEAR");

            query.setParameter("publicationYear", publicationYear);
            List<Element> result = query.getResultList();
            return result;
        } catch (Exception e) {
            logger.error("Nessun libro uscito in quest'anno nel catalogo", e);
            return null;
        }
    }

}
