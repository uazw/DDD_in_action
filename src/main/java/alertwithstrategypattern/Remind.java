package alertwithstrategypattern;

import java.time.LocalDateTime;

/**
 * Created by yang on 2015/3/21.
 */

@FunctionalInterface
public interface Remind<T extends LocalDateTime> {
    boolean isRemind(T localDateTime);
}
