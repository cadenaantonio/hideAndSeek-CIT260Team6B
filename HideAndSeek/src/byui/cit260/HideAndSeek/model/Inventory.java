package byui.cit260.HideAndSeek.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DragonMaster
 */
public class Inventory implements Serializable{
    
    
    private String aquired;
    private String description;
    private int itemCount;
    private String name;
    
    private Game game;

    public Inventory() {
    }

    public String getAquired() {
        return aquired;
    }

    public void setAquired(String aquired) {
        this.aquired = aquired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Inventory{" + "aquired=" + aquired + ", description=" + description + ", itemCount=" + itemCount + ", name=" + name + '}';
    }

    
}
