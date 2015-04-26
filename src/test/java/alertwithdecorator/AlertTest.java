package alertwithdecorator;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.Assert.*;

/**
 * Created by yang on 2015/4/24.
 */
public class AlertTest {


    @Test
    public void testShouldAlert() throws Exception {
        LocalTime rightNow = LocalTime.now();

        Alert alert = new Alert(
                rightNow,
                new DateRange(LocalDate.MIN, LocalDate.MAX),
                new DefaultReminder());

        assertTrue(alert.shouldAlert(rightNow.atDate(LocalDate.now())));
    }
}