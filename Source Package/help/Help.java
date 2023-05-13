package help;

import objects.UserInterface;


// Class to manage `HELP` command
public class Help {
    public void helpCommand(){
        System.out.println(UserInterface.WHITE+"\n\4-------------------------\4");
        System.out.println("\nThe \"help\" command displays a list of available commands that can be used in the game.\n\nHere is a list of commands that you can use:");
        System.out.println("<direction>: Moves the player in the specified direction (N - north, S - south, E - east, or W - west).");
        System.out.println("\"look\": Displays a description of the current room");
        System.out.println("\"take <item>\": Adds the specified item to the player's inventory.");
        System.out.println("\"inventory\": Displays the player's current inventory.");
        System.out.println("\"use <item>\": Uses the specified item in the current room.");
        System.out.println("\"help\": Displays a list of available commands.\n");
    }
}
