package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void testAddAll(){

        TreeSet<String> testTree = new TreeSet<>();
        testTree.add("This");
        testTree.add("adds");
        testTree.add("elements");

        Collection<String> newCollect = new ArrayList<String>();
        newCollect.add("to");
        newCollect.add("the");
        newCollect.add("Linked");
        newCollect.add("List");

        testTree.addAll(newCollect);
        Assert.assertTrue(testTree.containsAll(newCollect));

    }

}
