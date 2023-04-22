package main;

import game.Game;
import game.SaveGame;
import game.LoadGame;
import objects.UserInterface;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class TextAdventureGame {
    // commands
    static String command;

    // scanner object
    public static Scanner input = new Scanner(System.in);

    // valid commands
    public static String validCmd[] = {"n", "s", "w", "e", "take", "drop", "use"};
    public static List <String> validCmdList = Arrays.asList(validCmd);
    
    // Parse command function to parse the command and pass them to appropriate functions
    static void parseCommand(String command, Game gameEnv){
        if(command.length()==1 && validCmdList.contains(command)){
            gameEnv.runCommandDirection(command);
        }
    }

    public static void main(String args[]){

        new UserInterface();
        // Game Start header
        UserInterface.gameStart();

        // Asking whether to continue with new/saved game?
        UserInterface.gameStartOption();

        /*
         * creating a game object which setups the initial game environment.
         * Creates Game player as an objects which has its own properties
         * Creates Game map as initial requirment of the game
        */
        Game gameEnv = new Game();  // creating local empty Game object

        while(true){
            try{
                if(input.nextInt()==2){
                    input.nextLine();
                    gameEnv = new LoadGame().loadGame();
                    gameEnv.player.getName(); // for raising NullPointerException

                    // welcome back message
                    System.out.println(UserInterface.GREEN+"\n\s\s\s\4--------------------------------\4");
                    System.out.println(UserInterface.CYAN+"\s\s\s     WELCOME BACK," + gameEnv.player.getName());
                    System.out.println(UserInterface.GREEN+"\s\s\s\4--------------------------------\4"+UserInterface.WHITE);

                    //printing users last room name, descroption
                    System.out.println("\n| You were at, "+gameEnv.getLocationRoom().getName());
                    System.out.println("\4-------------------------\4");
                    System.out.println(gameEnv.getLocationRoom().getDescription()+"\n");

                } else{
                    // Taking initial details from the player
                    input.nextLine();
                    System.out.print("\n<\4> Name: ");
                    String pName = input.nextLine();

                    // create New game with provided details
                    gameEnv = new Game(pName, "Main Player");

                    System.out.println("\n| "+gameEnv.getLocationRoom().getName().toUpperCase());
                    System.out.println("\4-------------------------\4");
                    System.out.println(gameEnv.getLocationRoom().getDescription()+"\n");
                }
            } catch(InputMismatchException e){
                input.nextLine();
                System.out.print("<\4> Enter valid option\n<\4> "+UserInterface.WHITE);
                continue;
            } catch(NullPointerException e){
                System.out.print(UserInterface.RED+"\n<\4> No saved game found\n<\4> "+UserInterface.WHITE);
                continue;
            }
            break;
        }

        /*
         * Getting commands as an input from the player
         * until, player passes "Q" command
         */
        do{
            System.out.print("<\4> ");
            command = input.nextLine().toLowerCase().strip();
            parseCommand(command, gameEnv);
        } while(!command.equals("q"));

        
        // Handles the saving of the game progress
        /* Here is the explanation for the code above:
            1. The program checks if the user wants to save the game
            (by checking the input command)
            2. If the user wants to save the game,
            the program will run the new SaveGame() method to save the game
            3. The saveGame() method is in the SaveGame class 
            which is the class that handles the saving of the game
            4. The saveGame() method takes in the game environment as a parameter
            5. The saveGame() method is used to save the game environment
            in a file called "saveGame.txt" 
        */
        System.out.print(UserInterface.WHITE+"\n<\4> Do you want to save the progress?\n<\4> ");
        command = input.nextLine().toLowerCase().strip();
        try{
            if(command.equals("y")){
                new SaveGame().saveGame(gameEnv);
                System.out.println(UserInterface.GREEN+"Game saved");

            } else if(command.equals("n")){
                System.out.println("<\4> Quiting the Game");
            }
        } catch (Exception e) {
            System.out.println(UserInterface.RED+"<\4> Error occured while saving the game\n");
        }
    }
}
