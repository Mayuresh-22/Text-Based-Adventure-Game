package objects;


public class Room extends Description{
    private int n, s, w, e, coins;
    public Room(String rName, String rDescription, int n, int s, int w, int e, int coins){
        super(rName, rDescription);
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
    @Override
    public String toString() {
		return "\n";
	}
}
