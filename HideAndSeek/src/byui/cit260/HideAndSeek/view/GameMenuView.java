/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.view;

import byui.cit260.HideAndSeek.control.GameControl;
import hideandseek.HideAndSeek;
import java.util.Scanner;

/**
 *
 * @author DragonMaster
 */
public class GameMenuView extends View{


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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;

    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("\n*** startSaveGame function called ***");
    }

    private void moveUp() {
        System.out.println("\n*** moveUp function called ***");
    }

    private void moveDown() {
        System.out.println("\n*** moveDown function called ***");
    }

    private void MoveLeft() {
        System.out.println("\n*** moveLeft function called ***");
    }

    private void moveRight() {
        System.out.println("\n*** moveRight function called ***");
    }

    private void displaySearchTheAreaMenu() {
        SearchTheAreaView searchTheAreaMenu = new SearchTheAreaView();
        searchTheAreaMenu.displaySearchTheAreaView();
    }

    private void displayHeroAbilityMenu() {
         // call HeroAbilityView class
        HeroAbilityView HeroAbilityMenu = new HeroAbilityView();
        HeroAbilityMenu.display();
    }

    private void displayInventoryMenu() {
        // call InventoryMenuView class
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.displayInventoryMenuView();
    }

    private void viewMap() {
        System.out.println("\n*** viewMap function called ***");
    }
    
}
