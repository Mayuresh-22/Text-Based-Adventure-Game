package game;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 1. The LoadGame class is used to load the game state from the save file. 
 * The save file is a binary file that contains the game state. 
 * The save file is created by the SaveGame class. The Game class is a Serializable class. 
 * Therefore, we can use the ObjectInputStream class to read the game state from the save file.
 * 2. In he loadGame method, we create a File object. 
 * If the save file exists, we create a FileInputStream object and an ObjectInputStream object. 
 * Then, we read the game state from the save file. We return the game state.
 */

public class LoadGame {
    public Game loadGame(){
        File f = new File("Source Package\\save.txt");
        if(f.exists()){
            try{
                FileInputStream file = new FileInputStream(f);
                ObjectInputStream objectFile = new ObjectInputStream(file);

                Game gameEnv = (Game) objectFile.readObject();

                file.close();
                objectFile.close();
                return gameEnv;
            } catch(Exception e){

            }
            
        }
        return null;
    }
}
