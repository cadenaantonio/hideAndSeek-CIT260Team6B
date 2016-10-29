/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.HideAndSeek.view;

import byui.cit260.HideAndSeek.control.GameControl;
import hideandseek.HideAndSeek;
import java.util.Scanner;

/**
 *
 * @author Antonio Cadena
 */
public class MainMenuView {

    private String promptMessage;

    void displayMainMenuView() {
        
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
                + "\n| Main Menu                                    "
                + "\n-----------------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Get and Start Saved Game"
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
            case "N": // create
                this.startNewGame();
                break;
            case "G": // get and start an existing game 
                this.startExsitingGame();
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

    private void startNewGame() {
            // create a new game
        GameControl.createNewGame(HideAndSeek.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExsitingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** startHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** startSaveGame function called ***");
    }
    
}
