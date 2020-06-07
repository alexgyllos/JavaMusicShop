import org.junit.Before;
import org.junit.Test;
import other.guitarAccessories.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("Nylon Guitar Strings", 3.00, 7.00);
    }

    @Test
    public void hasName() {
        assertEquals("Nylon Guitar Strings", guitarStrings.getName());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(3.00, guitarStrings.getPriceBought(), 0.1);
    }

    @Test
    public void hasPriceSold() {
        assertEquals(7.00, guitarStrings.getPriceSold(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.00, guitarStrings.calculateMarkup(), 0.1);
    }
}
