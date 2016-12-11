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
public class Library extends View{

    public Library() {
          super("Maul is here! Be prepared to fight as "
            + "\n you enter the building and expect    "
            + "\n heavy damage. Durring the battle you "
            + "\n droped you knife and took  heavy     "
            + "\n health loss.                         ");
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
