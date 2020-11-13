package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;

public class TestHashSet {

    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){

    }

    @Test
    public void testIsEmpty(){
        HashSet<Integer> set = new HashSet<>();
        assertTrue(set.isEmpty());
        set.add(21);
        assertTrue(set.contains(21));

    }

}
