package game;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadGame {
    public Game loadGame(){
        File f = new File("save.txt");
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
