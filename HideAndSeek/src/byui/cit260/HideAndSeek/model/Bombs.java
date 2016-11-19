/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Antonio Cadena
 */
public class Bombs implements Serializable{
    
    //class instance variables
    private String typeOfBomb;
    private String description;
    
    private Location[] location;

    public Bombs() {
    }
    
    public String getTypeOfBomb() {
        return typeOfBomb;
    }

    public void setTypeOfBomb(String typeOfBomb) {
        this.typeOfBomb = typeOfBomb;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.typeOfBomb);
        hash = 23 * hash + Objects.hashCode(this.description);
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
        final Bombs other = (Bombs) obj;
        if (!Objects.equals(this.typeOfBomb, other.typeOfBomb)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bombs{" + "typeOfBomb=" + typeOfBomb + ", description=" + description + '}';
    }
    
    
    
}
