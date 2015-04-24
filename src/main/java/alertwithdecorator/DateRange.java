package alertwithdecorator;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by yang on 2015/4/23.
 */
public final class DateRange {
    private final LocalDate startDate;
    private final LocalDate endDate;

    public DateRange(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public boolean isBetween(LocalDateTime time) {
        return time.toLocalDate().isAfter(startDate) && time.toLocalDate().isBefore(endDate);
    }
}
