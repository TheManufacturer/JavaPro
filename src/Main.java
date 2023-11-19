import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        // Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z + Stampa

        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataConvertita = dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("\n La Stringa --> 2023-03-01T13:00:00Z diventa : " + dataConvertita);

        // Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z + Stampa

        OffsetDateTime dateConv2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        String dataConvertita2 = dateConv2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("\n La Stringa --> 2023-03-01T13:00:00Z diventa : " + dataConvertita2);

        // Verificare che la prima data è precedente alla seconda + stampa

        boolean date1Before2 = dateConv.isBefore(dateConv2);
        System.out.println("\n La prima data è precedente alla seconda ? " + date1Before2);

        // Verificare che la seconda data è successiva alla prima + stampa

        boolean date2After1 = dateConv2.isAfter(dateConv);
        System.out.println("\n La seconda data è successiva alla prima ? " + date2After1);
        
        // Verificare che le due date sono uguali ad ora + stampa

        boolean equalDate = dateConv.isEqual(dateConv2);
        System.out.println("\n Le date risultano uguali ? " + equalDate);
    }
}

/*
 * Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
 * 
 * Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
 * 
 * Verificare che la prima data è precedente alla seconda
 * 
 * Verificare che la seconda data è successiva alla prima
 * 
 * Verificare che le due date sono uguali ad ora
 * 
 * Stampa il risultato
 */