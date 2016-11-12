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
 * @author Antonio Cadena
 */
public class MainMenuView extends View {
        
            public MainMenuView(){
                super("\n"
                + "\n-----------------------------------------------"
                + "\n| Main Menu                                    "
                + "\n-----------------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Get and Start Saved Game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n-----------------------------------------------");
    }

    @Override    
    public boolean doAction(String value) {
    
        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
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
                System.out.println("\n*** Invalid value *** Try again");
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
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("\n*** startSaveGame function called ***");
    }
    
}
