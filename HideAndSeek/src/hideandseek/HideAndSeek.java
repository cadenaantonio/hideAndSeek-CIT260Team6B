/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hideandseek;

import byui.cit260.HideAndSeek.model.Inventory;
import byui.cit260.HideAndSeek.model.Player;
import byui.cit260.HideAndSeek.model.Actor;
import byui.cit260.HideAndSeek.model.Location;
import byui.cit260.HideAndSeek.model.Map;


/**
 *
 * @author Antonio Cadena
 */
public class HideAndSeek {

    public static void teamTest() {
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
    
    public static void antonioTest() {
        //insert individual test code here!
    }
    
    public static void megTest() {
        //insert individual test code here!
    }
    
    public static void joelTest() {
        //insert individual test code here!
        Actor actorOne = new Actor();
        
        actorOne.setName("Joel");
        actorOne.setDescription("Superhero of this city.");
        actorOne.setAbility("Power-suit");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(15);
        mapOne.setColumnCount(5);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Location locationOne = new Location();
        
        locationOne.setVisited("Yes");
        locationOne.setDescription("You're at your hideout.");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationOne);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        teamTest();
        //antonioTest();
        //megTest();
        //joelTest();
        
    }
    
}