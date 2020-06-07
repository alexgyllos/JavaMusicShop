package other;

import resources.ISell;

public abstract class Other implements ISell {

    private String name;
    private double priceBought;
    private double priceSold;

    public Other(String name, double priceBought, double priceSold) {
        this.name = name;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getName() {
        return name;
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
