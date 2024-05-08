import org.example.Book;
import org.slf4j.LoggerFactory;
import services.ArchiveFile;

import java.util.logging.Logger;

public class Main {
    Logger logger = (Logger) LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        var ArchiveFile = new ArchiveFile();

        Book libri1 = new Book(213213,"Viaggio oltre i confini", 2024, 2345, "Lucia", "fantasy");
        Book libri2 = new Book(12341,"Notte stellata", 1998, 5823, "Giovanni", "romanzo");
        Book libri3 = new Book(12347654,"Le onde del destino", 2010, 3674, "Francesca", "avventura");
//        Book libri4 = new Book("14f34f134f","Sussurri del bosco", 2001, 4829, "Roberto", "mistero");
//        Book libri5 = new Book("f234fwer","Il mistero della cripta", 2015, 8301, "Elena", "thriller");
//        Book libri6 = new Book("1234tydfg","Risveglio primaverile", 1992, 4490, "Matteo", "drammatico");

        // Salvataggio degli oggetti libri nel sistema di archiviazione file
        ArchiveFile.save(libri1);
        ArchiveFile.save(libri2);
//        ArchiveFile.save(libri3);
//        ArchiveFile.save(libri4);
//        ArchiveFile.save(libri5);
        System.out.println(libri1);

        // Rimozione di libri dal sistema di archiviazione usando un identificativo ISBN specifico
//        ArchiveFile.deleteISBN(2);
//        ArchiveFile.deleteISBN(4);

        // Stampa delle informazioni di un libro basate sul titolo cercato
//        System.out.println(ArchiveFile.getByTitle("onde"));

        // Stampa delle informazioni di un libro non presente, per verificare il comportamento del sistema
//        System.out.println(ArchiveFile.getByTitle("Harry"));



    }
}