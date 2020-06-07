import instruments.stringInstruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Fender Stratocaster", "Electric Guitar", "Birchwood", "Black", 250.00, 300.00, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Fender Stratocaster", guitar.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Electric Guitar", guitar.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Birchwood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(250.00, guitar.getPriceBought(), 0.1);
    }

    @Test
    public void hasPriceSold() {
        assertEquals(300.00, guitar.getPriceSold(), 0.1);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.00, guitar.calculateMarkup(), 0.1);
    }

    @Test
    public void canPlay() {
        assertEquals("Grung", guitar.play());
    }
}
