 import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) { 

        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");  

        //diamo un  pattern come richiesto "01" dd
        DateTimeFormatter WorkFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        //Formattiamo in una variabile String
        String DataWorkata = dateConv.format(WorkFormat);

        //Stampiamo il risultato ottenuto
        System.out.println("\n La Stringa --> 2023-03-01T13:00:00Z diventa : " + DataWorkata); 

    }
}

/*
 * Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
 * 
 * Formatta la data ottenendo 01 marzo 2023
 * 
 * Stampa sulla console
 * 
 * Crea dei test per questo esercizio
 */