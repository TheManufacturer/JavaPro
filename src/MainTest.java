 
import static org.junit.Assert.assertEquals;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.junit.Test;

public class MainTest {

    Main mainT = new Main();
    OffsetDateTime dateConv = OffsetDateTime.parse("2002-03-01T13:00:00Z"); 

    @Test
    public void testFirstPrint() { 

        String expected = "01/03/02" ; 
        String actual  = dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        assertEquals("Error with Short Format Date",  expected,  actual);

    }
    @Test
    public void testSecondPrint() { 

        String expected = "1 mar 2002" ; 
        String actual  = dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        assertEquals("Error with Short Format Date",  expected,  actual);

    }
    @Test
    public void testThirdPrint() { 

        String expected = "venerdì 1 marzo 2002" ; 
        String actual  = dateConv.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        assertEquals("Error with Short Format Date",  expected,  actual);

    } 
 
} 