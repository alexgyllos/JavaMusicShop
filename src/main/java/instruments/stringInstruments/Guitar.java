package instruments.stringInstruments;

import instruments.Instrument;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String name, String type, String material, String colour, double priceBought, double priceSold, int numberOfStrings) {
        super(name, type, material, colour, priceBought, priceSold);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Grung";
    }
}
