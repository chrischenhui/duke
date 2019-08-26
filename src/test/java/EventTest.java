import duke.task.Event;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest {
    @Test
    public void EventTest() {
        System.out.println("EventTest starts");
        Event event = new Event("testing", "11/11/11 11:11");
        assertEquals("[E][✘] testing (at: Fri Nov 11 11:11:00 SGT 2011)", event.toString());
        assertEquals("E | 0 | testing | 11/11/11 11:11", event.toWriteFile());
        System.out.println("EventTest Pass");
    }
}
