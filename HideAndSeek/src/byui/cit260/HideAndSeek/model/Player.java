/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hideAndSeek.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Antonio Cadena
 */
public class Player implements Serializable{
    
        // class instance variables
    private String name;
    private double returningPlayer;

    public Player() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReturningPlayer() {
        return returningPlayer;
    }

    public void setReturningPlayer(double returningPlayer) {
        this.returningPlayer = returningPlayer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.returningPlayer) ^ (Double.doubleToLongBits(this.returningPlayer) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "player{" + "name=" + name + ", returningPlayer=" + returningPlayer + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.returningPlayer) != Double.doubleToLongBits(other.returningPlayer)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}