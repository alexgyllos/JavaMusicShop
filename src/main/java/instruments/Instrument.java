package instruments;

import resources.IPlay;
import resources.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String name;
    private String type;
    private String material;
    private String colour;
    private double priceBought;
    private double priceSold;

    public Instrument(String name, String type, String material, String colour, double priceBought, double priceSold) {
        this.name = name;
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }

    public double calculateMarkup() {
        return (priceSold - priceBought);
    }
}
