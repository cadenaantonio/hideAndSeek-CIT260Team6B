/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.HideAndSeek.view;

import byui.cit260.HideAndSeek.control.GameControl;
import byui.cit260.HideAndSeek.model.Player;
import java.util.Scanner;

/**
 *
 * @author DragonMaster
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when the view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n***************************************************************"
                + "\n***************************************************************"
                + "\n***************************************************************"
                + "\n*-----A super-villain, Maul, is loose in the streets.-----*"
                + "\n*------He has planted bombs around The Emerald City.------*"
                + "\n*----Can you help us catch him and stop his evil plan?----*"
                + "\n*-----You’ll have to solve equations set on the bombs.-----*"
                + "\n*----As you go forward you will have the chance to gain----*"
                + "\n*--allies as well as their special abilities to help you.--*"
                + "\n*---We hope that YOU will be able to save our fair city!---*"
                + "\n***************************************************************"
                + "\n***************************************************************"
                + "\n***************************************************************"
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do {
            //promptfor and get players name
            this.promptMessage = "\nPlease enter your name: "; //added this because without it, the game looks like it just froze. Expecting an entry without a prompt is a bad idea.
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quite
            {
                return; // exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);
        }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value =""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid){//loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
        
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

    private boolean doAction(String playersName) {
        if(playersName.length()<2){
            System.out.println("\nInvalid players name: "
                        + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
    Player player = GameControl.createPlayer(playersName);

            if(player == null){// in unsuccessful
                System.out.println("\nError creating the player.");
                return false;
            }       
        //display next view
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n=========================================="
                            +"\n Welcome to the game " + player.getName()
                            +"\n We hope you have a lot of fun!"
                            +"\n========================================"
                            );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
        
    }

