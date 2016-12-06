/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.view;

import hideandseek.HideAndSeek;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DragonMaster
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = HideAndSeek.getInFile();
    protected final PrintWriter console = HideAndSeek.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false; // set flag to not done
        do {
            //prommp for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {

        boolean valid = false;
        String value = null;
        try {
            while (!valid) {

                this.console.println("\n" + this.displayMessage);

                //
                value = this.keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) {
                    this.console.println("\n*** You must enter a value ***");
                    continue;
                }

                break;
            }

        } catch (Exception e) {
            this.console.println("Error readin input: " + e.getMessage());
        }

        return value;
    }
}
