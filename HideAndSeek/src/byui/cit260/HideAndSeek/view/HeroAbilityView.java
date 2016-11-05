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
class HeroAbilityView {

    void displayHeroAbilityView() {
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
                 + "\n|             Hero Ability Menu                "
                 + "\n-----------------------------------------------"
                 + "\nP - Sonar: gives general direction of where villian is."
                 + "\nS - Super-Sense:Able to sense if a bomb is nearby."
                 + "\nW - Mega-Mind:Narrow answer down on math questions"
                 + "\nF - Flight:Fly to location on map."
                 + "\nM - Map"
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
            case "P": // Use Sonar
                this.useSonar();
                break;
            case "S": // Super-Sense
                this.useSuperSense();
                break;
            case "W": //Mega-Mind
                this.useMegaMind();
                break;
            case "F": // Flight
                this.useFlight();
                break;
            case "M": // use map
                this.useMap();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void useSonar() {
        System.out.println("\n*** useSonar() funtion called***");
    }

    private void useSuperSense() {
        System.out.println("\n*** useSuperSense() funtion called***");
    }

    private void useMegaMind() {
    System.out.println("\n*** useMegaMind() funtion called***");
    }

    private void useFlight() {
    System.out.println("\n*** useFlight() funtion called***");
    }

    private void useMap() {
    System.out.println("\n*** useMap() funtion called***");
    }
    
}
