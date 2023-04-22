package game;
import java.util.Vector;
import java.io.Serializable;
import objects.Room;
import objects.Player;



public class Game implements Serializable{
    // color codes
    final String GREEN = "\u001B[32m", CYAN = "\u001B[36m", RED = "\u001B[31m", BLUE = "\u001B[34m", WHITE = "\u001B[37m", PURPLE = "\u001B[35m", BLACK = "\u001B[30m";

    // Vector array to store the Map places and their coordinates
    public Vector<Room> map = new Vector<>();

    // creating player:
    public Player player = new Player();

    public Game(){};

    public Game(String pName, String pDescription){
        /* 
         * This game constructor setup initial game components like map, player etc.
         * This constructor creates the map and required room.
         * Also, it creates the player object
        */

        // 0
        map.add(new Room("Forest", GREEN+"The forest before you is a vast and ancient realm, a place where the trees loom like giants and the very air is thick with magic and mystery.\nThe forest's depths are shrouded in shadows, and it is said that those who venture too far within its borders are never seen again.\nBut for those brave enough to explore its winding paths and hidden glades, the forest is a place of wonder and enchantment, a realm where anything is possible.", 1, 2, 4, -1));

        //1
        map.add(new Room("Dead end", RED+"You come to a dead end. The path ends abruptly, with no sign of a way forward. The forest around you seems to close in, the trees pressing in from all sides.\nThere is no sound but the whisper of the wind through the leaves, and the silence is so profound that it feels like a physical weight.\nAs you stand there, you begin to feel a sense of unease creeping over you.\nThe dead end seems to be more than just a simple obstacle; it feels like a warning, a sign that you have wandered into a place where you do not belong.", -1, 0, -1, -1));

        //2
        map.add(new Room("River", BLUE+"The river before you is a serpent, winding its way through the landscape with sinuous grace and power.\nIts waters are dark and mysterious, glittering in the sunlight like a thousand jewels, and its depths hold secrets that have remained hidden for centuries.\nThose who dare to explore its currents do so at their own risk, for the river's true nature is unknown and unpredictable.\nSome say that it is alive, a creature of magic and mystery that moves with a will of its own.", 0, 3, -1, -1));

        //3
        map.add(new Room("Mountains", GREEN+"The mountains before you are titans, vast and ancient beyond comprehension.\nTheir summits are lost to view, shrouded in mist and cloud, and their slopes are jagged and treacherous, marking the edge of a realm beyond mortal understanding.\nLegends speak of titans that walked the earth in ancient times, and one cannot help but feel that these mountains are the petrified remnants of those same godlike beings, now frozen in time and towering over the land in silent majesty.", 2, -1, 8, -1));

        //4
        map.add(new Room("Tunnle", BLACK+"The tunnel before you is a dark and ominous gateway, leading deep into the heart of the earth.\nIts walls are rough-hewn and jagged, carved from the living rock by unknown hands.\nThe air within is cold and damp, and the only sound is the distant drip of water echoing off the stone.", 5, -1, 11, 0));

        //5
        map.add(new Room("Coal Mine", BLACK+"The coal mine before you is a place of darkness and danger, a realm where the very earth seems to be in a state of constant turmoil.\nAs you step into the mine, the darkness seems to close in around you, the only light coming from the flickering lantern that you carry in your hand. The tunnels are narrow and claustrophobic, and the walls are slick with moisture and coal dust.", -1, 4, 6, -1));

        //6
        map.add(new Room("Diamond Mine", PURPLE+"The diamond mine before you is a place of wonder and danger, a realm where untold riches lie hidden beneath the earth.\nBut for those who are brave enough to explore its secrets, the diamond mine is a place of incredible wealth and opportunity.\nThe diamonds that lie hidden within its walls are said to be the most precious in the world, glittering like stars in the darkness, and coveted by kings and emperors alike", -1, -1, -1, 5));

        //7
        map.add(new Room("Mountains", GREEN+"The mountain before you is like nothing you have ever seen before. It is not a towering peak, nor a jagged range of craggy cliffs. It is a smooth, perfectly symmetrical dome, rising from the earth like a giant, rounded bowl. Its sides are steep, but not so much as to be impossible to climb, and its peak is broad and flat, like a table set high above the world.", -1, 8, 12, -1));
        
        //8
        map.add(new Room("Cave", BLACK+"The cave before you is a gaping maw, an entrance to a world that lies hidden beneath the earth.\nIts mouth is dark and forbidding, and the air around it is cool and musty, smelling of damp earth and ancient stone.\nAs you step inside, the darkness presses in around you, and the only sounds are the drip of water echoing through the caverns and the faint rustle of unseen creatures scurrying in the shadows.", 7, 9, 13, 3));
        
        //9
        map.add(new Room("Demon Portal", PURPLE+"A demon portal is a gateway to a dark and twisted realm beyond our own.\nIt is a vortex of swirling energy, crackling with dark magic and the sounds of tortured souls.\nThe air around it is heavy with the stench of brimstone and decay, and those who stand too close can feel the heat of its otherworldly energies.", 8, -1, 10, -1));
        
        //10
        map.add(new Room("Demon's Home", RED+"The demon home is a place of darkness and despair. In this place, the demons reign supreme, their power and influence extending over all who dwell within.\nThey are twisted and grotesque, their forms warped by the dark magic that fuels their existence.\nTheir eyes gleam with an otherworldly light, and their laughter echoes through the halls like the cackling of madmen.", -1, -1, -1, -1));
        
        //11
        map.add(new Room("Road", BLACK+"The road stretches out before you, a ribbon of beaten earth that winds its way through the landscape like a serpent.\nHowever, despite its apparent safety, the road is not without its dangers. Obstacles may block your way, hidden dangers may lurk in the shadows, and the path ahead may be more treacherous than it appears.you must remain ever-vigilant and be prepared to face whatever challenges lie ahead.", -1, 12, -1, 4));
        
        //12
        map.add(new Room("River", BLUE+"The river before you is a force of nature, carving its way through the land with a power that is both awesome and terrible.\nIts waters are murky and opaque, hiding the dangers that lurk beneath its surface.\nFor within the river dwell creatures that are both ancient and deadly, their razor-sharp teeth glinting in the murky depths.", 11, -1, -1, 7));
        
        //13
        map.add(new Room("The Lake", BLUE+"In the heart of the wilderness, nestled amidst jagged peaks and rugged terrain, there lies a lake of sweet and crystal-clear water.\nIt is a place of mystery and wonder, for it seems impossible that such a beautiful and tranquil body of water could exist in this unpredictable and inhospitable landscape.", -1, 15, 14, 8));
        
        //14
        map.add(new Room("Diamond Mine", PURPLE+"A diamond mine is a place of wonder and wealth, a treasure trove of glittering stones that have been hidden beneath the earth for countless years.\nIt is a place where miners toil endlessly, digging deep into the earth in search of the precious gems that lie hidden within the rock", -1, -1, -1, 13));
    
        //15
        map.add(new Room("The Plains", GREEN+"The sweet fragrance of the blooms fills the air, and for a moment, you forget the wild and treacherous world that surrounds you.\nAs you take a step forward, you notice a glint of light among the flowers. As you approach, you realize that it is a key, lying among the blooms,\nthis is the key that will help you escape this wild place.", 13,-1, -1, 16));
    
        //16
        map.add(new Room("The Door", CYAN+"Before you stands a door, ancient and mysterious, locked tight with a variety of different locks.\nThe door seems to be a portal, a gateway to another realm, but it is barred to all but the most skilled and daring adventurers.\nThe locks that bind the door are many and varied, each requiring a different key or combination to unlock. Some are simple, requiring nothing more than a deft hand and a keen eye, while others are more complex, requiring knowledge of ancient magic or skill in solving puzzles.\nOnly those who are truly worthy will be able to unlock its secrets and step through into the unknown. Will you be one of the few who dare to try?", -1, -1, 15, 17));
    
        //17
        map.add(new Room("The Shimmering gateway", PURPLE+"The portal before you is a shimmering gateway, a doorway between worlds that glows with a soft, otherworldly light.\nIt is said that this portal is only accessible to those who have proven their worth, passing through countless trials and challenges to reach this point.\nYou know that you must speak the magical words that you have gathered on your journey to activate the portal and gain access to the world beyond.\nIn an instant, you are transported to a world where you belong.\n\nTHE END", -1, -1, -1, -1));
    
        player = new Player(pName, pDescription);
    }

    // get Players current location's room object
    public Room getLocationRoom(){
        return map.get(player.getLocation());
    }

    // Handle's direction commands
    public void runCommandDirection(String command){
        int open = -1;
        /*
         * In order to move the player to the desired location,
         * we first check whether players current room has opening in that direction or
         * not. If room has opening in that direction players new location is set else,
         * special message will be shown to the Player 
         */

        Room tempRoom = getLocationRoom();

        switch(command){
            case "n":
                open = tempRoom.getN();
                break;
            case "s":
                open = tempRoom.getS();
                break;
            case "w":
                open = tempRoom.getW();
                break;
            case "e":
                open = tempRoom.getE();
                break;
        }

        if(open != -1){
            player.moveToLocation(open);
            System.out.println(WHITE+"\n| "+getLocationRoom().getName().toUpperCase());
            System.out.println("\4-------------------------\4");
            System.out.println(getLocationRoom().getDescription()+"\n");
        } else{
            System.out.println(RED+"\nNO EXIT\n");
        }
    }

    // serializing object
    @Override
    public String toString() {
		return "pName:" + player.getName() + "\npDescription: " + player.getDescription() + "\nLocation: " + player.getLocation() + "\npCurrent Room: " + getLocationRoom().getName();
	}
}
