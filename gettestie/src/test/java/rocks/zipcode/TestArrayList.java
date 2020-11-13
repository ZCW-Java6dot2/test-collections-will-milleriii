package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class TestArrayList {
    private static ArrayList<String> person;
    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){

    }

    @Test
    public void testAdd(){
        ArrayList<String> person = new ArrayList<String>();
        person.add("Alex");
        person.add("Bob");
        person.add("Cam");

        Assert.assertTrue(person.contains("Bob"));
    }
}
