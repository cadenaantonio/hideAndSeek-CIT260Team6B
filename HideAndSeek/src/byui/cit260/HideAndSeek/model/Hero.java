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
public enum Hero implements Serializable{
    
    sonar,
    superSense,
    megaMind,
    flight;
    
    //class instance variables
    private String used;

    Hero() {
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    

    @Override
    public String toString() {
        return "Hero{" + "used=" + used + '}';
    }
    
    
    
}
