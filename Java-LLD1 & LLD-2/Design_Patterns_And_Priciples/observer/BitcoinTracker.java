package Design_Patterns_And_Priciples.observer;


// concrete observable class
public class BitcoinTracker extends Observable {
    private Bitcoin bitcoin;

    public void setPrice(double price) {
        bitcoin.setPrice(price);
        notifyObservers();
    }
}
