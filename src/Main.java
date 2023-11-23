import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public void main(String[] args) {

        // Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z + Stampa

        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataConvertita = dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("\n La Stringa --> 2023-03-01T13:00:00Z diventa : " + dataConvertita);

        // Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z + Stampa

        OffsetDateTime dateConv2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        String dataConvertita2 = dateConv2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("\n La Stringa --> 2024-03-01T13:00:00Z diventa : " + dataConvertita2);

        // Verificare che la prima data è precedente alla seconda + stampa

        System.out.println("\n La prima data è precedente alla seconda ? " + metodoBefore(dateConv, dateConv2));

        // Verificare che la seconda data è successiva alla prima + stampa

        System.out.println("\n La seconda data è successiva alla prima ? " + metodoAfter(dateConv, dateConv2));

        // Verificare che le due date sono uguali ad ora + stampa
        System.out.println("\n Le date inserite sono uguali ? " + metodoEqualDate(dateConv, dateConv2));
    }

    public boolean metodoBefore(OffsetDateTime dateConv, OffsetDateTime dateConv2) {
        boolean date1Before2 = dateConv.isBefore(dateConv2);
        return date1Before2;
    }

    public boolean metodoAfter(OffsetDateTime dateConv, OffsetDateTime dateConv2) {
        boolean date2After1 = dateConv2.isAfter(dateConv);
        return date2After1;
    }

    public boolean metodoEqualDate(OffsetDateTime dateConv, OffsetDateTime dateConv2){
        boolean dateEqual = dateConv.equals(dateConv2);
        return dateEqual;
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
/*
 * Riprendi uno degli esercizi già svolti e corretti
 * Aggiungi Junit al progetto
 * 
 */