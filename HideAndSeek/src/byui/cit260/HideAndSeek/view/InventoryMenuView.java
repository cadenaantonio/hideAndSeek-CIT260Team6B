/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.view;

import java.util.Scanner;

/**
 *
 * @author Antonio Cadena
 */
public class InventoryMenuView {
    
    void displayInventoryMenuView(){
        
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
        System.out.println("\n*** getMenuOption() funtion called");
        return "N";
    }

    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() funtion called.");
        return true;
    }
        
    public String getInput() {
    
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;

        while (!valid) {
            
            System.out.println("\n"
                 + "\n-----------------------------------------------"
                 + "\n| Inventory Menu                               "
                 + "\n-----------------------------------------------"
                 + "\nS - Ability Potion"
                 + "\nE - Ability Elixir"
                 + "\nF - Knife"
                 + "\nD - Ice Gun"
                 + "\nC - Handcuffs"
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
    
    public void doAction(char choice) {
        switch (choice) {
            case 'S': //ability potion
                this.useAbilityPotion();
                break;
            case 'E': //ability elixer
                this.useAbilityElixer();
                break;
            case 'F': //use knife
                this.useKnife();
                break;
            case 'D': // use ice gun
                this.useIceGun();
                break;
            case 'C': // use handcuffs
                this.useHandcuffs();
                break;
            case 'Q': //  Exit Inventory Menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
    }

    private void useAbilityPotion() {
        System.out.println("\n*** useAbilityPotion() funtion called***");
    }

    private void useAbilityElixer() {
        System.out.println("\n*** useAbilityElixer() funtion called***");
    }

    private void useKnife() {
        System.out.println("\n*** useKnife() funtion called***");
    }

    private void useIceGun() {
        System.out.println("\n*** useIceGun() funtion called***");
    }

    private void useHandcuffs() {
        System.out.println("\n*** useHandcuffs() funtion called***");
    }
    
}
