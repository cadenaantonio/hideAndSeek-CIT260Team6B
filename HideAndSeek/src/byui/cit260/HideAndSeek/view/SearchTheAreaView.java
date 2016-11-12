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
public class SearchTheAreaView extends View {

    public SearchTheAreaView() {
            super("\n"
                 + "\n-----------------------------------------------"
                 + "\n| Search the Area Menu                               "
                 + "\n-----------------------------------------------"
                 + "\nD - Disarm Bomb"
                 + "\nC - Capture Villian"
                 + "\nA - Add Hero"
                 + "\nQ - Quit"
                 + "\n-----------------------------------------------");
            
    }

@Override
    public boolean doAction(String value) {   
        value = value.toUpperCase(); // convert value to upper case
        
        switch (value) {
            
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
