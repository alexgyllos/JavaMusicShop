import instruments.brassInstruments.Saxophone;
import instruments.keyInstruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("Yamaha", "Tenor Sax", "Brass", "Black", 550.00, 850.00, 12);
    }

    @Test
    public void hasName() {
        assertEquals("Yamaha", saxophone.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Tenor Sax", saxophone.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", saxophone.getColour());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(550.00, saxophone.getPriceBought(), 0.1);
    }

    @Test
    public void hasPriceSold() {
        assertEquals(850.00, saxophone.getPriceSold(), 0.1);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(12, saxophone.getNumberOfValves());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(300.00, saxophone.calculateMarkup(), 0.1);
    }

    @Test
    public void canPlay() {
        assertEquals("Vuvu", saxophone.play());
    }
}
