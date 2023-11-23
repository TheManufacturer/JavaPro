import static org.junit.Assert.assertEquals;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.Test;

public class MainTest {
    Main mainT = new Main();

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
    public void testMetodoGiorno() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Main.metodoGiorno(dateConv);
        String aspected = dateConv.format(DateTimeFormatter.ofPattern("dd"));
        String actual = "01";
        assertEquals(aspected, actual);
    }

    @Test
    public void testMetodoGiornoSettimana() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Main.metodoGiorno(dateConv);
        String aspected = dateConv.format(DateTimeFormatter.ofPattern("EEEE"));
        String actual = "mercoledì";
        assertEquals(aspected, actual);
    }

    @Test
    public void testMetodoMese() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Main.metodoGiorno(dateConv);
        String aspected = dateConv.format(DateTimeFormatter.ofPattern("MMMM"));
        String actual = "marzo";
        assertEquals(aspected, actual);
    }

    @Test
    public void testMetodoAnno() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Main.metodoGiorno(dateConv);
        String aspected =  dateConv.format(DateTimeFormatter.ofPattern("yyyy"));
        String actual = "2023";
        assertEquals(aspected, actual);
    }
    
}
