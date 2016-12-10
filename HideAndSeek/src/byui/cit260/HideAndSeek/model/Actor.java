package byui.cit260.HideAndSeek.model;

import byui.cit260.HideAndSeek.exceptions.ActorControlExeption;
import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DragonMaster
 */
public class Actor implements Serializable {

    private String name;
    private String city;
    private String description;

//    public Actor(String description) {
//        this.description = description;
//    }

    public Actor(){
    }

    public Actor(String string) {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", city=" + city + ", description=" + description + '}';
    }

}
