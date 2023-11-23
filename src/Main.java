import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        // Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z + Stampa

        OffsetDateTime dateConv = OffsetDateTime.parse("2002-03-01T13:00:00Z"); 

        System.out.println("\n La Stringa --> 2002-03-01T13:00:00Z diventa : " +
                dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        System.out.println("\n La Stringa --> 2002-03-01T13:00:00Z diventa : " +
                dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        System.out.println("\n La Stringa --> 2002-03-01T13:00:00Z diventa : " +
                dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

    }
}

/*
 * Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
 * 
 * Formatta la data ottenuta in FULL, MEDIUM e SHORT
 * 
 * Stampa le varie versioni
 * 
 * Crea dei test per questo esercizio
 * 
 */