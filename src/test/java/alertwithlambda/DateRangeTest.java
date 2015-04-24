package alertwithlambda;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * Created by yang on 2015/4/23.
 */
public class DateRangeTest {
    private DateRange dateRange;

    @Before
    public void setUp() throws Exception {
        dateRange = new DateRange(
                LocalDate.MIN,
                LocalDate.MAX);
    }

    @Test
    public void testIsBetween() throws Exception {
        assertTrue(dateRange.isBetween(LocalDateTime.now()));
    }
}