import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
        public static void main(String[] args) {

                // Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z + Stampa
                OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
                String dataConvertita = dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

                System.out.println("La Stringa --> 2023-03-01T13:00:00Z diventa : " + dataConvertita);

                // Ottieni metodoGiorno + stampa

                metodoGiorno(dateConv);

                // Ottieni metodoGiornoSettimana + stampa
                metodoGiornoSettimana(dateConv);

                // Ottieni metodoMese (con MMMM è esteso) + stampa

                metodoMese(dateConv);

                // Ottieni MetodoAnno (yyyy) + stampa

                MetodoAnno(dateConv);

        }

        private static void MetodoAnno(OffsetDateTime dateConv) {
                String datAnno = dateConv.format(DateTimeFormatter.ofPattern("yyyy"));
                System.out.println("L'anno : " + datAnno);
        }

        private static void metodoMese(OffsetDateTime dateConv) {
                String dataMese = dateConv.format(DateTimeFormatter.ofPattern("MMMM"));
                System.out.println("Il giorno : " + dataMese);
        }

        private static void metodoGiornoSettimana(OffsetDateTime dateConv) {
                String dataGiornoSettimana = dateConv.format(DateTimeFormatter.ofPattern("EEEE"));
                System.out.println("Il giorno : " + dataGiornoSettimana);
        }

        public static void metodoGiorno(OffsetDateTime dateConv) {
                String dataGiorno = dateConv.format(DateTimeFormatter.ofPattern("dd"));
                System.out.println("Il giorno : " + dataGiorno);
        }
}

/*
 * Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
 * ottieni l'anno
 * ottieni il mese
 * ottieni il giorno
 * ottieni il giorno della settimana
 * Stampa i risultati sulla console
 * Crea dei test per questo esercizio
 */