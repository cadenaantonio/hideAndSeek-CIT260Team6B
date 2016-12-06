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
public class HelpMenuView extends View {

    public HelpMenuView() {

        super("\n"
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

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert value to upper case

        switch (value) {
            case "G": // Goal of Game
                this.console.println("\nGoal of Game"
                        + "\nThe Goal of the game is to answer math questions"
                        + "\nto either disarm the bombs or cature the ciminal that set them."
                        + "\nFail to disarm the bomb 3 times or capture the villain,"
                        + "\nthe game is over.");
                break;
            case "M": // How to move 
                this.console.println("\nHow to move"
                        + "\nEach selection made will move you one space"
                        + "\nin that direction."
                        + "\nU - Move Up"
                        + "\nD - Move Down"
                        + "\nL - Move Left"
                        + "\nR - Move Right");
                break;
            case "A": // How to use Abilities 
                this.console.println("\nHow to use Abilities"
                        + "\nTo use your abillity, you must gain an ally"
                        + "\nto gain their abillity. Each ablility has a"
                        + "\ndifferent effect. Each abillity can run out"
                        + "\nof points but can be refilled with special"
                        + "\npotions bought at the store.");
                break;
            case "B": // How to defuse Bomb
                this.console.println("\nHow to defuse Bomb"
                        + "\nTo defuse the bombs, you must have the knife"
                        + "\nand the ice gun. You will also need to answer a math"
                        + "\nquestion. Answer it correctly and the bomb"
                        + "\nwill be defused. Get the answer wrong 3 times,"
                        + "\nthe bomb will explode and the game is over."
                        + "\n(add more?)");
                break;
            case "C": // How to capture criminal
                this.console.println("\nHow to capture criminal"
                        + "\nTo capture the criminal, you will need the Handcuffs."
                        + "\nYou will also need to answer three math questions to capture him."
                        + "\nAnswer them correctly, and they will be captured."
                        + "\nGet one wrong and the criminal will find a new hiding spot.");
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;

    }
}
