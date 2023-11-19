import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime esercizioDate = OffsetDateTime.of(2002, 03, 01, 13, 00, 00, 0, ZoneOffset.UTC);

        String formatDataFull = esercizioDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("La data richiesta nel formato FULL : " + formatDataFull);

        String formatDataMedium = esercizioDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("La data richiesta nel formato MEDIUM : " + formatDataMedium);

        String formatDataShort = esercizioDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("La data richiesta nel formato SHORT : " + formatDataShort);

    }
}

/*
 * Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
 * Formatta la data ottenuta in FULL, MEDIUM e SHORT
 * Stampa le varie versioni
 */