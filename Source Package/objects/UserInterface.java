package objects;


// Class to manage the UI of Game
public class UserInterface {

    // Color constants
    public final static String GREEN = "\u001B[32m";
    public final static String CYAN = "\u001B[36m";
    public final static String RED = "\u001B[31m";
    public final static String BLUE = "\u001B[34m";
    public final static String WHITE = "\u001B[37m";
    public final static String PURPLE = "\u001B[35m";
    public final static String BLACK = "\u001B[30m";

    // Game start Header
    public static void gameStart() throws InterruptedException{
        // Game header (Starting screen)
        System.out.println(GREEN+"\s\s\s\4---------------------------------------------------------\4");
        System.out.println("\s\s\s\4---------------------------------------------------------\4");
        System.out.println(CYAN+"\s\s\s       ==== || || |===   |=== ||=|| ||  || |===");
        System.out.println("\s\s\s        ||  ||=|| |=     |= + || || ||\\/|| |=  ");
        System.out.println("\s\s\s        ||  || || |===   |=== || || ||  || |===");
        System.out.println(GREEN+"\s\s\s\4---------------------------------------------------------\4");
        System.out.println("\s\s\s                    by Mayuresh Choudhary");
        System.out.println(GREEN+"\s\s\s\4---------------------------------------------------------\4\n");
        System.out.println(RED+"\s\s\s                           N                             ");
        System.out.println("\s\s\s                           |                             ");
        System.out.println("\s\s\s                       W ----- E                         ");
        System.out.println("\s\s\s                           |                             ");
        System.out.println("\s\s\s                           S                            \n");

        String gameAbout = WHITE+"Welcome to the world of adventure! In this text-based game,\nyou will embark on a thrilling journey filled with twists and turns.\nAs the protagonist of this story, you will make crucial decisions that will shape your destiny.\nWill you be a hero or a villain? The choice is yours.\nPrepare yourself for a gripping adventure that will test your courage.\nLet the game begin!\n";
        for(int i = 0; i < gameAbout.length(); i++){
            System.out.print(gameAbout.charAt(i));
            Thread.sleep(15);
        }
        Thread.sleep(700);
        System.out.println();
    }

    // Game start options
    public static void gameStartOption(){
        System.out.println(CYAN+"Would you like to continue with? ");
        System.out.println("\4------------\4  \4--------------\4");
        System.out.println("| 1.NEW GAME |  | 2.SAVED GAME |");
        System.out.print("\4------------\4  \4--------------\4\n<\4> ");
    }

    // Game start Loading Animation
    public static void gameStartLoadingAnimation() throws InterruptedException {
        System.out.print(UserInterface.GREEN + "\nGame starting");
        for(int i = 0; i < 3; i++){
            Thread.sleep(1000);
            System.out.print(".");
        }
        Thread.sleep(100);
        System.out.println(UserInterface.WHITE);
    }

    // Game end Animation
    public static void gameEndAnimation() throws InterruptedException {
        String gameEndMsg = "THE END";
        for(int i = 0; i < gameEndMsg.length(); i++){
            Thread.sleep(700);
            System.out.print(gameEndMsg.charAt(i));
        }
        Thread.sleep(100);
    }

}
