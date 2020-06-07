import instruments.keyInstruments.Piano;
import instruments.stringInstruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Yamaha Grand", "Grand Piano", "Birchwood", "Black", 550.00, 850.00, 88);
    }

    @Test
    public void hasName() {
        assertEquals("Yamaha Grand", piano.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Grand Piano", piano.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Birchwood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(550.00, piano.getPriceBought(), 0.1);
    }

    @Test
    public void hasPriceSold() {
        assertEquals(850.00, piano.getPriceSold(), 0.1);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(300.00, piano.calculateMarkup(), 0.1);
    }

    @Test
    public void canPlay() {
        assertEquals("Tada", piano.play());
    }
}
