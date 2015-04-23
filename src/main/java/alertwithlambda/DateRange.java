package alertwithlambda;

import java.time.LocalDateTime;

/**
 * Created by yang on 2015/4/23.
 */
public final class DateRange {
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;

    public DateRange(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean isBetween(LocalDateTime time) {
        return time.isAfter(startTime) && time.isBefore(endTime);
    }
}
