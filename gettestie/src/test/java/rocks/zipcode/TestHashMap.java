package rocks.zipcode;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {
    private static HashMap<String, Integer> mapTest;
    @Test
    public void testIsEmpty() {

        HashMap<String, Integer> mapTest = new HashMap<>();
        Assert.assertTrue(mapTest.isEmpty());
        mapTest.put("Alex", 20);
        mapTest.put("Bob", 40);
        mapTest.put("Cam", 60);
        Assert.assertTrue(mapTest.containsValue(40));

    }

    @Test
    public void testContainsValue(){
        HashMap<String, Integer> mapTest = new HashMap<>();

        mapTest.put("Alex", 20);
        mapTest.put("Bob", 40);
        mapTest.put("Cam", 60);
        Assert.assertTrue(mapTest.containsValue(40));
    }

    @Test
    public void testContainsKey(){
        HashMap<String, Integer> mapTest = new HashMap<>();

        mapTest.put("Alex", 20);
        mapTest.put("Bob", 40);
        mapTest.put("Cam", 60);
        Assert.assertTrue(mapTest.containsKey("Cam"));
    }
}
