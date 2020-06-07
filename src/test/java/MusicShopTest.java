import instruments.brassInstruments.Saxophone;
import instruments.keyInstruments.Piano;
import instruments.stringInstruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import other.guitarAccessories.GuitarPicks;
import other.guitarAccessories.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Guitar guitar;
    Piano piano;
    Saxophone saxophone;
    GuitarPicks guitarPicks;
    GuitarStrings guitarStrings;

    @Before
    public void setUp() throws Exception {
        musicShop = new MusicShop();
        piano = new Piano("Yamaha Grand", "Grand Piano", "Birchwood", "Black", 550.00, 850.00, 88);
        saxophone = new Saxophone("Yamaha", "Tenor Sax", "Brass", "Black", 550.00, 850.00, 12);
        guitar = new Guitar("Fender Stratocaster", "Electric Guitar", "Birchwood", "Black", 250.00, 300.00, 6);
        guitarStrings = new GuitarStrings("Nylon Guitar Strings", 3.00, 7.00);
        guitarPicks = new GuitarPicks("Nylon Guitar Picks", 3.00, 7.00);
    }

    @Test
    public void stockStartEmpty() {
        assertEquals(0, musicShop.getStock().size());
        assertEquals(true, musicShop.getStock().isEmpty());
    }

    @Test
    public void tillStartsEmpty() {
        assertEquals(0, musicShop.getTill());
    }

    @Test
    public void canAddItem() {
        musicShop.addItem(guitar);
        assertEquals(1, musicShop.getStock().size());
    }

    @Test
    public void canRemoveItem() {
        musicShop.addItem(guitar);
        musicShop.removeItem(guitar);
        assertEquals(0, musicShop.getStock().size());
    }

    @Test
    public void canCalculatePotentialProfits() {
        musicShop.addItem(guitar);
        musicShop.addItem(guitar);
        assertEquals(100.00, musicShop.potentialProfits(), 0.1);
    }
}
