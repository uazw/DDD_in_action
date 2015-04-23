package alertwithlambda;

import alertwithstrategypattern.Remind;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by yang on 2015/3/21.
 */
public class Alert {
    private final DateRange dateRange;
    private final Predicate<LocalDateTime> predicate;
    private final LocalTime alertTime;

    public Alert(DateRange dateRange, Predicate<LocalDateTime> predicate, LocalTime alertTime) {
        this.dateRange = dateRange;
        this.predicate = predicate;
        this.alertTime = alertTime;
    }


    public boolean shouldAlert(LocalDateTime time) {
        return dateRange.isBetween(time) &&
                predicate.test(time) &&
                alertTime.equals(time.toLocalTime());
    }

}
