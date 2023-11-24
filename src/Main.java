import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z + Stampa per
        // confronto

        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataConvertita = dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println("\n La Stringa --> 2023-03-01T13:00:00Z \n diventa : " + dataConvertita);

        // Aggiungi 7 giorni + stampa

        metodoAddSevenD(dateConv);

        // Aggiungi un mese (con MMMM è esteso) + stampa

        metodoAddOneM(dateConv);

        // Aggiungi un anno anno (yyyy) + stampa
        metodoAddOneY(dateConv);

        // Stampa il risultato localizzata per l'Italia
        metodoDateLocalized(dateConv);
    }

    public static void metodoDateLocalized(OffsetDateTime dateConv) {
        String dataLocalizzata = dateConv.format(DateTimeFormatter.ofPattern("yyyy", Locale.ITALY));
        System.out.println("\n Data in formato ITALY : " + dataLocalizzata);
    }

    public static void metodoAddOneY(OffsetDateTime dateConv) {
        OffsetDateTime dataRevisionataY = dateConv.plusYears(1);
        System.out.println("\n L'anno aumentato di 1 : " + dataRevisionataY);

        String dataYearFormattata = dataRevisionataY.format(DateTimeFormatter.ofPattern("yyyy"));

        System.out.println("\n L'anno aumentato di 1 (formattato): " + dataYearFormattata);
    }

    public static void metodoAddOneM(OffsetDateTime dateConv) {
        System.out.println("\n Il mese aumentato di 1 : " + dateConv.plusMonths(1));
    }

    public static void metodoAddSevenD(OffsetDateTime dateConv) {
        System.out.println("\n Il giorno aumentato di 7: " + dateConv.plusDays(7));
    }
}

/*
 * Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
 * aggiungi un anno
 * sottrai un mese
 * aggiungi 7 giorni
 * Stampa il risultato localizzata per l'Italia
 * Crea dei test per questo esercizio
 */