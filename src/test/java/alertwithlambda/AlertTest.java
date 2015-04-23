package alertwithlambda;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * Created by yang on 2015/4/23.
 */
public class AlertTest {
    private Alert alert;
    private DateRange dateRange;

    @Before
    public void setUp() throws Exception {
        dateRange = new DateRange(LocalDateTime.MIN, LocalDateTime.MAX);
        alert = new Alert(dateRange, (x)->
                x.getDayOfWeek().equals(DayOfWeek.THURSDAY));
    }

    @Test
    public void testStartAt() throws Exception {

    }

    @Test
    public void testEndAt() throws Exception {

    }


    @Test
    public void testShouldAlert() throws Exception {
        assertTrue(alert.shouldAlert(LocalDateTime.now()));
    }
}