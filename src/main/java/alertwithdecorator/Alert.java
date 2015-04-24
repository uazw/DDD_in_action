package alertwithdecorator;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by yang on 2015/3/21.
 */
public class Alert {
    private final DateRange dateRange;
    private final Reminder reminder;
    private final LocalTime alertTime;

    public Alert(LocalTime alertTime,
                DateRange dateRange,
                Reminder reminder) {

        this.dateRange = dateRange;
        this.reminder = reminder;
        this.alertTime = alertTime;
    }


    public boolean shouldAlert(LocalDateTime time) {
        return dateRange.isBetween(time) &&
                reminder.shouldRemind(time) &&
                alertTime.equals(time.toLocalTime());
    }

}
