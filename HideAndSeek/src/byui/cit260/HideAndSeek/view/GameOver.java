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
public class GameOver extends View {

    public GameOver() {
        super("*******************************************************************"
            + "\n*******************************************************************"
            + "\n**                                                               **"
            + "\n**                       Game Over!                              **"
            + "\n**                                                               **"
            + "\n**                   Press 'Q' to quit.                          **"
            + "\n**                                                               **"
            + "\n*******************************************************************"
            + "\n*******************************************************************");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "Y":
                this.startNewGame();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(HideAndSeek.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
