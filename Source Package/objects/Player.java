package objects;


// Class to Manage Players Property and Actions
public class Player extends Description{
    int location = 0;
    public int totalCoins=0;
    public Player(){super("", "");};

    public Player(String pName, String pDescription, int totalCoins){
        super(pName, pDescription);
        this.totalCoins = totalCoins;
    }

    public int getLocation(){
        return location;
    }

    public int getTotalCoins() {
        return totalCoins;
    }

    public void moveToLocation(int location){
        this.location = location; 
    }

    // serializing object
    @Override
    public String toString() {
		return "\n";
	}
}
