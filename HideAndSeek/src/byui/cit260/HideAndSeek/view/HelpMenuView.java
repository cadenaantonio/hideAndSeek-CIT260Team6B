/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.view;

import java.util.Scanner;

/**
 *
 * @author Katherine
 */
public class HelpMenuView {
    
    private String promptMessage;

    void displayHelpMenuView() {
        
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
                + "\n| Help Menu                                    "
                + "\n-----------------------------------------------"
                + "\nG - Goal of Game"
                + "\nM - How to move"
                + "\nA - How to use Abilities"
                + "\nB - How to defuse Bomb"
                + "\nC - How to Capture Criminal"
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
            case "G": // Goal of Game
                System.out.println("\nGoal of Game"
                                  +"\nThe Goal of the game is to answer math questions"
                                  +"\nto either disarm the bombs or cature the ciminal that set them."
                                  +"\nFail to disarm the bomb 3 times or capture the villain,"
                                  +"\nthe game is over.");
                break;
            case "M": // How to move 
                System.out.println("\nHow to move"
                                  +"\nEach selection made will move you one space"
                                  +"\nin that direction."
                                  +"\nU - Move Up"
                                  +"\nD - Move Down"
                                  +"\nL - Move Left"
                                  +"\nR - Move Right");
                break;
            case "A": // How to use Abilities 
                System.out.println("\nHow to use Abilities"
                                  +"\nTo use your abillity, you must gain an ally"
                                  +"\nto gain their abillity. Each ablility has a"
                                  +"\ndifferent effect. Each abillity can run out"
                                  +"\nof points but can be refilled with special"
                                  +"\npotions bought at the store.");
                break;
            case "B": // How to defuse Bomb
                System.out.println("\nHow to defuse Bomb"
                                  +"\nTo defuse the bombs, you must have the knife"
                                  +"\nand the ice gun. You will also need to answer a math"
                                  +"\nquestion. Answer it correctly and the bomb"
                                  +"\nwill be defused. Get the answer wrong 3 times,"
                                  +"\nthe bomb will explode and the game is over."
                                  +"\n(add more?)");
                break;
            case "C": // How to capture criminal
                System.out.println("\nHow to capture criminal"
                                  +"\nTo capture the criminal, you will need the Handcuffs."
                                  +"\nYou will also need to answer three math questions to capture him."
                                  +"\nAnswer them correctly, and they will be captured."
                                  +"\nGet one wrong and the criminal will find a new hiding spot.");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;

    }
}
