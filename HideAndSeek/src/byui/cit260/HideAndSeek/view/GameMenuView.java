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
class GameMenuView {

    void displayMenu() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get pplauers name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value =""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid){//loop while an invalid value is entered
            System.out.println("\n"
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
        
            value = keyboard.nextLine();//get next line typed on keyboard
            value = value.trim();//trim off leading and trailing blanks
            
            if (value.length()< 1){// value is blank
               System.out.println("\nInvalid value: Value can not be blank") ;
               continue;
            }
            break; //end the loop
        }
        return value; // return the value entered
    }

    private boolean doAction(String choice) {
    
        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
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
        System.out.println("\n*** displaySearchTheAreaMenu function called ***");
    }

    private void displayHeroAbilityMenu() {
        System.out.println("\n*** displayHeroAbilityMenu function called ***");
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
