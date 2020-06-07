import resources.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;
    private int till;

    public MusicShop() {
        this.stock = new ArrayList<ISell>();
        this.till = 0;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public int getTill() {
        return till;
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public double potentialProfits() {
        double potentialProfits = 0;
        for(ISell item: this.stock) {
           potentialProfits += item.calculateMarkup();
        }
        return potentialProfits;
    }
}
