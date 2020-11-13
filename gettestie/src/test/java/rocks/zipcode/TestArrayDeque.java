package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {

    @Test
    public void testAdd(){
        Deque<Integer> testDeque = new ArrayDeque<>();
        testDeque.add(10);
        testDeque.add(20);
        testDeque.add(30);
        testDeque.add(40);
        Assert.assertTrue(testDeque.contains(30));
    }

}
