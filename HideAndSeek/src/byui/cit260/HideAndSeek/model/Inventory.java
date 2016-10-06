package byui.cit260.hideAndSeek.model;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.aquired);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + this.itemCount;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (this.itemCount != other.itemCount) {
            return false;
        }
        if (!Objects.equals(this.aquired, other.aquired)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "aquired=" + aquired + ", description=" + description + ", itemCount=" + itemCount + ", name=" + name + '}';
    }

    
}
