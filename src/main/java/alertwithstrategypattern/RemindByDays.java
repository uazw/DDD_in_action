package alertwithstrategypattern;

import java.time.LocalDateTime;

/**
 * Created by yang on 2015/3/21.
 */
public class RemindByDays implements Remind<LocalDateTime> {
    @Override
    public boolean isRemind(LocalDateTime localDateTime) {
        return false;
    }
}
