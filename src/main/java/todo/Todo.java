package todo;

import alert.alertwithlambda.Alert;
import alert.alertwithlambda.DateRange;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by yang on 2015/4/27.
 */
public class Todo {

    private String title;
    private Alert alert;
    private TodoType todoType;
    private boolean finished;

    public Todo(String title, TodoType todoType) {
        this.title = title;
        this.todoType = todoType;
        this.finished = false;
    }

    public void AlertAt(LocalDateTime alertTime) {
        this.alert = new Alert(
                alertTime.toLocalTime(),
                new DateRange(LocalDate.MIN, alertTime.toLocalDate()),
                (x, y) -> x.equals(y)
        );
    }

    public boolean isFinished() {
        return finished;
    }

    public String getTitle() {
        return title;
    }

    public TodoType todoType() {
        return this.todoType;
    }


    public boolean shouldAlert(LocalTime alertTime) {
        if (alert.shouldAlert(alertTime.atDate(LocalDate.now()))) return true;
        return false;
    }
}
