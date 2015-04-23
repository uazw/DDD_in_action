package alertwithlambda;

import alertwithstrategypattern.Remind;

import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by yang on 2015/3/21.
 */
public class Alert {
    private final DateRange dateRange;
    private final Predicate<LocalDateTime> predicate;

    public Alert(DateRange dateRange, Predicate<LocalDateTime> predicate) {
        this.dateRange = dateRange;
        this.predicate = predicate;
    }

    public boolean shouldAlert(LocalDateTime time) {
        return dateRange.isBetween(time) &&
                predicate.test(time);
    }

}
