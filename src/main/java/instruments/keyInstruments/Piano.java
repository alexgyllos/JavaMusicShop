package instruments.keyInstruments;

import instruments.Instrument;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String name, String type, String material, String colour, double priceBought, double priceSold, int numberOfKeys) {
        super(name, type, material, colour, priceBought, priceSold);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Tada";
    }
}
