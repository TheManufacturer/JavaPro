import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        // Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z + Stampa per
        // confrontare

        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataConvertita = dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println("La Stringa --> 2023-03-01T13:00:00Z diventa : " + dataConvertita);

        // Ottieni giorno + stampa

        String dataGiorno = dateConv.format(DateTimeFormatter.ofPattern("dd"));

        System.out.println("Il giorno : " + dataGiorno);

        // Ottieni giorno settimana + stampa

        String dataGiornoSettimana = dateConv.format(DateTimeFormatter.ofPattern("EEEE"));

        System.out.println("Il giorno : " + dataGiornoSettimana);

        // Ottieni mese (con MMMM è esteso) + stampa

        String dataMese = dateConv.format(DateTimeFormatter.ofPattern("MMMM"));

        System.out.println("Il giorno : " + dataMese);

        // Ottieni anno (yyyy) + stampa

        String datAnno = dateConv.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("L'anno : " + datAnno);

    }
}

/*
 * Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
 * ottieni l'anno
 * ottieni il mese
 * ottieni il giorno
 * ottieni il giorno della settimana
 * Stampa i risultati sulla console
 */