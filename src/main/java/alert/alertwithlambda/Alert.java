package alert.alertwithlambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.BiPredicate;

/**
 * Created by yang on 2015/3/21.
 */
public class Alert {
    private final DateRange dateRange;
    private final BiPredicate<LocalDateTime, LocalDateTime> predicate;
    private final LocalTime alertTime;

    public Alert(LocalTime alertTime,
                DateRange dateRange,
                BiPredicate<LocalDateTime, LocalDateTime> predicate) {

        this.dateRange = dateRange;
        this.predicate = predicate;
        this.alertTime = alertTime;
    }


    public boolean shouldAlert(LocalDateTime time) {
        return dateRange.isBetween(time) &&
                predicate.test(alertTime.atDate(LocalDate.now()), time) &&
                alertTime.equals(time.toLocalTime());
    }

}
