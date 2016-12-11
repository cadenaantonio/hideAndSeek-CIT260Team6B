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
public class DoctorsClinic extends View{

    public DoctorsClinic() {
          super("There is no sign of Maul being here.   "
            + "\n Since you at the Dr's office you might"
            + "\n as well get a physical.               "
            + "\n        Gain one Ability Elixer        ");
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
