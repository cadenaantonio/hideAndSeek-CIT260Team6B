/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hideandseek;

import byui.cit260.hideAndSeek.model.Inventory;
import byui.cit260.hideAndSeek.model.Player;


/**
 *
 * @author Antonio Cadena
 */
public class HideAndSeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Meg");
    
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setAquired("Yes");
        inventoryOne.setDescription("Blah Blah");
        inventoryOne.setItemCount(15);
        inventoryOne.setName("Blah Potion");
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
    }
    
}