package alert.alertwithdecorator;

import java.time.LocalDateTime;

/**
 * Created by yang on 2015/4/24.
 */
public class DaysReminder implements Reminder {
    private long days;
    private Reminder reminder;

    public DaysReminder(Reminder reminder, int i) {
        days = i;
        this.reminder = reminder;
    }

    @Override
    public boolean shouldRemind(LocalDateTime sitedTime, LocalDateTime today) {
        return reminder.shouldRemind(sitedTime, today) &&
                sitedTime.plusDays(days).equals(today);
    }

}
