package todo;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.Assert.*;

/**
 * Created by yang on 2015/4/27.
 */
public class TodoTest {
    private Todo todo;
    private LocalTime rightNow;

    @Before
    public void setUp() throws Exception {
        todo = new Todo(
                "birthday",
                TodoType.IMPORT);
        rightNow = LocalTime.now();
        todo.AlertAt(rightNow.atDate(LocalDate.now()));
    }

    @Test
    public void testAlertAt() throws Exception {
        assertTrue(todo.shouldAlert(rightNow));
    }

    @Test
    public void testIsFinished() throws Exception {

    }

    @Test
    public void testGetTitle() throws Exception {
        assertEquals("birthday", todo.getTitle());
    }

    @Test
    public void testTodoType() throws Exception {
        assertEquals(TodoType.IMPORT, todo.todoType());
    }
}