/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.view;

import byui.cit260.HideAndSeek.control.GameControl;
import byui.cit260.HideAndSeek.control.MapControl;
import byui.cit260.HideAndSeek.enu.ActorType;
import byui.cit260.HideAndSeek.model.Game;
import byui.cit260.HideAndSeek.model.Inventory;
import byui.cit260.HideAndSeek.model.Location;
import byui.cit260.HideAndSeek.model.Map;
import hideandseek.HideAndSeek;
import java.util.Scanner;
import byui.cit260.HideAndSeek.enu.InventoryType;
import byui.cit260.HideAndSeek.enu.SceneType;
import byui.cit260.HideAndSeek.model.Actor;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DragonMaster
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n-----------------------------------------------"
                + "\n| Game Menu                                    "
                + "\n-----------------------------------------------"
                + "\nU - Move Up"
                + "\nD - Move Down"
                + "\nL - Move Left"
                + "\nR - Move Right"
                + "\nT - Search Area"
                + "\nY - Use Hero Ability"
                + "\nI - Inventory"
                + "\nM - View Map"
                + "\nH - Get help on how to play the game"
                + "\nA - Display Actor List"
                + "\nX - Print Actor List"
                + "\nS - Display Map Symbol List"
                + "\nP - Print Map Symbol List"
                + "\nQ - Quit"
                + "\n-----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert value to upper case

        switch (value) {
            case "U": // Move up
                this.moveUp();
                break;
            case "D": // Move down
                this.moveDown();
                break;
            case "L": // Move left
                this.MoveLeft();
                break;
            case "R": // Move right
                this.moveRight();
                break;
            case "T": // display the search the area menu 
                this.displaySearchTheAreaMenu();
                break;
            case "Y": // display the use hero ability menu 
                this.displayHeroAbilityMenu();
                break;
            case "I": // display the inventory menu 
                this.displayInventoryMenu();
                break;
            case "M": // display the map
                this.viewMap();
                break;
            case "H": // display the help menu 
                this.displayHelpMenu();
                break;
            case "A": // display actor list
                this.actorList("");
                break;
            case "X": // display actor list
                this.actorListPrint();
                break;
            case "S": // display map symbol list
                this.mapSymbols("");
                break;
            case "P": // write map symbol list to file
                this.sceneListPrint();
                break;
            case "B":
                this.inventoryListPrint();
                break;
            case "Z": // TODO remove before finishing game
                Story3View storyview = new Story3View();
                storyview.display();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;

    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void actorList(String filename) {
        StringBuilder line;
        boolean saveToFile = !(filename.isEmpty());
        Game game = HideAndSeek.getCurrentGame();
        FileWriter outFile = null;
//        ActorType[] actors = ActorType.;
        try {
            if (saveToFile) {
                outFile = new FileWriter(filename);
            }
            this.console.println("\nList of Actors");
            line = new StringBuilder("                                                                     ");
            line.insert(1, "NAME");
            line.insert(12, "CITY");
            line.insert(30, "DESCRIPTION");

            if (saveToFile) {
                outFile.write(line.toString() + "\r\n");
            } else {
                this.console.println(line.toString());
            }

            for (ActorType item : ActorType.values()) {
                line = new StringBuilder("                                                                     ");
                line.insert(0, item.getName());
                line.insert(10, item.getCity());
                line.insert(25, item.getDescription());

                if (saveToFile) {
                    outFile.write(line.toString() + "\r\n");
                    outFile.flush();
                } else {
                    this.console.println(line.toString());
                }

            }
        } catch (Exception e) {
            this.console.println("Error saving Actor List File:" + e.getMessage());
        } finally {
            if (outFile != null && saveToFile) {
                try {
                    outFile.close();
                } catch (IOException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void actorListPrint() {
        String originalMenu = displayMessage;
        displayMessage = ("\n\nEnter the file path for file where the actors file "
                + "is to be saved.");
        String filePath = this.getInput();
        while (filePath.length() == 0) {
            this.console.println("Please enter a valid file name.");
            filePath = this.getInput();
        }
        displayMessage = originalMenu;
        actorList(filePath);
        this.console.println("Your file has been saved to " + filePath + ".");
    }

    private void moveUp() {
        Game game = HideAndSeek.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        //Location[][] locations = map.getLocations(); // retreive the locations from map

        if (map.getCurrentRow() > 0) {
            MapControl.movePlayer(map, map.getCurrentRow() - 1, map.getCurrentColumn());
        } else {
            this.console.println("\nCannot move up any further.");
        }
    }

    private void moveDown() {
        Game game = HideAndSeek.getCurrentGame(); //retrieve the game
        Map map = game.getMap(); // retreive the map from game

        if (map.getCurrentRow() < map.getRowCount() - 1) {
            MapControl.movePlayer(map, map.getCurrentRow() + 1, map.getCurrentColumn());
        } else {
            this.console.println("\nCannot move down any furter.");
        }
    }

    private void MoveLeft() {
        Game game = HideAndSeek.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        //Location[][] locations = map.getLocations(); // retreive the locations from map

        if (map.getCurrentColumn() > 0) {
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() - 1);
        } else {
            this.console.println("\nCannot move any further to the left.");
        }
    }

    private void moveRight() {
        Game game = HideAndSeek.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        //Location[][] locations = map.getLocations(); // retreive the locations from map

        if (map.getCurrentColumn() < map.getColumnCount() - 1) {
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() + 1);
        } else {
            this.console.println("\nCannot move any further to the right.");
        }
    }

    private void displaySearchTheAreaMenu() {
        
        //if(MapContorl.currentScene){
            
        //}
        
        SearchTheAreaView searchTheAreaMenu = new SearchTheAreaView();
        searchTheAreaMenu.display();
    }

    private void displayHeroAbilityMenu() {
        // call HeroAbilityView class
        HeroAbilityView HeroAbilityMenu = new HeroAbilityView();
        HeroAbilityMenu.display();
    }

    private void displayInventoryMenu() {
        // call InventoryMenuView class
        StringBuilder line;
        Game game = HideAndSeek.getCurrentGame();
        Inventory[] inventory = game.getInventory();

        this.console.println("\nLIST OF INVENTORY ITEMS");
        line = new StringBuilder("                  ");
        line.insert(0, "NAME");
        line.insert(15, "TYPE");
        line.insert(22, "AMT");
        line.insert(26, "DESCRIPTION");

        this.console.println(line.toString());

        for (Inventory item : inventory) {
            line = new StringBuilder("                 ");
            line.insert(0, item.getNameB());
            line.insert(15, item.getType());
            line.insert(23, item.getItemCount());
            line.insert(26, item.getDescription());

            //display the line
            this.console.println(line.toString());

        }
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }
        private void inventoryList(String filename) {
        StringBuilder line;
        Game game = HideAndSeek.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        boolean saveToFile = !(filename.isEmpty());
        
       
        //Game game = HideAndSeek.getCurrentGame();
        //InventoryType[] items = Inventory();
        FileWriter outFile = null;

        try {
            if (saveToFile) {
                outFile = new FileWriter(filename);
            }

        outFile.write("\nLIST OF INVENTORY ITEMS\r\n");    
        line = new StringBuilder("                         ");
        line.insert(0, "NAME");
        line.insert(15, "TYPE");
        line.insert(22, "AMT");
        line.insert(26, "DESCRIPTION");

            if (saveToFile) {
                outFile.write(line.toString() + "\r\n");
            } else {
                this.console.println(line.toString());
            }

            for (Inventory item : inventory) {
            line = new StringBuilder("                 ");
            line.insert(0, item.getNameB());
            line.insert(15, item.getType());
            line.insert(23, item.getItemCount());
            line.insert(26, item.getDescription());

                if (saveToFile) {
                    outFile.write(line.toString() + "\r\n");
                    outFile.flush();
                } else {
                    this.console.println(line.toString()); //display the line
                }
            }
        } catch (Exception e2) {
            this.console.println("Error saving Actor List File:" + e2.getMessage());
        } finally {
            if (outFile != null && saveToFile) {
                try {
                    outFile.close();
                } catch (IOException ex2) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex2);
                }
            }
        }
        }
    
    private void inventoryListPrint(){
     String originalMenu = displayMessage;
        displayMessage = ("\n\nEnter the file path for file where the Inventory file "
                + "is to be saved.");
        String filePath = this.getInput();
        while (filePath.length() == 0) {
            this.console.println("Please enter a valid file name.");
            filePath = this.getInput();
        }
        displayMessage = originalMenu;
        inventoryList(filePath);
        this.console.println("Your file has been saved to " + filePath + ".");
    }    
        
        
    private void viewMap() {

        String leftIndicator;
        String rightIndicator;

        Game game = HideAndSeek.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map

        this.console.print("  |");
        for (int column = 0; column < locations[0].length; column++) {
            this.console.print("  " + column + " |"); // print col numbers to side of map
        }
        this.console.println();
        for (int row = 0; row < locations.length; row++) {
            this.console.print(row + " "); // print row numbers to side of map
            for (int column = 0; column < locations[row].length; column++) {
                leftIndicator = " ";
                rightIndicator = " ";
                if (locations[row][column] == map.getCurrentLocation()) {
                    leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "*"; // same as above
                } else if (locations[row][column].isVisited()) {
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                this.console.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    this.console.print(leftIndicator + "??" + rightIndicator);
                } else {
                    this.console.print(leftIndicator + locations[row][column].getScene().getSymbol() + rightIndicator);
                }
            }
            this.console.println("|");

        }

    }

    private void mapSymbols(String filename) {
        StringBuilder line;
        boolean saveToFile = !(filename.isEmpty());
        //Game game = HideAndSeek.getCurrentGame();
        //SceneType[] locations = SceneType();
        FileWriter outFile = null;

        try {
            if (saveToFile) {
                outFile = new FileWriter(filename);
            }

            this.console.println("\nLIST OF MAP SYMBOLS");
            line = new StringBuilder("                                                                                                                                                                                                                              ");
            line.insert(0, "SYMB");
            line.insert(6, "NAME");
            line.insert(28, "DESCRIPTION");

            if (saveToFile) {
                outFile.write(line.toString() + "\r\n");
            } else {
                this.console.println(line.toString());
            }

            for (SceneType scene : SceneType.values()) {
                line = new StringBuilder("                                                                                                                                                                                                                              ");
                line.insert(1, scene.getSymbol());
                line.insert(6, scene.getNameA());
                line.insert(28, scene.getDescription());

                if (saveToFile) {
                    outFile.write(line.toString() + "\r\n");
                    outFile.flush();
                } else {
                    this.console.println(line.toString()); //display the line
                }
            }
        } catch (Exception e) {
            this.console.println("Error saving Actor List File:" + e.getMessage());
        } finally {
            if (outFile != null && saveToFile) {
                try {
                    outFile.close();
                } catch (IOException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void sceneListPrint() {
        String originalMenu = displayMessage;
        displayMessage = ("\n\nEnter the file path for file where the Scene Symbol file "
                + "is to be saved.");
        String filePath = this.getInput();
        while (filePath.length() == 0) {
            this.console.println("Please enter a valid file name.");
            filePath = this.getInput();
        }
        displayMessage = originalMenu;
        mapSymbols(filePath);
        this.console.println("Your file has been saved to " + filePath + ".");
    }
}
