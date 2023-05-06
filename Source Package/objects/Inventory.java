package objects;

import java.util.ArrayList;


public class Inventory{

    // Players Inventory
    public ArrayList<Item> inventory = new ArrayList<Item>(null);

    // Adding Item to the inventory
    public void addInvent(Item item){
        this.inventory.add(item);
    }

    // Removing Item from the inventory
    public Item remInvent(Item item){
        return this.inventory.remove(this.inventory.indexOf(item));
    }
}
