package instruments.brassInstruments;

import instruments.Instrument;

public class Saxophone extends Instrument {

    private int numberOfValves;

    public Saxophone(String name, String type, String material, String colour, double priceBought, double priceSold, int numberOfValves) {
        super(name, type, material, colour, priceBought, priceSold);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "Vuvu";
    }
}
