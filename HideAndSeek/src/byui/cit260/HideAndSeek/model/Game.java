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
public class Game implements Serializable{
    
    public Game() {
    }
    
    // class instance variables
    private String Instruction;
    private String Menu;

    public String getInstruction() {
        return Instruction;
    }

    public void setInstruction(String Instruction) {
        this.Instruction = Instruction;
    }

    public String getMenu() {
        return Menu;
    }

    public void setMenu(String Menu) {
        this.Menu = Menu;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.Instruction);
        hash = 29 * hash + Objects.hashCode(this.Menu);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.Instruction, other.Instruction)) {
            return false;
        }
        if (!Objects.equals(this.Menu, other.Menu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "Instruction=" + Instruction + ", Menu=" + Menu + '}';
    }

    
    
}
