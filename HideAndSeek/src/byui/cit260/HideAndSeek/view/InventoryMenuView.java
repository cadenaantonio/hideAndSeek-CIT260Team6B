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
public class InventoryMenuView extends View{
    
        
    public InventoryMenuView() {
        super("\n"
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
            
            
    }
    @Override
    public boolean doAction(String value) {
            
        value = value.toUpperCase(); // convert value to upper case
        
        switch (value) {
            case "S": //ability potion
                this.useAbilityPotion();
                break;
            case "E": //ability elixer
                this.useAbilityElixer();
                break;
            case "F": //use knife
                this.useKnife();
                break;
            case "D": // use ice gun
                this.useIceGun();
                break;
            case "C": // use handcuffs
                this.useHandcuffs();
                break;
            
            default:
                this.console.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
        
    }

    private void useAbilityPotion() {
        this.console.println("\n*** useAbilityPotion() funtion called***");
    }

    private void useAbilityElixer() {
        this.console.println("\n*** useAbilityElixer() funtion called***");
    }

    private void useKnife() {
        this.console.println("\n*** useKnife() funtion called***");
    }

    private void useIceGun() {
        this.console.println("\n*** useIceGun() funtion called***");
    }

    private void useHandcuffs() {
        this.console.println("\n*** useHandcuffs() funtion called***");
    }
    
}
