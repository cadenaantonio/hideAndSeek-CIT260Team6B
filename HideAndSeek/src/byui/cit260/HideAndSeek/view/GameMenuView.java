/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.view;

import byui.cit260.HideAndSeek.control.GameControl;
import byui.cit260.HideAndSeek.control.MapControl;
import byui.cit260.HideAndSeek.model.Game;
import byui.cit260.HideAndSeek.model.Location;
import byui.cit260.HideAndSeek.model.Map;
import hideandseek.HideAndSeek;
import java.util.Scanner;

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
                + "\nS - Save Game"
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
            case "S": // save the current game
                this.saveGame();
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

    private void saveGame() {
        this.console.println("\n*** startSaveGame function called ***");
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
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
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
}
