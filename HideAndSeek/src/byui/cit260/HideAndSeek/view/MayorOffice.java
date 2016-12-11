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
public class MayorOffice extends View{

    public MayorOffice(String message) {
          super(" The Mayor is currently out of the office "
            + "\n due to an unexpected meeting with the    "
            + "\n Chief of Police. He was worried about a  "
            + "\n suspicious package that was left outside "
            + "\n his office. As you examine the package   "
            + "\n you realize that you have a bomb and you "
            + "\n need to disarm it before it goes off.    ");
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