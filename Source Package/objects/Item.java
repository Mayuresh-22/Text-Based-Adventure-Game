package objects;


// Class for Collectables Items
public class Item extends Description{
    int coins;

    // Intialize Item Name/Description
    public Item(String iName, String iDescription, int coins){
        super(iName, iDescription);
        this.coins = coins;
    }

    // Returns coins player will get after using the item
    public int getCoins() {
        return coins;
    }
}
