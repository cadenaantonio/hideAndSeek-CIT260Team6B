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
public class AntoniosPark extends View {

    public AntoniosPark() {
        super("As you pull into the parking lot you catch "
            + "\n a glimps of Maul. Ready for action, you "
            + "\n jump out and try to slap on them        "
            + "\n handcuffs. Unfortunately its not that   "
            + "\n easy. You take a roundhouse kick to the "
            + "\n mandible and pass out. When you come to "
            + "\n Maul is no where in sight. Contineu to  "
            + "\n search for him.");
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