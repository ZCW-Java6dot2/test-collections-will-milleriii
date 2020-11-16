package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    //write a test for isEmpty(), push(), pop(), and peak();


    @Test
    public void isEmpty(){
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.pop();
        assertTrue(stack.isEmpty());

    }

    @Test
    public void pustTest(){
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void peakTest(){
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        String peek = stack.peek();
        assertEquals("Hello world", peek);
    }
}
