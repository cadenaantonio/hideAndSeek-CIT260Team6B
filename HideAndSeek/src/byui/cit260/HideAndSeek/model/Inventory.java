package byui.cit260.HideAndSeek.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DragonMaster
 */
public class Inventory implements Serializable {

    private String aquired;
    private String description;
    private int itemCount;
    private String nameB;
    private String type;

//    private Game game;

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

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
//    public Game getGame() {
//        return game;
//    }
//
//    public void setGame(Game game) {
//        this.game = game;
//    }
//    
    @Override
    public String toString() {
        return "Inventory{" + "aquired=" + aquired + ", description=" + description + ", itemCount=" + itemCount + ", nameB=" + nameB + '}';
    }

}
