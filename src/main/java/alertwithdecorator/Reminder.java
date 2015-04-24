package alertwithdecorator;

import java.time.LocalDateTime;

/**
 * Created by yang on 2015/3/21.
 */

public interface Reminder {
    boolean shouldRemind(LocalDateTime sitedTime, LocalDateTime today);
}
