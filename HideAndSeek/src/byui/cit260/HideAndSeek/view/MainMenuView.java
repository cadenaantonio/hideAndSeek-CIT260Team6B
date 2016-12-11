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

    public MainMenuView() {
        super("\n"
                + "\n-----------------------------------------------"
                + "\n| Main Menu                                    "
                + "\n-----------------------------------------------"
                + "\nN - Start New Game"
                + "\nS - Save Game"
                + "\nG - Get and Start Saved Game"
                + "\nH - Get help on how to play the game"
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
                this.console.println("\n*** Invalid value *** Try again");
                break;
        }

        return false;

    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(HideAndSeek.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExsitingGame() {
        String originalMenu = displayMessage;
        displayMessage = ("\n\nEnter the file path for file where the game "
                + "has been saved.\n");
        String filePath = this.getInput();
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        try {
            displayMessage = originalMenu;
        this.console.println("\nWelcome back.");
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        String originalMenu = displayMessage;
        displayMessage = ("\n\nEnter the file path for file where the game "
                + "is to be saved.");
        String filePath = this.getInput();
        while (filePath.length() == 0) {
            this.console.println("Please enter a valid file name.");
            filePath = this.getInput();
        }

        try {
            //save the game to a specified file
            GameControl.saveGame(HideAndSeek.getCurrentGame(), filePath);
            displayMessage = originalMenu;
        this.console.println("Your file has been saved to " + filePath + ".");
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }

}
