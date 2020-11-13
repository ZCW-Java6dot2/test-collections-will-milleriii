package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Collection;
import java.util.ArrayList;

public class TestLinkedList {

    @Test
    public void testAdd(){

        LinkedList<String> testL = new LinkedList<>();
        testL.add("This");
        testL.add("adds");
        testL.add("elements");
        Assert.assertTrue(testL.contains("adds"));
    }

    @Test
    public void testAddAll(){
        LinkedList<String> testL = new LinkedList<>();
        testL.add("This");
        testL.add("adds");
        testL.add("elements");

        Collection<String> newCollect = new ArrayList<String>();
        newCollect.add("to");
        newCollect.add("the");
        newCollect.add("Linked");
        newCollect.add("List");

        testL.addAll(newCollect);
        Assert.assertTrue(testL.containsAll(newCollect));

    }
}
