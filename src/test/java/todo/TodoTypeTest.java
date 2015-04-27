package todo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yang on 2015/4/27.
 */
public class TodoTypeTest {

    @Test
    public void testIsImportant() throws Exception {
        assertTrue(TodoType.IMPORT_URGENT.isImportant());
        assertFalse(TodoType.NORMAL.isImportant());
    }

    @Test
    public void testIsUrgent() throws Exception {
        assertTrue(TodoType.IMPORT_URGENT.isUrgent());
        assertFalse(TodoType.NORMAL.isUrgent());
    }
}