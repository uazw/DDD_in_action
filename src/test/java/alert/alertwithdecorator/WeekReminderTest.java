package alert.alertwithdecorator;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.Assert.*;

/**
 * Created by yang on 2015/4/24.
 */
public class WeekReminderTest {

    @Test
    public void testShouldRemind() throws Exception {
        WeekReminder weekReminder =
                new WeekReminder(new DefaultReminder(), DayOfWeek.FRIDAY, DayOfWeek.MONDAY);

        LocalTime rightNow = LocalTime.now();

        Alert alert = new Alert(
                rightNow,
                new DateRange(LocalDate.MIN, LocalDate.MAX),
                weekReminder);

        assertTrue(alert.shouldAlert(rightNow.atDate(LocalDate.now())));

    }
}