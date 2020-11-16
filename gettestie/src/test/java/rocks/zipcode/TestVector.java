package rocks.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Vector;

public class TestVector {

    @Test
    public void addVectorTest(){
        Vector<String> games = new Vector<>();
        games.add("Halo");
        games.add("COD");
        games.add("Valorant");
        games.add("CSGO");
        games.add(2, "Fortnite");

        String expectedGame = "Fortnite";
        String actualGame = games.get(2);

        assertEquals(expectedGame, actualGame);
    }
}
