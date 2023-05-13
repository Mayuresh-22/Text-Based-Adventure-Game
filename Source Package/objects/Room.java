package objects;

import java.util.Vector;

// Class to manage properties of Game rooms
public class Room extends Description{
    private int n, s, w, e, coins, items_no[];

    public Room(String rName, String rDescription, int items_no[], int n, int s, int w, int e, int coins){
        super(rName, rDescription);
        this.items_no = items;
        this.n = n;
        this.s = s;
        this.w = w;
        this.e = e;
        this.coins = coins;
    }

    // getting directions of the room
    public int getN() {
        return n;
    }

    public int getS() {
        return s;
    }
    public int getW() {
        return w;
    }

    public int getE() {
        return e;
    }

    public int getCoins() {
        return coins;
    }

    @Override
    public String toString() {
		return "\n";
	}
}
