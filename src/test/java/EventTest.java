import models.Events;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Events testEvent = new Events ();
//        assertTrue(testEvent instanceof Events);
        assertEquals(true,"Great, lets start with the number of guests. Type 'more than 20' or 'less than 20' for number of people attending");
    }

}
