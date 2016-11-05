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
class SearchTheAreaView {

    void displaySearchTheAreaView() {
        boolean done = false; // set flag to not done
        do{
            //prommp for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
        }while (!done);
    }

    private String getMenuOption() {
            Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;

        while (!valid) {
            
            System.out.println("\n"
                 + "\n-----------------------------------------------"
                 + "\n| Search the Area Menu                               "
                 + "\n-----------------------------------------------"
                 + "\nD - Disarm Bomb"
                 + "\nC - Capture Villian"
                 + "\nA - Add Hero"
                 + "\nQ - Quit"
                 + "\n-----------------------------------------------");
            
            
            
            selection = keyboard.nextLine();
            selection = selection.trim();

                if (selection.length() < 1){
                    System.out.println("\n***Invalid selection *** Try Again");
                }

                break;
        }

        return selection;
    }

    private boolean doAction(String choice) {   
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            
            case "D": // disarm bomb
                this.disarmBomb();
                break;
            case "C": // captureVillian
                this.captureVillian();
                break;
            case "A": //Add Hero   
                this.addHero();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
      
    }

    private void disarmBomb() {
        System.out.println("\n*** disarmBomb function called ***");
    }

    private void captureVillian() {
        System.out.println("\n*** captureVillian function called ***");    
    }

    private void addHero() {
        System.out.println("\n*** addHero function called ***");    
    }
    
}
