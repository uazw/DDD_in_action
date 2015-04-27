package alert.alertwithlambda;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
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
        alert = new Alert(
                LocalTime.now(),
                new DateRange(LocalDate.MIN, LocalDate.MAX),
                (x, y) -> true);
    }

    @Test
    public void testShouldAlert() throws Exception {
        assertTrue(alert.shouldAlert(LocalDateTime.now()));
    }
}