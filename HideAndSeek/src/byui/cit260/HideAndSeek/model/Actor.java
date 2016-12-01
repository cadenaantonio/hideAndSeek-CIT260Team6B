package byui.cit260.HideAndSeek.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DragonMaster
 */
public class Actor implements Serializable {
    
    
    
    
    private final String description;
    //private final Point coordinates;
    
    //private Player player;
    //private Location location;

    public Actor(String description) {
        this.description = description;
        //coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

//    public Point getCoordinates() {
//        return coordinates;
//}
//
//    public Player getPlayer() {
//        return player;
//    }
//
//    public void setPlayer(Player player) {
//        this.player = player;
//    }
//
//    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }

    
    
}
