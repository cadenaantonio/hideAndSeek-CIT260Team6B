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
public enum Items implements Serializable{
    
    potion,
    elixer;
    
    //class instance variable
    private String addToInventory;

    Items() {
    }

    public String getAddToInventory() {
        return addToInventory;
    }

    public void setAddToInventory(String addToInventory) {
        this.addToInventory = addToInventory;
    }

    
    
    
    
}
