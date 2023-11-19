import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z + Stampa per confronto

        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataConvertita = dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println("\n La Stringa --> 2023-03-01T13:00:00Z diventa : " + dataConvertita);


        // Aggiungi 7 giorni + stampa

        System.out.println("\n Il giorno aumentato di 7: " + dateConv.plusDays(7));

        // Aggiungi un mese (con MMMM è esteso) + stampa

        System.out.println("\n Il mese aumentato di 1 : " + dateConv.plusMonths(1));

        // Aggiungi un anno anno (yyyy) + stampa

        OffsetDateTime dataRevisionataY = dateConv.plusYears(1);
        System.out.println("\n L'anno aumentato di 1 : " + dataRevisionataY);

        String dataYearFormattata = dataRevisionataY.format(DateTimeFormatter.ofPattern("yyyy"));

        System.out.println("\n L'anno aumentato di 1 (formattato): " + dataYearFormattata);

        // Stampa il risultato localizzata per l'Italia
        String dataLocalizzata = dateConv.format(DateTimeFormatter.ofPattern("yyyy", Locale.ITALY));
        System.out.println("\n Data in formato ITALY : " + dataLocalizzata);



    }
}

/*
 * Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
 * aggiungi un anno
 * sottrai un mese
 * aggiungi 7 giorni
 * Stampa il risultato localizzata per l'Italia
 */