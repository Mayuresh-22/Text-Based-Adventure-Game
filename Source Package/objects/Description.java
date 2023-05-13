package objects;

import java.io.Serializable;


// Root class for every Game Object
public class Description implements Serializable{
    private String description, name;
    Description(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
