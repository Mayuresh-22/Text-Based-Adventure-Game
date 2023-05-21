package game;

import java.util.Vector;
import java.io.Serializable;
import objects.Room;
import objects.UserInterface;
import objects.Inventory;
import objects.Item;
import objects.Player;
import help.Help;


public class Game implements Serializable{
    // color codes
    final String GREEN = "\u001B[32m", CYAN = "\u001B[36m", RED = "\u001B[31m", BLUE = "\u001B[34m", WHITE = "\u001B[37m", PURPLE = "\u001B[35m", BLACK = "\u001B[30m";

    // Vector array to store the Map places and their coordinates
    public Vector<Room> map = new Vector<>();
    public Vector<Item> items = new Vector<>();

    // creating player:
    public Player player = new Player();
    // creating Inventory to store items
    Inventory inventory = new Inventory();

    public Game(){};

    public Game(String pName, String pDescription){
        /* 
         * This game constructor setup initial game components like map, player etc.
         * This constructor creates the map and required room.
         * Also, it creates the player object
        */
        player = new Player(pName, pDescription, 0);

        /* Creating Collectables Item */
        items.add(new Item("Wood", "This wooden logs are of this gaint trees.\nIt is said that the things built from this wood,\nnever dies", 10));
        items.add(new Item("Lantern", "This Lantern will show you the way out of this deadly land", 15));

        /* Creating Game rooms */
        // 0
        map.add(new Room("Forest", GREEN+"The forest before you is a vast and ancient realm,\na place where the trees loom like giants and the very air is thick with magic and mystery.\nBut for those brave enough to explore its winding paths and hidden glades,\nthe forest is a place of wonder and enchantment,\na realm where anything is possible.", new int[]{0, 1}, 1, 2, 4, -1, 500));
        //1
        map.add(new Room("Dead end", RED+"You come to a dead end.\nThe path ends abruptly, with no sign of a way forward.\nThe forest around you seems to close in, the trees pressing in from all sides.\nThe dead end seems to be more than just a simple obstacle; it feels like a warning,\na sign that you have wandered into a place where you do not belong.", new int[]{0, 1}, -1, 0, -1, -1, -30));
        //2
        map.add(new Room("River", BLUE+"The river before you is a serpent,\nwinding its way through the landscape with sinuous grace and power.\nThose who dare to explore its currents do so at their own risk\nSome say that it is alive,\na creature of magic and mystery that moves with a will of its own.", new int[]{0, 1}, 0, 3, -1, -1, 110));
        //3
        map.add(new Room("Mountains", GREEN+"The mountains before you are titans, vast and ancient beyond comprehension.\nLegends speak of titans that walked the earth in ancient times,\nand one cannot help but feel that these mountains are the petrified remnants of those same godlike beings,\nnow frozen in time.", new int[]{0, 1}, 2, -1, 8, -1, 210));
        //4
        map.add(new Room("Tunnle", BLACK+"The tunnel before you is a dark and ominous gateway,\nleading deep into the heart of the earth.\nIts walls are rough-hewn and jagged, carved from the living rock by unknown hands.\nThe air within is cold and damp,\nand the only sound is the distant drip of water echoing off the stone.", new int[]{0, 1}, 5, -1, 11, 0, 250));
        //5
        map.add(new Room("Coal Mine", BLACK+"The coal mine before you is a place of darkness and danger,\na realm where the very earth seems to be in a state of constant turmoil.\nThe only light coming from the flickering lantern that you carry in your hand.\nThe tunnels are narrow and claustrophobic,\nand the walls are slick with moisture.", new int[]{0, 1}, -1, 4, 6, -1, 100));
        //6
        map.add(new Room("Diamond Mine", PURPLE+"The diamond mine before you is a place of wonder and danger,\na realm where untold riches lie hidden beneath the earth.\nThe diamonds that lie hidden within its walls are said to be the most precious in the world,\nglittering like stars in the darkness,\nand coveted by kings and emperors alike", new int[]{0, 1}, -1, -1, -1, 5, 400));
        //7
        map.add(new Room("Mountains", GREEN+"The mountain before you is like nothing you have ever seen before.\nIt is not a towering peak, nor a jagged range of craggy cliffs.\nIt is a smooth, perfectly symmetrical dome,\nrising from the earth like a giant, rounded bowl.\nIts sides are steep,\nbut not so much as to be impossible to climb,\nand its peak is broad and flat, like a table set high above the world.", new int[]{0, 1}, -1, 8, 12, -1, 210));    
        //8
        map.add(new Room("Cave", BLACK+"The cave before you is a gaping maw,\nan entrance to a world that lies hidden beneath the earth.\nIts mouth is dark and forbidding, and the air around it is cool and musty\nAs you step inside, the darkness presses in around you,\nand the only sounds are the drip of water", new int[]{0, 1}, 7, 9, 13, 3, 250));   
        //9
        map.add(new Room("Demon Portal", PURPLE+"A demon portal is a gateway to a dark and twisted realm beyond our own.\nIt is a vortex of swirling energy,\ncrackling with dark magic and the sounds of tortured souls.\nThe air around it is heavy with the stench of brimstone and decay,\nand those who stand too close can feel the heat of its otherworldly energies.", new int[]{0, 1}, 8, -1, 10, -1, -50));    
        //10
        map.add(new Room("Demon's Home", RED+"The demon home is a place of darkness and despair.\nIn this place, the demons reign supreme, their power and influence extending over all who dwell within.\nThey are twisted and grotesque, their forms warped by the dark magic that fuels their existence.\nTheir eyes gleam with an otherworldly light,\nand their laughter echoes through the halls like the cackling of madmen.", new int[]{0, 1}, -1, -1, -1, -1, -150));  
        //11
        map.add(new Room("Road", BLACK+"The road stretches out before you,\nthat winds its way through the landscape like a serpent.\nThe road is not without its dangers. Obstacles may block your way,\nhidden dangers may lurk in the shadows, you must remain ever-vigilant and be prepared to face whatever challenges lie ahead.", new int[]{0, 1}, -1, 12, -1, 4, 50));   
        //12
        map.add(new Room("River", BLUE+"The river before you is a force of nature,\ncarving its way through the land with a power that is both awesome and terrible.\nIts waters are murky and opaque, hiding the dangers.\nFor within the river dwell creatures that are both ancient and deadly.", new int[]{0, 1}, 11, -1, -1, 7, 110));  
        //13
        map.add(new Room("The Lake", BLUE+"In the heart of the wilderness, nestled amidst jagged peaks and rugged terrain,\nthere lies a lake of sweet and crystal-clear water.\nIt is a place of mystery and wonder, for it seems impossible that such a beautiful and tranquil body of water could exist\nin this unpredictable and inhospitable landscape.", new int[]{0, 1}, -1, 15, 14, 8, 70));    
        //14
        map.add(new Room("Diamond Mine", PURPLE+"A diamond mine is a place of wonder and wealth, a treasure trove of glittering stones\nthat have been hidden beneath the earth for countless years.\nIt is a place where miners toil endlessly, digging deep into the earth\nin search of the precious gems that lie hidden within the rock", new int[]{0, 1}, -1, -1, -1, 13, 400));
        //15
        map.add(new Room("The Plains", GREEN+"The sweet fragrance of the blooms fills the air, and for a moment, you forget the wild and treacherous world that surrounds you.\nAs you take a step forward, you notice a glint of light among the flowers.\nAs you approach, you realize that it is a key, lying among the blooms,\nthis is the key that will help you escape this wild place.", new int[]{0, 1}, 13,-1, -1, 16, 560));
        //16
        map.add(new Room("The Door", CYAN+"Before you stands a door, ancient and mysterious,\nlocked tight with a variety of different locks.\nThe door seems to be a portal, a gateway to another realm, but it is barred to all but the most skilled and daring adventurers.\nThe locks that bind the door are many and varied, each requiring a different key or combination to unlock.\nSome are simple, requiring nothing more than a deft hand and a keen eye,\nwhile others are more complex, requiring knowledge of ancient magic or skill in solving puzzles.\nOnly those who are truly worthy will be able to unlock its secrets and step through into the unknown.\nWill you be one of the few who dare to try?", new int[]{0, 1}, -1, -1, 15, 17, 700));
        //17
        map.add(new Room("The Shimmering gateway", PURPLE+"The portal before you is a shimmering gateway,\na doorway between worlds that glows with a soft, otherworldly light.\nIt is said that this portal is only accessible to those who have proven their worth,\npassing through countless trials and challenges to reach this point.\nYou know that you must speak the magical words that you have gathered on your journey to activate the portal and gain access to the world beyond.\nIn an instant, you are transported to a world where you belong.\n\nTHE END", new int[]{0, 1}, -1, -1, -1, -1, 1000));

    }

    /* Functions to get Room or Item from the Loc/Index stored in Player/Room objects */
    // Returns Room class object stored at location
    public Room getLocationRoom(){
        return map.get(player.getLocation());
    }

    // Returns Item class object from items vector stored at index specified
    public Item getLocationRoomItem(int index){
        return items.get(index);
    }

    // Direction Commands handling
    public void runCommandDirection(String command) throws InterruptedException{
        int open = -1;
        /*
         * In order to move the player to the desired location,
         * we first check whether players current room has opening in that direction or
         * not. If room has opening in that direction players new location is set else,
         * special message will be shown to the Player (NO EXIT)
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
            // Move player to the location if direction != NO EXIT (-1)
            player.moveToLocation(open);
            // Updating total coins of the users 
            player.totalCoins = player.totalCoins + getLocationRoom().getCoins();

            System.out.println(WHITE+"\n| Moved to, "+getLocationRoom().getName().toUpperCase());
            System.out.println("\4-------------------------\4");

            // If room is the last room
            if(open == 17){
                System.out.println(getLocationRoom().getDescription());
                System.out.println("\n\4-------------------------\4");
                System.out.println("Player Name: " + player.getName());
                System.out.println("Player Description: " + player.getDescription());
                System.out.println("Total Coins Earned: " + player.getTotalCoins() + "\n");

                UserInterface.gameEndAnimation();
                System.out.println("\n\4-------------------------\4");
                System.out.println(UserInterface.WHITE);
            }

        } else{
            System.out.println(RED+"\nNO EXIT\n");
        }
    }

    // Action Commands handeling
    public void runCommandAction(String command) throws InterruptedException{
        // split commands
        String splitCommand[] = command.split(" ");
        // look: Displays a description of the current room.
        if(splitCommand[0].equals("look")){
            for(int i = 0; i < getLocationRoom().getDescription().length(); i++){
                System.out.print(getLocationRoom().getDescription().charAt(i));
                Thread.sleep(15);
            }
            Thread.sleep(700);
            System.out.println();
        }
        // help: Displays a list of available commands.
        else if(splitCommand[0].equals("help")){
            new Help().helpCommand();
        }
        // take <item>: Adds the specified item to the player's inventory.
        else if(splitCommand[0].equals("take") && splitCommand.length==2){
            int items_no[] = getLocationRoom().getItemsNo();
            boolean added = false;
            for(int item: items_no){
                if(getLocationRoomItem(item).getName().equalsIgnoreCase(splitCommand[1])){
                    if(!inventory.contains(getLocationRoomItem(item))){
                        inventory.addInvent(getLocationRoomItem(item));
                        System.out.println(UserInterface.WHITE+"You have added \""+getLocationRoomItem(item).getName()+"\" to your Inventory");
                        added = true;
                        break;
                    } else{
                        added = true;
                        System.out.println(UserInterface.RED+"You already have \""+getLocationRoomItem(item).getName()+"\" in your inventory.");
                    }
                }
                else if(item == items_no[items_no.length-1] && added == false){
                    System.out.println(UserInterface.RED+"There is no \""+splitCommand[1]+"\" to collect.");
                }
            }
        }

    }


    // serializing object
    @Override
    public String toString() {
		return "pName:" + player.getName() + "\npDescription: " + player.getDescription() + "\nLocation: " + player.getLocation() + "\npCurrent Room: " + getLocationRoom().getName() + "\nTotal Coins Earned: " + player.getTotalCoins();
	}
}
