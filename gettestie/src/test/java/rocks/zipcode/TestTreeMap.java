package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestTreeMap {

    @Test
    public void Testput(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(24, "Kobe Bryant");
        Assert.assertTrue(treeMap.containsKey(24));
    }

}
