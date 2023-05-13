package game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
// import java.io.IOException;

/* Here is the explanation for the code above:
1. The saveGame method takes one parameter of type Game. This is the game that
   the player wants to save.
2. The method creates a new file called save.txt, using the File class. If the
   file already exists, it will be overwritten.
3. The FileOutputStream class is used to write the data to the file.
4. The ObjectOutputStream class is used to serialize the data. This means that
   the data will be converted to a format that can be read by the computer.
5. The writeObject method writes the data to the file.
6. The file and objectFile are closed. */

public class SaveGame {
    public void saveGame(Game game){
        try{
            File f = new File("save.txt");
            f.createNewFile();

            FileOutputStream file = new FileOutputStream(f);
            ObjectOutputStream objectFile = new ObjectOutputStream(file);

            objectFile.writeObject(game);

            file.close();
            objectFile.close();
        } catch(Exception e){
            System.out.println("SaveGame class error: "+e.getMessage());
        }
    }
}
