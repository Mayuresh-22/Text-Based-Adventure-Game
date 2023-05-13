package objects;

import java.util.ArrayList;


// Class to Manage the Inventory of the Player
public class Inventory{

    // Players Inventory
    public ArrayList<Item> inventory = new ArrayList<Item>();

    // Adding Item to the inventory
    public void addInvent(Item item){
        this.inventory.add(item);
    }

    // Check whether items contains in the inventory
    public int contains(Item item){
        return inventory.contains(item);
    }

    // Removing Item from the inventory
    public Item remInvent(Item item){
        return this.inventory.remove(this.inventory.indexOf(item));
    }
}
