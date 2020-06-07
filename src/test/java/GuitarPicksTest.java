import org.junit.Before;
import org.junit.Test;
import other.guitarAccessories.GuitarPicks;
import other.guitarAccessories.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarPicksTest {

    GuitarPicks guitarPicks;

    @Before
    public void setUp() {
        guitarPicks = new GuitarPicks("Nylon Guitar Picks", 3.00, 7.00);
    }

    @Test
    public void hasName() {
        assertEquals("Nylon Guitar Picks", guitarPicks.getName());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(3.00, guitarPicks.getPriceBought(), 0.1);
    }

    @Test
    public void hasPriceSold() {
        assertEquals(7.00, guitarPicks.getPriceSold(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.00, guitarPicks.calculateMarkup(), 0.1);
    }
}
