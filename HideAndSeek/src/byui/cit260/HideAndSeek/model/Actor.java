package byui.cit260.HideAndSeek.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DragonMaster
 */
public enum Actor implements Serializable {
    
    Batman("Hero of Gotham City. Teaches you Mega-Mind ability."),
    Superman("Hero of Metropolis. Teaches you the Flight ablility."),
    Spiderman("Hero of New York City. Teaches you the Super Sense ability."),
    Siryn("Hero with super sonic voice. Teaches you the Sonar ability.");
    
    
    private final String description;
    private final Point coordinates;
    
    private Player player;
    private Location location;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
}

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    
    
}
