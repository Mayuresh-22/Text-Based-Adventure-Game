package objects;

import java.util.ArrayList;


// Class to Manage the Inventory of the Player
public class Inventory extends Description{

    // Players Inventory
    public ArrayList<Item> inventory = new ArrayList<Item>();

    public Inventory(){
        super("Player's Inventory", "A place where user can store all the game collactibles");
    }

    // Adding Item to the inventory
    public void addInvent(Item item){
        this.inventory.add(item);
    }

    // Check whether items contains in the inventory
    public boolean contains(Item item){
        return inventory.contains(item);
    }

    // Removing Item from the inventory
    public Item remInvent(Item item){
        return this.inventory.remove(this.inventory.indexOf(item));
    }
}
