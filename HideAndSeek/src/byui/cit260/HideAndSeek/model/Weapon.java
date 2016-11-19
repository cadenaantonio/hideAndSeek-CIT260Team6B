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
public enum Weapon implements Serializable{
    
    knife,
    gun,
    handcuff;
    
    //class instance variable
    private String typeOfWeapon;

    Weapon() {
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    

    @Override
    public String toString() {
        return "Weapon{" + "typeOfWeapon=" + typeOfWeapon + '}';
    }

    
    
}
