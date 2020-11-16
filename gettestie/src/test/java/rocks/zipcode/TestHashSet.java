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

    @Test
    public void testAdd(){
        HashSet<String> sports =new HashSet<String>();
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Soccer");


        Integer setExpected = 3;
        Integer setActual = sports.size();

        assertEquals(setExpected, setActual);
    }

}
