import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.time.OffsetDateTime;

import org.junit.Test;

public class MainTest {

    Main mainT = new Main();

    @Test
    public void testFirstMethod() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateConv2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        assertTrue(mainT.metodoAfter(dateConv, dateConv2));

    }

    @Test
    public void testSecondMethod() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateConv2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        assertTrue(mainT.metodoBefore(dateConv, dateConv2));

    }

    @Test
    public void testThirdMethod() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateConv2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        assertFalse(mainT.metodoEqualDate(dateConv, dateConv2));

    }
 
}

/* 
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.OffsetDateTime;

import org.junit.Test;

public class MainTest {

    Main mainT = new Main();

    @Test
    public void testFirstMethod() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateConv2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        assertTrue(mainT.metodoAfter(dateConv, dateConv2));

    }
        @Test
    void testSecondMethod() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateConv2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        assertTrue(mainT.metodoBefore(dateConv, dateConv2));

    }
        @Test
    void testThirdMethod() {
        OffsetDateTime dateConv = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateConv2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        assertFalse(mainT.metodoEqualDate(dateConv, dateConv2));

    }
}
 */