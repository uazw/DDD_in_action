package alertwithdecorator;

import java.time.LocalDateTime;

/**
 * Created by yang on 2015/4/24.
 */
public class DefaultReminder implements Reminder {
    @Override
    public boolean shouldRemind(LocalDateTime localDateTime) {
        return true;
    }
}
