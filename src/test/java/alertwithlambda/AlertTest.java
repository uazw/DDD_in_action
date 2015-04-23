package alertwithlambda;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by yang on 2015/4/23.
 */
public class AlertTest {
    private Alert alert;
    private DateRange dateRange;

    @Before
    public void setUp() throws Exception {
        dateRange = new DateRange(LocalDateTime.MIN, LocalDateTime.MAX);
        alert = new Alert(dateRange,
                (settedDate, today)-> settedDate.plusDays(2).equals(today),
                LocalTime.of(14, 22, 22));
    }

    @Test
    public void testShouldAlert() throws Exception {
        LocalDateTime testTime = LocalDateTime.of(1994, 05, 28, 14, 22, 22);
        assertTrue(testTime.toLocalTime().equals(LocalTime.of(14, 22, 22)));
        assertTrue(alert.shouldAlert(testTime));
        assertFalse(alert.shouldAlert(LocalDateTime.now()));
    }
}