import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

    @Test 
	public void testappend1 () {
    LinkedList test = new LinkedList();
    test.append(1);
    assertEquals(test.first(), 1);
	}

    @Test 
        public void testappend() {
        LinkedList test = new LinkedList();
        test.append(1);
        test.append(2);
        test.append(3);
        assertEquals(test.first(), 1);
        assertEquals(test.last(), 3);
    }
}
