package objects;


public class Item extends Description{

    int coins;

    Item(String iName, String iDescription, int coins){
        super(iName, iDescription);
        this.coins = coins;
    }

    public int getCoins() {
        return coins;
    }
}
