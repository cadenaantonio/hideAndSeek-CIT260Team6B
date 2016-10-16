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
public class Weapon implements Serializable{
    
    //class instance variable
    private String typeOfWeapon;

    public Weapon() {
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.typeOfWeapon);
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
        final Weapon other = (Weapon) obj;
        if (!Objects.equals(this.typeOfWeapon, other.typeOfWeapon)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weapon{" + "typeOfWeapon=" + typeOfWeapon + '}';
    }

    
    
}
