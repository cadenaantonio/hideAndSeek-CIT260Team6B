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
public class CentralStation extends View{

    public CentralStation() {
        super("Maul left behind a bomb at this location. "
            + "\n Use your ice gun to disarm the bomb.   ");
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