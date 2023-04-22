package objects;

public class UserInterface {

    public final static String GREEN = "\u001B[32m";
    public final static String CYAN = "\u001B[36m";
    public final static String RED = "\u001B[31m";
    public final static String BLUE = "\u001B[34m";
    public final static String WHITE = "\u001B[37m";
    public final static String PURPLE = "\u001B[35m";
    public final static String BLACK = "\u001B[30m";

    public static void gameStart(){
        // Game header (Starting screen)
        System.out.println(GREEN+"\s\s\s\4---------------------------------------------------------\4");
        System.out.println("\s\s\s\4---------------------------------------------------------\4");
        System.out.println(CYAN+"\s\s\s       ==== || || |===   |=== ||=|| ||  || |===");
        System.out.println("\s\s\s        ||  ||=|| |=     |= + || || ||\\/|| |=  ");
        System.out.println("\s\s\s        ||  || || |===   |=== || || ||  || |===");
        System.out.println(GREEN+"\s\s\s\4---------------------------------------------------------\4");
        System.out.println(GREEN+"\s\s\s                    by Mayuresh Choudhary");
        System.out.println("\s\s\s\4---------------------------------------------------------\4\n");
        System.out.println(RED+"\s\s\s                           N                             ");
        System.out.println("\s\s\s                           |                             ");
        System.out.println("\s\s\s                       W ----- E                         ");
        System.out.println("\s\s\s                           |                             ");
        System.out.println("\s\s\s                           S                            \n");
        System.out.println(BLUE+"Welcome to the world of adventure! In this text-based game,\nyou will embark on a thrilling journey filled with twists and turns.\nAs the protagonist of this story, you will make crucial decisions that will shape your destiny.\nWill you be a hero or a villain? Will you fight for justice or for your own selfish desires? The choice is yours.\nPrepare yourself for a gripping adventure that will challenge your wits and test your courage. Let the game begin!\n");
    }

    public static void gameStartOption(){
        System.out.println(WHITE+"Would you like to continue with? ");
        System.out.println("\4------------\4  \4--------------\4");
        System.out.println("| 1.NEW GAME |  | 2.SAVED GAME |");
        System.out.print("\4------------\4  \4--------------\4\n<\4> ");
    }

}
