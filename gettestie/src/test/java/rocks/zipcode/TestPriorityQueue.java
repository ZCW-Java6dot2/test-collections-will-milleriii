package rocks.zipcode;

import org.junit.Test;

import java.util.PriorityQueue;
import static org.junit.Assert.*;
public class TestPriorityQueue {

    @Test
    public void testPriorityQueue(){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("This ");
        queue.add("is ");
        queue.add("a ");
        queue.add("priority ");
        queue.add("queue.");

        String expected = "This ";
        String actual = queue.poll();
        assertEquals(actual, expected);
    }

}
