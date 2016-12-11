/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.view;

import byui.cit260.HideAndSeek.control.GameControl;
import hideandseek.HideAndSeek;

/**
 *
 * @author Antonio Cadena
 */
public class ElectronicStore extends View{

    public ElectronicStore() {
        super("There is nothing left except the bruised "
            + "\n walls keeping the roof from colapsing."
            + "\n You know deep down in your heart that "
            + "\n Maul was here. Continue to search for "
            + "\n him.");
    }
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "Q":
                this.quit();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void quit() {
        GameControl.createNewGame(HideAndSeek.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}

