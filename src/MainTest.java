import static org.junit.Assert.assertEquals;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.Test;

public class MainTest {

    @Test
    public void testDateConversion() {
        // Input: data in formato stringa
        String inputDate = "2023-03-01T13:00:00Z";

        // Creazione di un oggetto OffsetDateTime dal formato stringa
        OffsetDateTime dateConv = OffsetDateTime.parse(inputDate);

        // Formattazione della data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String actualFormattedDate = dateConv.format(formatter);

        // Verifica che la data formattata sia quella attesa
        String expectedFormattedDate = "01 marzo 2023";
        assertEquals("Error with Format Date", expectedFormattedDate, actualFormattedDate);
    }

    @Test
    public void testDateSecondConversion() {
        // Input: data in formato stringa
        String inputDate = "2024-02-25T13:00:00Z";

        // Creazione di un oggetto OffsetDateTime dal formato stringa
        OffsetDateTime dateConv = OffsetDateTime.parse(inputDate);

        // Formattazione della data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String actualFormattedDate = dateConv.format(formatter);

        // Verifica che la data formattata sia quella attesa
        String expectedFormattedDate = "25 febbraio 2024";
        assertEquals("Error with Format Date", expectedFormattedDate, actualFormattedDate);
    }
}
