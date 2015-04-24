package alertwithdecorator;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.Assert.*;

/**
 * Created by yang on 2015/4/24.
 */
public class DaysReminderTest {

    @Test
    public void testShouldRemind() throws Exception {
        LocalTime rightNow = LocalTime.now();

        Alert alert = new Alert(
                rightNow,
                new DateRange(LocalDate.MIN, LocalDate.MAX),
                new DaysReminder(new DefaultReminder(), 1));

        assertTrue(alert.shouldAlert(rightNow.atDate(LocalDate.now()).plusDays(1)));
    }

}