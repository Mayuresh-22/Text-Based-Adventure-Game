package objects;


public class Player extends Description{
    int location = 0;
    public Player(){super("", "");};

    public Player(String pName, String pDescription){
        super(pName, pDescription);
    }

    public int getLocation(){
        return location;
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
