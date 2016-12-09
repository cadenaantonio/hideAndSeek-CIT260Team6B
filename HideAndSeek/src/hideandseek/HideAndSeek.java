/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hideandseek;

import byui.cit260.HideAndSeek.model.Inventory;
import byui.cit260.HideAndSeek.model.Player;
import byui.cit260.HideAndSeek.model.Actor;
import byui.cit260.HideAndSeek.model.Bomb;
import byui.cit260.HideAndSeek.model.Game;
import byui.cit260.HideAndSeek.model.Hero;
import byui.cit260.HideAndSeek.model.Items;
import byui.cit260.HideAndSeek.model.Location;
import byui.cit260.HideAndSeek.model.Map;
import byui.cit260.HideAndSeek.model.Questions;
import byui.cit260.HideAndSeek.model.Villain;
import byui.cit260.HideAndSeek.model.Weapon;
import byui.cit260.HideAndSeek.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Antonio Cadena
 */
public class HideAndSeek implements Serializable{

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
//    public static void teamTest() {
//        /*Player playerOne = new Player();
//        
//        playerOne.setName("Meg");
//    
//        String playerInfo = playerOne.toString();
//        System.out.println(playerInfo);
//    
//        Inventory inventoryOne = new Inventory();
//        
//        inventoryOne.setAquired("Yes");
//        inventoryOne.setDescription("Blah Blah");
//        inventoryOne.setItemCount(15);
//        inventoryOne.setName("Blah Potion");
//        
//        String inventoryInfo = inventoryOne.toString();
//        System.out.println(inventoryInfo);*/
//    }
//    
//    public static void antonioTest() {/*
//        //insert individual test code here!
//        
//        Game gameOne = new Game();
//        
//        gameOne.setInstruction("Follow the Instructions!");
//        gameOne.setMenu("This is the menu.");
//        
//        String gameInfo = gameOne.toString();
//        System.out.println(gameInfo);
//        
//        
//        
//        
//        Bomb bombsOne = new Bomb();
//        
//        bombsOne.setTypeOfBomb("Make it rain!");
//        bombsOne.setDescription("Make it rain: This bomb makes it rain fire, of biblical proportions, from the heavens making even the strongest villan weak in the knees.");
//        
//        String bombsInfo = bombsOne.toString();
//        System.out.println(bombsInfo);
//        
//        
//        
//        
//        Villain villainOne = new Villain();
//        
//        villainOne.setName("Dave");
//        villainOne.setDescription("Dave is lonely man who enjoys making everyones misserable by placing bombs around the city.");
//        
//        String villainInfo = villainOne.toString();
//        System.out.println(villainInfo);
//        
//        
//        
//        
//        Questions questionsOne = new Questions();
//        
//        questionsOne.setDescription("What is 1 + 2?");
//        
//        String questionsInfo = questionsOne.toString();
//        System.out.println(questionsInfo);
//        
//        
//        
//        
//        Hero heroOne = new Hero();
//        
//        heroOne.setUsed("What this item used?");
//        
//        String heroInfo = heroOne.toString();
//        System.out.println(heroInfo);
//        
//        
//        
//        
//        Weapon weaponOne = new Weapon();
//        
//        weaponOne.setTypeOfWeapon("Knife");
//        
//        String weaponInfo = weaponOne.toString();
//        System.out.println(weaponInfo);
//        
//        
//        
//        
//        Items itemsOne = new Items();
//        
//        itemsOne.setAddToInventory("Add to inventory?");
//        
//        String itemsInfo = itemsOne.toString();
//        System.out.println(itemsInfo);*/
//        
//    }
//    
//    public static void megTest() {
//        //insert individual test code here!
//    }
//    
//    public static void joelTest() {
//        //insert individual test code here!
//        /*Actor actorOne = new Actor();
//        
//        actorOne.setName("Joel");
//        actorOne.setDescription("Superhero of this city.");
//        actorOne.setCoordinates("1,1");
//        
//        String actorInfo = actorOne.toString();
//        System.out.println(actorInfo);
//        
//        Map mapOne = new Map();
//        
//        mapOne.setRowCount(15);
//        mapOne.setColumnCount(5);
//        
//        String mapInfo = mapOne.toString();
//        System.out.println(mapInfo);
//        
//        Location locationOne = new Location();
//        
//        locationOne.setVisited("Yes");
//        locationOne.setDescription("You're at your hideout.");
//        
//        String locationInfo = locationOne.toString();
//        System.out.println(locationOne);*/
//    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            // oper character stream files for end user input and output
            HideAndSeek.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            HideAndSeek.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            HideAndSeek.logFile = new PrintWriter(filePath);
            
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        
        } catch (Throwable e) {
        
            System.out.println("Exception: " + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());
        e.printStackTrace();;
        }
        
        finally {
            try {
                if (HideAndSeek.inFile != null)
                    HideAndSeek.inFile.close();
                
                if (HideAndSeek.outFile != null)
                HideAndSeek.outFile.close();
                
                if (HideAndSeek.logFile != null)
                HideAndSeek.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        HideAndSeek.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        HideAndSeek.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        HideAndSeek.logFile = logFile;
    }


    
    
    
}
