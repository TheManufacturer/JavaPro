import static org.junit.Assert.assertEquals;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.junit.Test;

public class MainTest {
    Main mainT = new Main();

    @Test
    public void testFirstPrint() {
        // Input: data in formato stringa
        String inputDate = "2023-03-01T13:00:00Z";

        // Creazione di un oggetto OffsetDateTime dal formato stringa
        OffsetDateTime dateConv = OffsetDateTime.parse(inputDate);

        // Formattazione della data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String actual = dateConv.format(formatter);

        // Verifica che la data formattata sia quella attesa
        String expected = "01 marzo 2023";
        assertEquals("Error with Format Date", expected, actual);
    }


    @Test
    public void testMetodoAddSevenD() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        mainT.metodoAddSevenD(dateConv);
        OffsetDateTime expected = dateConv.plusDays(7);
        assertEquals(dateConv.plusDays(7), expected);
    }

    @Test
    public void testMetodoAddOneM() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        mainT.metodoAddOneM(dateConv);
        OffsetDateTime expected = dateConv.plusMonths(1); 
        assertEquals(dateConv.plusMonths(1), expected);
    }

    @Test
    public void testMetodoAddOneY() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        mainT.metodoAddOneY(dateConv);
        OffsetDateTime expected = dateConv.plusYears(1); 
        assertEquals(dateConv.plusYears(1), expected);
    }

    // checkLocalized
    @Test
    public void testMetodoDateLocalized() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        String expected = dateConv.format(DateTimeFormatter.ofPattern("yyyy", Locale.ITALY)); 
        String actual = "2024";
        assertEquals(actual, expected);
    }
}

/*testMetodoDateLocalized--> 2024-03-01T13:00Z */