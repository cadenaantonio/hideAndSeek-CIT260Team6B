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
public class Items implements Serializable{
    
    //class instance variable
    private String addToInventory;

    public Items() {
    }

    public String getAddToInventory() {
        return addToInventory;
    }

    public void setAddToInventory(String addToInventory) {
        this.addToInventory = addToInventory;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.addToInventory);
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
        final Items other = (Items) obj;
        if (!Objects.equals(this.addToInventory, other.addToInventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "addToInventory=" + addToInventory + '}';
    }
    
    
    
}
