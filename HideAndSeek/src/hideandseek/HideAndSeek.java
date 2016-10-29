/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hideandseek;

import byui.cit260.HideAndSeek.model.Inventory;
import byui.cit260.HideAndSeek.model.Player;
import byui.cit260.HideAndSeek.model.Actor;
import byui.cit260.HideAndSeek.model.Bombs;
import byui.cit260.HideAndSeek.model.Game;
import byui.cit260.HideAndSeek.model.Hero;
import byui.cit260.HideAndSeek.model.Items;
import byui.cit260.HideAndSeek.model.Location;
import byui.cit260.HideAndSeek.model.Map;
import byui.cit260.HideAndSeek.model.Questions;
import byui.cit260.HideAndSeek.model.Villain;
import byui.cit260.HideAndSeek.model.Weapon;
import byui.cit260.HideAndSeek.view.StartProgramView;


/**
 *
 * @author Antonio Cadena
 */
public class HideAndSeek {

    private static Game currentGame = null;
    private static Player player = null;
    
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
        
        Game gameOne = new Game();
        
        gameOne.setInstruction("Follow the Instructions!");
        gameOne.setMenu("This is the menu.");
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        
        
        Bombs bombsOne = new Bombs();
        
        bombsOne.setTypeOfBomb("Make it rain!");
        bombsOne.setDescription("Make it rain: This bomb makes it rain fire, of biblical proportions, from the heavens making even the strongest villan weak in the knees.");
        
        String bombsInfo = bombsOne.toString();
        System.out.println(bombsInfo);
        
        
        
        
        Villain villainOne = new Villain();
        
        villainOne.setName("Dave");
        villainOne.setDescription("Dave is lonely man who enjoys making everyones misserably by placing bombs around the city.");
        
        String villainInfo = villainOne.toString();
        System.out.println(villainInfo);
        
        
        
        
        Questions questionsOne = new Questions();
        
        questionsOne.setDescription("What is 1 + 2?");
        
        String questionsInfo = questionsOne.toString();
        System.out.println(questionsInfo);
        
        
        
        
        Hero heroOne = new Hero();
        
        heroOne.setUsed("What this item used?");
        
        String heroInfo = heroOne.toString();
        System.out.println(heroInfo);
        
        
        
        
        Weapon weaponOne = new Weapon();
        
        weaponOne.setTypeOfWeapon("Knife");
        
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);
        
        
        
        
        Items itemsOne = new Items();
        
        itemsOne.setAddToInventory("Add to inventory?");
        
        String itemsInfo = itemsOne.toString();
        System.out.println(itemsInfo);
        
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
        
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HideAndSeek.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        HideAndSeek.player = player;
    }
    
}
