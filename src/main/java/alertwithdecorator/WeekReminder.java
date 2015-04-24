package alertwithdecorator;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yang on 2015/4/24.
 */
public class WeekReminder implements Reminder {
    private Set<DayOfWeek> weekSet = new HashSet<>();
    private Reminder reminder;

    public WeekReminder(Reminder reminder, DayOfWeek...weeks) {
        this.reminder = reminder;
        weekSet.addAll(Arrays.asList(weeks));
    }

    @Override
    public boolean shouldRemind(LocalDateTime sitedTime, LocalDateTime today) {
        return reminder.shouldRemind(sitedTime, today) &&
                weekSet.contains(today.getDayOfWeek());
    }
}
